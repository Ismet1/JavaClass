package com.class8;

import java.util.Scanner;

public class ForAndScanner {

	public static void main(String[] args) {
		// for kullanarak bir kodu 5 kere soruyoruz user'a loop seklinde
		
		 Scanner myScanner;
	        int num1, num2;
	        int largest = 0;

	        myScanner = new Scanner(System.in);
	        
	        for (int i = 1; i <= 5; i++) { 
	            
	            System.out.println("Please enter 2 numbers");
	            num1 = myScanner.nextInt();
	            num2 = myScanner.nextInt();

	                if (num1 > num2) {
	                    largest = num1;
	                } else if (num2 > num1) {
	                    largest = num2;
	                } else {
	                    System.out.println(num1 + " is queals to" + num2);
	                }

	            System.out.println(largest + " is the largest");
	        }
	    }

	}