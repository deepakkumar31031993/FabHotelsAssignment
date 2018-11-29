package com.fabhotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabhotel.model.Subject;
import com.fabhotel.repository.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	SubjectRepository subjectRepo;
	
	public void addSubject(Subject subject) {
		subjectRepo.save(subject);
	}

	public Subject getsubjectByName(String subjectName) {
		
		return subjectRepo.findBySubjectName(subjectName);
	}

	public void deleteSubjectById(Long id) {
		subjectRepo.deleteById(id);
	}

	public void updateSubject(Subject subject) {
		subjectRepo.save(subject);
	}

}
