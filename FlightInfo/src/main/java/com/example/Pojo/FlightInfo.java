package com.example.Pojo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="flightInfo")
public class FlightInfo {
	
	@Id
	@GeneratedValue
	private long flightInfoId;
	private String flightNumber;
	private String flightType;
	private int numberofSeats;

}
