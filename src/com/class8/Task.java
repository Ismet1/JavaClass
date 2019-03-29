package com.class8;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// let user define a range of numbers to print
		//iki rakam arasini bu formulle cikariyoruz.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a starting number");
		int startNumber=scan.nextInt();
		
		System.out.println("please enter an ending number");
		int endNumber=scan.nextInt();
		
		for(int i=startNumber; i<=endNumber; i++) {
			System.out.println(i);
		}
	}

}
