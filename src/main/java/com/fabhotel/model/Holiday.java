package com.fabhotel.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Holiday {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	private String name;
	
	@Temporal(TemporalType.DATE)  //yyyy-mm-dd
	private Date date ;
	
	private static Map<Date, String> holidays = new HashMap<Date, String>();
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public static Map<Date, String> getHolidays() {
		return holidays;
	}


	public static void setHolidays(Map<Date, String> holidays) {
		Holiday.holidays = holidays;
	}

		
}
