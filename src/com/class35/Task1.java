package com.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * HOw would handle InputMismatchException?
 * Input mismatch exception when user enters mismatch value then programmer expected
 */
public class Task1 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter any number");
			
		try {	
			
		int myNumber=scanner.nextInt();
		System.out.println(myNumber);
		
		} catch(InputMismatchException e) {
			System.out.println("inside the catch block");
		}
		
		
	}

}
