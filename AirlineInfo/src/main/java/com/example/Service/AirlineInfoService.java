package com.example.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Pojo.AirlineInfo;
import com.example.Repository.AirlineInfoRepository;

@Service
public class AirlineInfoService {
	
	@Autowired
	private AirlineInfoRepository airlineinforepository;
	
	public Iterable<AirlineInfo> airlineInfo() {
		return airlineinforepository.findAll();
	}
	
	public AirlineInfo saveAirlineInfo(AirlineInfo airlineId) {
		return airlineinforepository.save(airlineId);
	}

	public AirlineInfo updateAirlineInfo(AirlineInfo airlineInfo, Long airlineId) {
		airlineInfo.setAirlineId(airlineId);
		return airlineinforepository.save(airlineInfo);
	}

	public Long deleteAirlineInfo(Long airlineId) {

		System.out.println("dtl starting");
		Optional<AirlineInfo> airlineInfo = airlineinforepository.findById(airlineId);
		AirlineInfo fly = airlineInfo.get();
		Long num = fly.getNameOfAirline();
		airlineinforepository.delete(airlineInfo.get());
		System.out.println("Deleted flight number is: " + num);
		return num;
	}

	public Optional<AirlineInfo> findAirlineInfoById(Long airlineId) {

		Optional<AirlineInfo> airlineInfo = airlineinforepository.findById(airlineId);
		return Optional.ofNullable(airlineInfo.get());
	}
}
