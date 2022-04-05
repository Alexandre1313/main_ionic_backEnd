package com.alexandre.mainionic.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alexandre.mainionic.domain.Client;
import com.alexandre.mainionic.services.ClientService;

@RestController
@RequestMapping(value="/clientes")
public class ClientResources {
	
	@Autowired
	private ClientService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Client> findById(@PathVariable Integer id) {
		Client obj = service.searchById(id);
		return ResponseEntity.ok().body(obj);
	}
}
