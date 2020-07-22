package com.example.Pojo;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "flight")
public class Flight {

	@Id
	@GeneratedValue
	private int id;

	private String destination;
	private String duration;

	private LocalDate flightDate;
	private String flightNumber;
	private LocalTime flightTime;

	private String origin;

	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "inventoryId")
	private int inventoryId;

	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "fareId")
	private int fareId;

	//@JoinColumn(name = "flightInfoId")
	private long flightInfoId;

}
