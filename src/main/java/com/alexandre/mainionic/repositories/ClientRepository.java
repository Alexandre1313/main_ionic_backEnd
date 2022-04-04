package com.alexandre.mainionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexandre.mainionic.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
