package com.class4;

import java.util.Scanner;

public class CityandTemprature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Ask user to enter city and temperature in fahrenheit
		 * your program should convert F-->C
		 * Your program should say "the temparature in the city ....is....*/

		String cityName; 
		int temp;
		
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please enter your city");
		
		cityName=myScanner.nextLine();
		System.out.println("Please enter temperature in Fahrenheit");
		temp=myScanner.nextInt();
		
		//formula (F-32) x 5/9;
		
		int convertedTemp=(temp-32)*5/9;
		System.out.println("the temperature in the city "+cityName+" is "+convertedTemp);
	}

}
