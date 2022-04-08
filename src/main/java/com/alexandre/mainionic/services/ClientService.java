package com.alexandre.mainionic.services;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexandre.mainionic.domain.Address;
import com.alexandre.mainionic.domain.City;
import com.alexandre.mainionic.domain.Client;
import com.alexandre.mainionic.domain.enums.ClientType;
import com.alexandre.mainionic.dto.ClientDTO;
import com.alexandre.mainionic.dto.ClientNewDTO;
import com.alexandre.mainionic.repositories.AddressRepository;
import com.alexandre.mainionic.repositories.CityRepository;
import com.alexandre.mainionic.repositories.ClientRepository;
import com.alexandre.mainionic.services.exceptions.DataIntegrityException;
import com.alexandre.mainionic.services.exceptions.ObjectNotFoundException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repo;
	
	@Autowired
	private CityRepository cyrepo;
	
	@Autowired
	private AddressRepository adrepo;

	public Client find(Integer id) {
		Optional<Client> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Cliente de ID " + id + " não encontrado" + ", tipo: " + 
		Client.class.getName()));
	}
	
	private City findCity(Integer id) {
		Optional<City> obj = cyrepo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Cidade de ID " + id + " não encontrada" + ", tipo: " + 
		City.class.getName()));
	}

	public Client update(Client obj) {
		Client newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}
	
	@Transactional
	public Client create(Client obj) {
		obj.setId(null);
		obj = repo.save(obj);
		adrepo.saveAll(obj.getAddresses());
		return obj;
	}

	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		}catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir um cliente que"
					+ " possui relacionamentos com outras entidades do banco de dados!");
		}
	}

	public List<Client> findAll() {
		return repo.findAll();
	}
	
	public Page<Client> findPage(Integer page, Integer linesPerPage,
			String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, 
				Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
	public Client fromDTO(ClientDTO objDTO) {
		return new Client(objDTO.getId(), objDTO.getName(), objDTO.getEmail(), null, null);
	}
	
	public Client fromDTO(ClientNewDTO objDTO) {
		Client client = new Client(null, objDTO.getName(), objDTO.getEmail(), 
				objDTO.getCpfCnpj(), ClientType.toEnum(objDTO.getType()));
		City city = findCity(objDTO.getCity_id());
		Address address = new Address(null, objDTO.getStreet(), objDTO.getNumber(), 
				objDTO.getComplement(), objDTO.getDistrict(), objDTO.getCep(), 
				client, city);
		client.getAddresses().add(address);
		client.getPhones().add(objDTO.getPhone1());
		if(objDTO.getPhone2() != null) {
			client.getPhones().add(objDTO.getPhone2());
		}
		if(objDTO.getPhone3() != null) {
			client.getPhones().add(objDTO.getPhone3());
		}
		return client;
	}
	
	private void updateData(Client newObj, Client obj) {
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
	}

}
