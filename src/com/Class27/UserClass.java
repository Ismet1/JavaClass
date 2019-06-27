package com.Class27;

public class UserClass {
/*
 * 1. Write program as a student class   that has instance variables name and phone number.
 *  Create a constructor that will initialize those variables. 
 *  Print name & address of given  student by the displayInfo method.
 */

	public String name;
	public long mobileNumber;
	
//	public UserClass() {
//
//	}
	public UserClass(String name, long mobileNumber) {
		this.name=name;
		this.mobileNumber=mobileNumber;
	}
}
class UserInfo extends UserClass {
	
	public String address;
	//public String name;
	
	public UserInfo(String name, long mobileNumber, String address) {
		super(name, mobileNumber);
		this.address=address;
	}
	
	public void userDetails() {
		System.out.println("User name is "+name+" and phone number is "+mobileNumber
				+" and addrees is "+address);
	}
}

	

