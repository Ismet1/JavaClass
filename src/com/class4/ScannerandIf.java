package com.class4;

import java.util.Scanner;

public class ScannerandIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input=new Scanner(System.in);
		System.out.println("First number to compare");
		int num1= input.nextInt();
		System.out.println("Second number to compare");
		int num2= input.nextInt();
		
		if (num1>num2) {
			System.out.println(num1+ " is greater than "+num2);
		}else if(num1<num2) {
			System.out.println(num1 + " is smaller than " + num2);
		}else {
			System.out.println(num1 + " is equal to "+num2);
		}
	
		
	}

}
