package com.alexandre.mainionic.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.alexandre.mainionic.domain.Product;
import com.alexandre.mainionic.dto.ProductDTO;
import com.alexandre.mainionic.resources.utils.URL;
import com.alexandre.mainionic.services.ProductService;

@RestController
@RequestMapping(value="/produtos")
public class ProductResources {
	
	@Autowired
	private ProductService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Product> findById(@PathVariable Integer id) {
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Page<ProductDTO>> findPage(
			@RequestParam(value="name", defaultValue="") String name, 
			@RequestParam(value="categories", defaultValue="") String categories, 
			@RequestParam(value="page", defaultValue="0") Integer page, 
			@RequestParam(value="linesPerPage", defaultValue="24")Integer linesPerPage,
			@RequestParam(value="orderBy", defaultValue="name")String orderBy, 
			@RequestParam(value="direction", defaultValue="ASC")String direction) 
	{
		String nameDecoded = URL.decodeParam(name);
		List<Integer> ids = URL.decodIntList(categories);
		Page<Product> list = service.search(nameDecoded, ids, page, linesPerPage, 
				orderBy, direction);
		Page<ProductDTO> listDTO = list.map(o -> new ProductDTO(o));
		return ResponseEntity.ok().body(listDTO);
	}
}
