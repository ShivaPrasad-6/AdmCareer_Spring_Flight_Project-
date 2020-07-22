package com.example.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Pojo.Fare;

@Repository
public interface FareRepository extends CrudRepository<Fare, Integer> {
	
	Iterable<Fare> findAll();
}
