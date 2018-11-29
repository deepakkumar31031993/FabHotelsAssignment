package com.fabhotel.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ClassSchool {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int classID;
	
	private String className;
	
	@OneToMany(mappedBy="classSchool",  cascade = CascadeType.ALL)
    private List<Section> sections;

	@OneToMany(mappedBy = "classSchool", cascade = CascadeType.ALL)
	private List<Subject> subjects = new ArrayList<>();

	public int getClassID() {
		return classID;
	}

	public void setClassID(int classID) {
		this.classID = classID;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder(
				String.format("AcademicClass[id=%d, className='%s']", classID, className));
		if (sections.size() > 0) {
			for (Section section : sections) {
				result.append(String.format("Section[id=%d,  name='%s']%n", section.getSectionID(),
						 section.getSectionName()));
			}
		}
		if (subjects.size() > 0) {
			for (Subject subject : subjects) {
				result.append(String.format("Subject[id=%d,  name='%s']%n", subject.getSubjectId(),
						 subject.getSubjectName()));
			}
		}
		return result.toString();
	}
}
