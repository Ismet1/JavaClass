package com.Class12;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
/*
		(Accept x, password and confirm password and check following requirements:
			x and Password cannot be  empty, if so message=”x and Password cannot be empty”.
			Password should be minimum 8 characters, if less  message=”Password is too short”.
			Password cannot contain x if so,  message=”Password cannot contain x”.
			Password should match confirmed password, if not   message “Passwords do not match”.
			Only after all requirements met  message “Your x and password has been created”)
*/
		
		Scanner scan;
		String userName, password, confirmedPassword, message;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter username");
		userName=scan.nextLine();
		
		System.out.println("Please enter password");
		password=scan.nextLine();
		
		System.out.println("Please confirm password");
		confirmedPassword=scan.nextLine();
		
		if (!(userName.isEmpty() && password.isEmpty())) {//1 checkpoint
			if(password.length()>8) {//2 checkpoint
				if (!password.contains(userName)) {//3 checkpoint
					if (password.equals(confirmedPassword)) {//4 checkpoint
						message="Your username and password has been created";
					}else {
						message="Passwords do not match";
					}
				}else {
					message="Password cannot contain username";
				}
			}else {
				message="Password is too short";
			}
		}else {
			message="Username and Password cannot be empty";
		}
		System.out.println(message);
	}
}	
	

		
		
		
	
		
		
		
		
		
		
		
	


