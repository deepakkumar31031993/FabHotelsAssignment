package com.fabhotel.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fabhotel.model.Teacher;
import com.fabhotel.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	TeacherService teacherService;
	
	@PostMapping("/session/teacher/")
	public void addTeacher(@RequestBody Teacher teacher) {
		
		teacherService.addTeacher(teacher);
	}
	
	@GetMapping("/session/teacher/{id}")
	public Teacher getClassSchool(@PathParam(value = "id") Long id) {
		return teacherService.getTeacher(id);
	}
	
	@DeleteMapping("/session/teacher/{id}")
	public void deleteById(@PathParam(value="id" )Long id) {
		teacherService.deleteTeacher(id);
	}
	
	@PutMapping("/session/teacher/")
	public void updateClass(@RequestBody Teacher teacher) {
		teacherService.updateTeacher(teacher);
	}
}
