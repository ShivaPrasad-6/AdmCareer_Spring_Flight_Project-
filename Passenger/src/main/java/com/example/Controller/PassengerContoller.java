package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Pojo.Passenger;
import com.example.Service.PassengerService;



@RestController
@RequestMapping("/Passenger")
public class PassengerContoller {
	
	@Autowired
	private PassengerService passengerservice;
	
	@RequestMapping("/getAllPassengers")
	public Iterable<Passenger> getAllPssenegrs() {
		return passengerservice.allPassengers();
	}
	
}
