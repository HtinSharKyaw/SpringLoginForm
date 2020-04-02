package com.example.demo.entities;

import java.util.Date;

public class Employee {
	private String userName;
	private int age;
	private String departmentName;
	private String gender;
	private Date startDate;
	private Date endDate;
	public Employee(String userName, int age, String departmentName, String gender, Date startDate, Date endDate) {
		super();
		this.userName = userName;
		this.age = age;
		this.departmentName = departmentName;
		this.gender = gender;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
