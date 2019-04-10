package com.Class20;

public class Task {

	public static void main(String[] args) {
		/*
		 * Create a method create Email
		 * Based on provided users name, lastName and email type,
		 * your method should return complete email Address;
		 * johnsnow@gmail.com , johnsnow@yahoo.com
		 */

		Task obj = new Task();
		String email=obj.createEmail("john", "snow", "gmail");
		System.out.println(email);
			
		
		email=obj.createEmail("john", "snow", "yahoo");
		System.out.println(email);
	}
	
	//return type methodName
	String createEmail(String name, String lastName, String emailType) {
		
		String email= name+lastName+"@"+emailType+".com";
		return email;
	}
	
	
	
	
	
}

