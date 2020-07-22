package com.example.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Pojo.Flight;
import com.example.Repository.FlightRepository;

@Service
public class FlightService {

	@Autowired
	private FlightRepository flightRepository;

	public Iterable<Flight> findAllFlights() {
		return flightRepository.findAll();
	}

	public Flight saveFlight(Flight flight) {
		return flightRepository.save(flight);
	}

	public Flight updateFlight(Flight flight, Integer id) {
		flight.setId(id);
		return flightRepository.save(flight);
	}

	public String deleteFlight(Integer id) {
		
		System.out.println("dtl starting");
		Optional<Flight> flight = flightRepository.findById(id);
		Flight fly = flight.get();
		String num = fly.getFlightNumber();
		flightRepository.delete(flight.get());
		System.out.println("Deleted flight number is: " +num);
		return num;
	}
	
	public Optional<Flight> findFlightById(Integer id) {

		Optional<Flight> flight = flightRepository.findById(id);
		return Optional.ofNullable(flight.get());
	}
	

}








































/*
 * @Autowired private FlightRepository flightrepository;
 * 
 * public Stream<Flight> search(SearchFlight searchFlight) {
 * 
 * List<Flight> flights =
 * flightrepository.findByFlightDateAndOriginAndDestination(searchFlight.
 * getFlightDate(), searchFlight.getOrigin(), searchFlight.getDestination());
 * 
 * Stream<Flight> searchReasults = flights.stream() .filter(flight ->
 * flight.getInventory().getCount() >= searchFlight.getNumberOfPassengers());
 * 
 * return searchReasults; }
 */
