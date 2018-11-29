package com.fabhotel.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fabhotel.model.Holiday;
import com.fabhotel.service.HolidayService;

@RestController
public class HolidayController {

	@Autowired
	HolidayService holidayService;
	
	@PostMapping("/school/holidays/")
	public void addHoliday(@RequestBody Holiday holiday) {
		holidayService.addHoliday(holiday);
	}
	
	@GetMapping("/school/holidays/")
	public  Map<Date, String> getHolidays() {
		return holidayService.getAllHolidays();
	}
	
	@DeleteMapping("/school/holidays/")
	public void deleteHoliday(@RequestBody Holiday holiday) {
		holidayService.deleteHoliday(holiday);
	}
	 
}
