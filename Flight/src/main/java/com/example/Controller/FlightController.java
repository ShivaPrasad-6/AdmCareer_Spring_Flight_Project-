
package com.example.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Pojo.Flight;
import com.example.Service.FlightService;

@RestController
@RequestMapping("/Flight")
public class FlightController {

	@Autowired
	private FlightService flightservice;

	@GetMapping("/getAllFlights")
	public Iterable<Flight> getAllFlights() {
		return flightservice.findAllFlights();
	}

	@PostMapping("/saveFlight")
	public Flight saveFlight(@RequestBody Flight flight) {
		return flightservice.saveFlight(flight);
	}

	@PutMapping("/updateFlight/{id}")

	public Flight updateFlightById(@RequestBody Flight flight, @PathVariable("id") Integer id) {
		return flightservice.updateFlight(flight, id);

	}

	@DeleteMapping("/deleteFlight/{id}")
	public String deleteFlight(@PathVariable("id") Integer id) {
		return flightservice.deleteFlight(id);
	}
	
	@GetMapping("/findOneInAll/{id}")
	public Optional<Flight> findFlightInAll(@PathVariable("id") Integer id)
	{
		return flightservice.findFlightById(id);
		
	}
}












































/*
 * @RequestMapping("/book") public String
 * bookTicket(@RequestParam("flightNumber") String flightNumber) {
 * System.out.println("====> " + flightNumber); return null; }
 */

/*
 * @GetMapping public Stream<Flight> listAll() { Stream<Flight> flights =
 * flightservice .search(new SearchFlight(LocalDate.of(2020, 8, 21),
 * "HYDERABAD", "DELHI", 8)); return flights; }
 */
