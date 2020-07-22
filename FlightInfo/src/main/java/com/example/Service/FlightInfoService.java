package com.example.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Pojo.FlightInfo;
import com.example.Repository.FlightInfoRepository;

@Service
public class FlightInfoService {

	@Autowired
	private FlightInfoRepository flightinfoRepository;

	public Iterable<FlightInfo> findAllFlightInfo() {
		return flightinfoRepository.findAll();
	}

	public FlightInfo saveFlightInfo(FlightInfo flightinfo) {
		return flightinfoRepository.save(flightinfo);
	}

	public FlightInfo updateFlightInfo(FlightInfo flightinfo, Long flightInfoId) {
		flightinfo.setFlightInfoId(flightInfoId);
		return flightinfoRepository.save(flightinfo);
	}

	public String deleteFlightInfo(Long flightInfoId) {

		System.out.println("dtl starting");
		Optional<FlightInfo> flightinfo = flightinfoRepository.findById(flightInfoId);
		FlightInfo fly = flightinfo.get();
		String num = fly.getFlightNumber();
		flightinfoRepository.delete(flightinfo.get());
		System.out.println("Deleted flight number is: " + num);
		return num;
	}

	public Optional<FlightInfo> findFlightInfoById(Long flightInfoId) {

		Optional<FlightInfo> flight = flightinfoRepository.findById(flightInfoId);
		return Optional.ofNullable(flight.get());
	}

}
