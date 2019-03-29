package com.class4;

import java.util.Scanner;

public class LoanSpecialist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input=new Scanner(System.in);
		System.out.println("What is the amount of loan you needed?");
		
		int loan=input.nextInt();
		
	if (loan<200.000) {
			System.out.println("Ok you got the money");
		}
		else
			System.out.println("Sorry we can not give that amount");
	}
		
	

}
