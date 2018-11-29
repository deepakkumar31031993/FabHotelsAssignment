package com.fabhotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabhotel.model.Section;
import com.fabhotel.repository.SectionRepository;

@Service
public class SectionService {
	
	@Autowired
	SectionRepository sectionRepo;
	
	public void addSection(Section section) {
		sectionRepo.save(section);
	}

	public Section getSectionByName(String sectionName) {
		
		return (Section) sectionRepo.findBySectionName(sectionName);
	}

	public void deleteSectionById(Long id) {
		sectionRepo.deleteById(id);
		
	}

	public void updateSectionById(Section section) {
		sectionRepo.save(section);
	}

}
