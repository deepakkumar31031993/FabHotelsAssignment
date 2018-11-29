package com.fabhotel.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fabhotel.model.ClassSchool;
import com.fabhotel.service.ClassService;

@RestController
public class ClassController {

	@Autowired
	ClassService classService;
	
	@PostMapping("/session/class")
	public void addClass(@RequestBody ClassSchool classSchool) {
		
		classService.addClass(classSchool);
	}
	
	@GetMapping("/session/class/{name}")
	public ClassSchool getClassSchool(@PathParam(value = "name") String name) {
		return classService.getClassSchool(name);
	}
	
	@DeleteMapping("/session/class/{id}")
	public void deleteById(@PathParam(value="id" )int id) {
		classService.deleteClassSchool(id);
	}
	
	@PutMapping("/session/class/")
	public void updateClass(@RequestBody ClassSchool classSchool) {
		classService.updateClass(classSchool);
	}
}
