package com.example.project1;

import java.util.ArrayList;

public class Student {
	private String firstName;
	private String lastName;
	private int[] marks;
	private ArrayList mobileNumber;
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
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public ArrayList getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(ArrayList mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
/*
{
	"firstName":"vishal",
	"lastName":"patidar",
	"marks":[10,20,30,40],
	"mobileNumber":[9752211753,8770968325,9907494180]
}















*/
