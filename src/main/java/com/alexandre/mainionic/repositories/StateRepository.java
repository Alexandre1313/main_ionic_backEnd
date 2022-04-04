package com.alexandre.mainionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexandre.mainionic.domain.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
