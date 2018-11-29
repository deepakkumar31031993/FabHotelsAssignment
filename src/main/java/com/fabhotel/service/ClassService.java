package com.fabhotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabhotel.model.ClassSchool;
import com.fabhotel.repository.ClassRepository;

@Service
public class ClassService {

	@Autowired
	ClassRepository classRepo;
	
	
	public void addClass(ClassSchool classSchool) {
		classRepo.save(classSchool);
	}

	public ClassSchool getClassSchool(String name) {
		return classRepo.findByClassName(name);
		
	}

	public void deleteClassSchool(int id) {
		classRepo.deleteById(id);
	}

	public void updateClass(ClassSchool classSchool) {
		classRepo.save(classSchool);
		
	}

}
