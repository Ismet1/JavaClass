package com.class6;

import java.util.Scanner;

public class homework2uzantisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3, largest;
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter your 3 numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		if(num1>num2) {
			if(num1>num3) {
		
				largest=num1;
			}else {
				largest=num3;
			}
			
		}else {
			if (num2>num3) {
				largest=num2;
		
			}else {
			largest=num3;
			}
		
		}
		System.out.println("the largest number is "+largest);
	}
}


