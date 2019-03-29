package com.Class12;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter the browser");
		   String browser = sc.nextLine(); 
		   
		   
		  boolean condition=browser.equalsIgnoreCase("Chrome");
		  boolean condition1=browser.equalsIgnoreCase("FireFOX");
		  boolean condition2=browser.equalsIgnoreCase("Ie");
		  if (condition) {
		    System.out.println("Proceed with chrome Browser");
		  } else if (condition1) {
			  System.out.println("Proceed with firefox Browser");
		  } else if (condition2) {
			  System.out.println("Proceed with ie Browser");
		  } else {
			  System.out.println("Invalid Browser");
		  }
	

}
}