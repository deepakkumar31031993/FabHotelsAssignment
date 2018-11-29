package com.fabhotel.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long subjectId;
	
	private String subjectName;
	
	@ManyToOne
	private ClassSchool classSchool;
	
	
	@OneToMany(mappedBy="subject", cascade = CascadeType.ALL)
	List<Teacher> teachers;


	public Long getSubjectId() {
		return subjectId;
	}


	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}


	public String getSubjectName() {
		return subjectName;
	}


	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}


	public ClassSchool getClassSchool() {
		return classSchool;
	}


	public void setClassSchool(ClassSchool classSchool) {
		this.classSchool = classSchool;
	}


	public List<Teacher> getTeachers() {
		return teachers;
	}


	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	
}
