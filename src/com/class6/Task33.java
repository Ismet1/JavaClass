package com.class6;

import java.util.Scanner;

public class Task33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan;	
		int num1, num2;
		int result;
		char operator;
			
		scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		num1=scan.nextInt();	
		System.out.println("Enter the second number");
		num2=scan.nextInt();		
		System.out.println("Enter the operator");
		operator=scan.next().charAt(0);
				
		switch (operator) {
		case '+':
			result= num1 + num2;
			break;	
		case '-':
			result= num1 - num2;
			break;	
		case '*':
			result= num1 * num2;
			break;	
		case '/':
			result= num1 / num2;
			break;	
		default:
			System.out.println("No result for this");
			result= 0;
			break;
		}
		
		System.out.println("The result is "+ result);
		
		
		
	}

}
