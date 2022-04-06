package com.alexandre.mainionic.services;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandre.mainionic.domain.Request;
import com.alexandre.mainionic.repositories.RequestRepository;
import com.alexandre.mainionic.services.exceptions.ObjectNotFoundException;

@Service
public class RequestService {

	@Autowired
	private RequestRepository repo;

	public Request findById(Integer id) {
		Optional<Request> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto de ID " + id + " não encontrado" + ", tipo: " + 
		Request.class.getName()));
	}

}
