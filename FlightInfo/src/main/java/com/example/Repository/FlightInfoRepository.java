package com.example.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Pojo.FlightInfo;

@Repository
public interface FlightInfoRepository extends CrudRepository<FlightInfo, Long>{
	
	Iterable<FlightInfo> findAll();

}
