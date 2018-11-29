package com.fabhotel.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fabhotel.model.TimeTable;
import com.fabhotel.service.TimeTableService;

@RestController
public class TimeTableController {

	@Autowired
	TimeTableService timetableService;
	
	@PostMapping("/session/timetable/class/")
	public void addTimeTable(@RequestBody TimeTable timetable) {
		
		timetableService.addTimeTable(timetable);
	}
	
	@GetMapping("/session/timetable/class/{classSchoolId}")
	public TimeTable getTimeTable(@PathParam(value = "classSchoolId") Long classSchoolId) {
		return timetableService.getTimeTableForClassSchool(classSchoolId);
	}
	
	
	
}
