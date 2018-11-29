package com.fabhotel.service;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fabhotel.model.Holiday;

@Service
public class HolidayService {


	
	public Map<Date, String> getAllHolidays(){
		if(Holiday.getHolidays().size() == 0) 
			System.out.println("No holidays Added ");
		
		return Holiday.getHolidays();
	}

	
	public void addHoliday(Holiday holiday) {
		// TODO Auto-generated method stub
	
		if(holiday!= null) {
			Holiday.getHolidays().put( holiday.getDate(), holiday.getName());
		}
	}


	public void deleteHoliday(Holiday holiday) {
		// TODO Auto-generated method stub
		Holiday.getHolidays().remove(holiday.getDate());
	}

	
}
