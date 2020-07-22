package com.example.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name= "airline_info")
public class AirlineInfo {
	
	@Id
	@GeneratedValue
	private long airlineId;
	private long airlineLogo;
	private long nameOfAirline;
	
}
