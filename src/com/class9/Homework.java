package com.class9;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		/*Print the following pattern:
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345 
		 */
		/*
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		*/
		
		
		
		
		/*
		 * Write a guessing game where the user has to guess a secret number between 1 and 20. 
		 * After every guess input, the program tells the user whether their number was too large or too small. 
		 * The program will keep asking the user to enter the number until he finds the correct number. 
		 * When the correct answer is found the system should display "Congratulations!!. You got it!".
		 * I have two solution for this
		 */
		
		///MY solution
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("Find the secret number from 1 to 20, Take a guess!");
		int y = scan.nextInt();
		int x=5;
		while(y!=x) {
			if(y<5) {
				System.out.println("Your number is too small");	
			}else {
				System.out.println("Your number is too large");
			
			}
			System.out.println("Take another guess");
			y=scan.nextInt();
		}
		System.out.println("Congratulations!!. You got it!");
		*/
		
		
		
		///ASEL solution
		 /* Scanner scan;
	        int secret, userNumber;
	        
	        secret=13;
	        scan=new Scanner(System.in);
	        System.out.println("Please enter any number from 1 to 20");
	        do {
	            
	            userNumber=scan.nextInt();
	            
	            if (userNumber<secret) {
	                System.out.println("Number is too small, try again");
	            }else if (userNumber>secret){
	                System.out.println("Number is too large,  try again");
	            }
	        }while(secret!=userNumber);
	        
	        System.out.println("Congratulations!!You got it!");
		*/
		
		
		
		
		
		
		
		
		
		
		/*
		 * Ask a user to input a leap year. Give the user 10 chances to enter a correct leap year. 
		 * As soon as the user enters the correct leap year exit the loop.
		 */
		/*
		Scanner scan=new Scanner(System.in);
		
		
		for(int a=0; a<10; a++) {
			System.out.println("Which year is the leap year?");
			int year=scan.nextInt();
			
		if (year%4==0) {
			System.out.println("leap year");
			break;
		}else {			
			System.out.println("Not a leap year");
			
		}}
		*/
		
		
		
	}

}
