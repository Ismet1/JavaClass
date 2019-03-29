package com.class4;

import java.util.Scanner;

public class TaskLast2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		System.out.println("How many years did you work");
		int workedYears = input.nextInt();
		System.out.println("What is your annual salary");
		int annualSalary = input.nextInt();		
		
		
		if (workedYears>=5) {
			System.out.println("You are eligible for bonus"); 
			if (annualSalary>50000) {
				System.out.println("Bonus is 5000");
			}
			else {
				System.out.println("Bonus is 3000");
			}
		}
		else {
			System.out.println("You are not eligible for bonus");
		}
		
		
		
		
	}

}
