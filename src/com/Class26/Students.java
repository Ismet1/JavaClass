package com.Class26;

public class Students {

	String fullName;
	int age;
	
	//this is used to differentiate between local and instance variables
	public Students(String name, int ageNum) {
		this.fullName=name;
		this.age=ageNum;	
	}
	
	public void displayDetails() {
		System.out.println("Student full name is "+fullName+" and age="+age);
	}
	
	
	public static void main(String[] args) {
		Students obj =new Students("John Snow", 30);
		obj.displayDetails();
	}
	
	
}
