package com.fabhotel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Section {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sectionID;
	
	private String sectionName;
	
	@ManyToOne
	private ClassSchool classSchool;
	

	public Long getSectionID() {
		return sectionID;
	}

	public void setSectionID(Long sectionId) {
		this.sectionID = sectionId;
	}

	
	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public ClassSchool getClassSchool() {
		return classSchool;
	}

	public void setClassSchool(ClassSchool classSchool) {
		this.classSchool = classSchool;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Section[id=%d, sectionCode='%s', sectionName='%s']", sectionID,sectionName);
	}
	
}
