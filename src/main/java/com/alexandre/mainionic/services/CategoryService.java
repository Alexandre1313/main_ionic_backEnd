package com.alexandre.mainionic.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandre.mainionic.domain.Category;
import com.alexandre.mainionic.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repo;

	public Category searchById(Integer id) {
		Optional<Category> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
