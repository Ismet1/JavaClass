package com.class6;

import java.util.Scanner;

public class Tas22 {

	public static void main(String[] args) {

		Scanner scan;	
		String grade;
		String explanation;
		
		scan=new Scanner(System.in);
		System.out.println("What is your grade?");
		grade=scan.nextLine();
		
		switch (grade) {
		case "A":
			explanation="Excellent";
			break;	
		case "B":
			explanation="Good";
			break;
		case "C":
			explanation="Average";
			break;
		case "D":
			explanation="Bad";
			break;
		default:
			explanation="Not Acceptable";
		}
	System.out.println("Your grade is "+grade+" which is "+explanation);	
	}

}
