package com.fabhotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabhotel.model.Teacher;
import com.fabhotel.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	TeacherRepository teacherRepo;
	
	
	public void addTeacher(Teacher teacher) {
		teacherRepo.save(teacher);
	}

	public Teacher getTeacher(Long id) {
		return teacherRepo.findByTeacherId(id);
	}

	public void deleteTeacher(Long id) {
		teacherRepo.delete(teacherRepo.findByTeacherId(id));
	}

	public void updateTeacher(Teacher teacher) {
		teacherRepo.save(teacher);
	}

}
