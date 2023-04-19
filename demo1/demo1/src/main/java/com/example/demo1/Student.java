package com.example.demo1;

import java.util.ArrayList;

public class Student {
	private String firstName;
	private String lastName;
	private String[] emailIds;
	private long[] mobileNumbers;
	private ArrayList<String> projectNames;
	private Address address;
	
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
	public String[] getEmailIds() {
		return emailIds;
	}
	public void setEmailIds(String[] emailIds) {
		this.emailIds = emailIds;
	}
	public long[] getMobileNumbers() {
		return mobileNumbers;
	}
	public void setMobileNumbers(long[] mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}
	public ArrayList<String> getProjectNames() {
		return projectNames;
	}
	public void setProjectNames(ArrayList<String> projectNames) {
		this.projectNames = projectNames;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
