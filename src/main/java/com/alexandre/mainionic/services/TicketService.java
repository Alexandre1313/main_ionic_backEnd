package com.alexandre.mainionic.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.alexandre.mainionic.domain.PaymentWithTicket;

@Service
public class TicketService {
	
	public void fillInPaymentWithTicket(PaymentWithTicket pwt, Date instant) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(instant);
		cal.add(Calendar.DAY_OF_MONTH, 14);
		pwt.setDueDate(cal.getTime());
	}

}
