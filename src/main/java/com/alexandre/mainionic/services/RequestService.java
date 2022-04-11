package com.alexandre.mainionic.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.alexandre.mainionic.domain.OrderItems;
import com.alexandre.mainionic.domain.PaymentWithTicket;
import com.alexandre.mainionic.domain.Request;
import com.alexandre.mainionic.domain.enums.PaymentStatus;
import com.alexandre.mainionic.repositories.OrderItemsRepository;
import com.alexandre.mainionic.repositories.PaymentRepository;
import com.alexandre.mainionic.repositories.ProductRepository;
import com.alexandre.mainionic.repositories.RequestRepository;
import com.alexandre.mainionic.services.exceptions.ObjectNotFoundException;

@Service
public class RequestService {

	@Autowired
	private RequestRepository repo;
	
	@Autowired
	private TicketService ticketService;
	
	@Autowired
	private PaymentRepository prepo;
	
	@Autowired
	private ProductRepository prorepo;
	
	@Autowired
	private OrderItemsRepository oirepo;

	public Request findById(Integer id) {
		Optional<Request> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Pedido de ID " + id + " não encontrado" + ", tipo: " + 
		Request.class.getName()));
	}

	public Request create(Request obj) {
		obj.setId(null);
		obj.setInstant(new Date());
		obj.getPayment().setPaymentStatus(PaymentStatus.PENDENTE);
		obj.getPayment().setRequest(obj);
		if(obj.getPayment() instanceof PaymentWithTicket) {
			PaymentWithTicket pwt = (PaymentWithTicket) obj.getPayment();
			ticketService.fillInPaymentWithTicket(pwt, obj.getInstant()); 
		}
		obj = repo.save(obj);
		prepo.save(obj.getPayment());
		for(OrderItems i: obj.getItems()) {
			i.setDiscount(0.0);
			i.setPrice(prorepo.findById(i.getProduct().getId()).get().getPrice());
			i.setRequest(obj);
		}
		oirepo.saveAll(obj.getItems());
		return obj;
	}

	public List<Request> findAll() {
		return repo.findAll();
	}

}
