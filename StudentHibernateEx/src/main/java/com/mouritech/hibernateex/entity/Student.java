package com.mouritech.hibernateex.entity;

import javax.persistence.Entity;

@Entity
public class Student {
	private Long studId;
	private String studFirstName;
	private String studentLastName;
	private String studContactNo;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studFirstName=" + studFirstName + ", studentLastName=" + studentLastName
				+ ", studContactNo=" + studContactNo + "]";
	}

	public Long getStudId() {
		return studId;
	}

	public void setStudId(Long studId) {
		this.studId = studId;
	}

	public String getStudFirstName() {
		return studFirstName;
	}

	public void setStudFirstName(String studFirstName) {
		this.studFirstName = studFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudContactNo() {
		return studContactNo;
	}

	public void setStudContactNo(String studContactNo) {
		this.studContactNo = studContactNo;
	}
	
	

}
