 package com.example.project1;


public class Person {
	private String FirstName;
	private String LastName;
	private Integer age;
	private String[] email;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String[] getEmail() {
		return email;
	}
	public void setEmail(String[] email) {
		this.email = email;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}

/*
{
	"firstName":"vishal",
	"lastName":"patidar",
	"age":45,
	"email":["patidr@gamil","vp.email","hhu@gmail.com"],
	"address":{"houseNo":"27/sps",
			   "street":"second stage",
			   "state":"madhya pradesh"}
				
}
*/
