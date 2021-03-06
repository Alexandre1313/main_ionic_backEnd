package com.alexandre.mainionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexandre.mainionic.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
