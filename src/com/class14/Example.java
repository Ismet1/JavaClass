package com.class14;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		/*
		 * write a program that reads two people first name
		 * and if they expecting boy or girl
		 * based on the input suggest a name fo a baby
		 */

		
		Scanner scan; 
		String motherName,fatherName, gender, babyName;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter mothers name");
		motherName=scan.nextLine();
		
		System.out.println("Please enter fathers name");
		fatherName=scan.nextLine();
		
		System.out.println("Please enter expected gender");
		gender=scan.nextLine();
		
		
		if(gender.equalsIgnoreCase("boy")) {
			babyName=fatherName.substring(0, fatherName.length()/2)+
					motherName.substring(motherName.length()/2);
		}else if(gender.equalsIgnoreCase("girl")){
		babyName=motherName.substring(0, motherName.length()/2)+
				fatherName.substring(fatherName.length()/2);
		}else {
			babyName="No suggestion";
			
		}
		System.out.println(babyName.toUpperCase());
		
		
	}

}
