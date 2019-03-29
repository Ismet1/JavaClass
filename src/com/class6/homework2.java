package com.class6;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		
		//Nestedif exampple
		/*find largest number in 3 numbers but use nestedif
	*/
		int num1, num2, num3;
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter your 3 numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		if(num1>num2) {
			if(num1>num3) {
		
				System.out.println("num1 is the largest");
			}else {
				System.out.println("num3 is the largest");
			}
			
		}else {
			if (num2>num3) {
				System.out.println("num2 is the largest");
		
			}
			
			else {
			System.out.println("num3 is the largest");
			}
		
		}
	}
}
