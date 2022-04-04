package com.alexandre.mainionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexandre.mainionic.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}
