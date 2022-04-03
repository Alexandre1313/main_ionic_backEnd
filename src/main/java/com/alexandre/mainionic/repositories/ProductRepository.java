package com.alexandre.mainionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexandre.mainionic.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
