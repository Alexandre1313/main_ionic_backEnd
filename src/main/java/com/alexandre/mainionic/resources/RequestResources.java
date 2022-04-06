package com.alexandre.mainionic.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alexandre.mainionic.domain.Request;
import com.alexandre.mainionic.services.RequestService;

@RestController
@RequestMapping(value="/pedidos")
public class RequestResources {
	
	@Autowired
	private RequestService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Request> findById(@PathVariable Integer id) {
		Request obj = service.searchById(id);
		return ResponseEntity.ok().body(obj);
	}
}
