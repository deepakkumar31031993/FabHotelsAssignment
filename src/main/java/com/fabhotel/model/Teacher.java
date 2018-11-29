package com.fabhotel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long teacherId;

	private String firstName;
	private String lastName;

	@ManyToOne
	private Subject subject;

	public Teacher(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + teacherId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		teacherId = teacherId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	
}
