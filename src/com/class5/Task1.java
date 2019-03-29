package com.class5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input=new Scanner(System.in);
		System.out.println("What is ur height?");
		int height=input.nextInt();
		int convertedFeet=(height/12);
		
		 if (convertedFeet<5) {
	            System.out.println("under 5 feet");
	        }else if(convertedFeet>=5 && convertedFeet<6) {
	            System.out.println("5 to 6 feet");
	        }else if(convertedFeet>=6) {
	            System.out.println("6 feet and over");
		
	}
	}
}
