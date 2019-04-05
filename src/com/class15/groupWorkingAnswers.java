package com.class15;

import java.util.Scanner;

public class groupWorkingAnswers {

	public static void main(String[] args) {
		// GroupWorking
		
		//Write a program to find whether a string is palindrome or not?
		/*
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter any word to check if it is a palidrome");
		String word=scan.nextLine();
		
		String reverse="";
		
		for (int i=word.length()-1; i>=0; i--) {
			reverse+=word.charAt(i);
		}
		
		if (word.equalsIgnoreCase(reverse)) {
			System.out.println("The word is palidrome ");
		}else {
			System.out.println("The word is not a palidrome");
		}
		*/
		
		
		//write a program that number is prime number or not (class14'de benim yaptigim var)
		/*
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to check if it is prime");
		number = input.nextInt();
		boolean prime = true;
		for (int i = 2; i < number; i++) {
			if (number % i != 0) {

			}else {
				prime = false;
				break;
			}
		}
		System.out.println(prime);
		*/
		
		
		
		//Write a Java prgram to print 10 numbers of fibonacci series
		
		int a=0;
		int b=1;
		int c=0;
		
		for(int i=0; i<10; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(a+" ");
		}
		
		
		
		
		
	}

}
