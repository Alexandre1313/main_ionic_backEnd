package com.alexandre.mainionic.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.alexandre.mainionic.domain.Category;
import com.alexandre.mainionic.domain.Product;
import com.alexandre.mainionic.repositories.CategoryRepository;
import com.alexandre.mainionic.repositories.ProductRepository;
import com.alexandre.mainionic.services.exceptions.ObjectNotFoundException;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	@Autowired
	private CategoryRepository carepo;

	public Product findById(Integer id) {
		Optional<Product> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Produto de ID " + id + " não encontrado" + ", tipo: " + 
		Product.class.getName()));
	}
	
	public Page<Product> search(String name, List<Integer> ids, Integer page,
			Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction),
				orderBy);
		List<Category> categories = carepo.findAllById(ids);
		return repo.findDistinctByNameContainingAndCategoryIn(name, categories, pageRequest);	
	}

}
