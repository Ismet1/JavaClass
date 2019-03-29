package com.class7;

import java.util.Scanner;

public class task22 {

	public static void main(String[] args) {
		/*
		 * ask user to pay for a soda keep asking user to pay for soda until entered
		 * price is not equal to 1.99 after user got a right amount print
		 * "please enjoy your soda"
		 */

		Scanner scan = new Scanner(System.in);
		double price;
		System.out.println("please pay for soda");
		price = scan.nextDouble();

		while (price != 1.99) {
			System.out.println("please pay for soda");
			price = scan.nextDouble();
		}
		System.out.println("please enjoy your soda");

	}

}
