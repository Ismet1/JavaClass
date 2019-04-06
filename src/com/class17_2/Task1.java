package com.class17_2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Write a program that reads a range of integers(start and end point),
		// provided by a user and then from that range prints the sum of the even and
		// odd integers.

		Task1 mthd=new Task1();
		mthd.printTask1();
	
		
	}
void printTask1() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter first number");
	int num1 = scan.nextInt();
	System.out.println("Enter second number");
	int num2 = scan.nextInt();
	int SumEven = 0;
	int SumOdd = 0;

	if (num1 < num2) {
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				SumEven = SumEven + i;
			} else {
				SumOdd = SumOdd + i;
			}
		}
		System.out.println(SumEven);
		System.out.println(SumOdd);

	} else {
		System.out.println("firts number should be smaller than first number");
	}
}
}
