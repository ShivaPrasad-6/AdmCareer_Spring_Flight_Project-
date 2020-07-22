package com.example.Repository;

import java.time.LocalDate;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Pojo.Flight;


@Repository
public interface FlightRepository extends CrudRepository<Flight, Integer> {

	Iterable<Flight> findAll();
	
	Iterable<Flight> findByOriginandFlightDate(String origin, LocalDate flightDate);
	
}






























/*
 * public List<Flight> findByFlightDateAndOriginAndDestination(LocalDate
 * flightDate, String origin, String destination);
 * 
 * public Flight findByFlightNumberAndFlightDateAndFlightTime(String
 * flightNumber, LocalDate flightDate, LocalTime flightTime);
 */