package com.alexandre.mainionic.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.alexandre.mainionic.domain.Category;
import com.alexandre.mainionic.repositories.CategoryRepository;
import com.alexandre.mainionic.services.exceptions.DataIntegrityException;
import com.alexandre.mainionic.services.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repo;

	public Category findById(Integer id) {
		Optional<Category> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto de ID " + id + " não encontrado" + ", tipo: " + 
		Category.class.getName()));
	}

	public Category insert(Category obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Category update(Category obj) {
		findById(obj.getId());
		return repo.save(obj);
	}

	public void delete(Integer id) {
		findById(id);
		try {
			repo.deleteById(id);
		}catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir uma categoria que"
					+ " possui produtos atrelados à mesma!");
		}
	}

}
