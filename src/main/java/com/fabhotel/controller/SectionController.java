package com.fabhotel.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fabhotel.model.Section;
import com.fabhotel.service.SectionService;

@RestController
public class SectionController {

	@Autowired
	SectionService sectionService;
	
	@PostMapping("/session/class/section")
	public void addSection(@RequestBody Section section) {
		sectionService.addSection(section);
	}
	
	@GetMapping("/session/class/section/{sectionName}")
	public Section getClassSchool(@PathParam(value = "sectionName") String sectionName) {
		return sectionService.getSectionByName(sectionName);
	}
	
	@DeleteMapping("/session/class/section/{id}")
	public void deleteSectionById(@PathParam(value="id" )Long id) {
		sectionService.deleteSectionById(id);
	}
	
	@PutMapping("/session/class/section/")
	public void updateClass(@RequestBody Section section) {
		sectionService.updateSectionById(section);
	}
}
