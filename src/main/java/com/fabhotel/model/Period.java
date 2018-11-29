package com.fabhotel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;


@PropertySource("classapth:global.properties")
@Entity
public class Period {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long periodId;
	
	private String periodNumber;
	@OneToOne
	private Teacher teacherAssigned;
	
	@Value("${period-duration}")
	static int periodDuration;
	
	@Value("${interval-duration}")
	static int breakDuration;

	public String getPeriodNumber() {
		return periodNumber;
	}

	public void setPeriodNumber(String periodNumber) {
		this.periodNumber = periodNumber;
	}

	public static int getPeriodDuration() {
		return periodDuration;
	}

	public static void setPeriodDuration(int periodDuration) {
		Period.periodDuration = periodDuration;
	}

	public static int getBreakDuration() {
		return breakDuration;
	}

	public static void setBreakDuration(int breakDuration) {
		Period.breakDuration = breakDuration;
	}

	public Teacher getTeacherAssigned() {
		return teacherAssigned;
	}

	public void setTeacherAssigned(Teacher teacherAssigned) {
		this.teacherAssigned = teacherAssigned;
	}

	public Long getPeriodId() {
		return periodId;
	}

	public void setPeriodId(Long periodId) {
		this.periodId = periodId;
	}
	
	
	
}
