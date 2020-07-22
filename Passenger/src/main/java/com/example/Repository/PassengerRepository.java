package com.example.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Pojo.Passenger;

@Repository
public interface PassengerRepository extends CrudRepository<Passenger, Long>{
	
	Iterable<Passenger> findAll();

}
