package com.fabhotel.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fabhotel.model.Subject;
import com.fabhotel.service.SubjectService;

@RestController
public class SubjectController {

	@Autowired
	SubjectService subjectService;
	
	@PostMapping("/session/class/subject/")
	public void addSubject(@RequestBody Subject subject) {
		subjectService.addSubject(subject);
	}
	
	@GetMapping("/session/class/subject/{subjectName}")
	public Subject getsubjectByName(@PathParam(value = "subjectName") String subjectName) {
		return subjectService.getsubjectByName(subjectName);
	}
	
	@DeleteMapping("/session/class/subject/{subjectId}")
	public void deleteSubjectById(@PathParam(value="subjectId" )Long subjectId) {
		subjectService.deleteSubjectById(subjectId);
	}
	
	@PutMapping("/session/class/subject/")
	public void updateSubject(@RequestBody Subject subject) {
		subjectService.updateSubject(subject);
	}
}
