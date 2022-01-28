package com.mouritech.employeehibernateex.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private Long empId;
	private String empFirstName;
	private String empLastName;
	private String empContactNo;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empFirstName, String empLastName, String empContactNo) {
		super();
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empContactNo = empContactNo;
	}

	public Employee(Long empId, String empFirstName, String empLastName, String empContactNo) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empContactNo = empContactNo;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpContactNo() {
		return empContactNo;
	}

	public void setEmpContactNo(String empContactNo) {
		this.empContactNo = empContactNo;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empContactNo=" + empContactNo + "]";
	}

}
