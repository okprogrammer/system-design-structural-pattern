package com.design.pattern.structural.adapter;

public class Employee {

	private String fullName;

	private String jobTitle;

	private String officeLocation;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String fullName, String jobTitle, String officeLocation) {
		super();
		this.fullName = fullName;
		this.jobTitle = jobTitle;
		this.officeLocation = officeLocation;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

}
