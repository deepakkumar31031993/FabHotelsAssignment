package com.fabhotel.model;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class TimeTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long timetableId;
	
	@OneToOne
	private ClassSchool classSchool;
	
	@OneToOne
	private Section section;

	@ElementCollection
	List<Period> periods;
	
	@Temporal(TemporalType.DATE)
	Date date;
	
	public Long getTimetableId() {
		return timetableId;
	}

	public void setTimetableId(Long timetableId) {
		this.timetableId = timetableId;
	}

	public ClassSchool getClassSchool() {
		return classSchool;
	}

	public void setClassSchool(ClassSchool classSchool) {
		this.classSchool = classSchool;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public List<Period> getPeriods() {
		return periods;
	}

	public void setPeriods(List<Period> periods) {
		this.periods = periods;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
