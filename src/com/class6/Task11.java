package com.class6;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;	
		String country;
		String language;
		
		scan=new Scanner(System.in);
		System.out.println("please enter which country are you from");
		country=scan.nextLine();
		
		switch (country) {
		case "USA":
			language="English";
			break;	
		case "Turkey":
			language="Turkish";
			break;	
		case "Germany":
			language="German";
			break;	
		case "Sweeden":
			language="Sweedish";
			break;	
		default:
		language="Unknown";
		
		}
		System.out.println("You speak "+language);
	}

}
