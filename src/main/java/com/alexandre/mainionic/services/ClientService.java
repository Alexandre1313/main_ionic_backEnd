package com.alexandre.mainionic.services;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandre.mainionic.domain.Client;
import com.alexandre.mainionic.repositories.ClientRepository;
import com.alexandre.mainionic.services.exceptions.ObjectNotFoundException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repo;

	public Client findById(Integer id) {
		Optional<Client> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto de ID " + id + " não encontrado" + ", tipo: " + 
		Client.class.getName()));
	}

}
