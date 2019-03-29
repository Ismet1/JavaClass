package com.class5;

import java.util.Scanner;

public class ConditionsAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ask user to enter price and boolean value for sale
		//based on the sale we will check the price
		//if price<20 -->apply discount 20% and give final price
		//if price is >20 less 100 -->apply discount 30% and give final price
		//if price is >100 less 500 --->apply discount 50% and give final price
		Scanner scan;
		boolean sale;
		int discount;
		int price;
		double finalPrice;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter if there is a sale");
		sale=scan.nextBoolean();
		
		
		if(sale) {
			System.out.println("let's chack all dicounts");
			System.out.println("Please enter price of the item");
			//Scanner scan1 = new Scanner(System.in);
			price=scan.nextInt();
			if(price<20) {
				discount=20;
				finalPrice=price-(price*0.2);
				System.out.println(finalPrice);
			}else if(price>=20 && price<100) {
			discount=30;
			finalPrice=price-(price*0.3);
			System.out.println(finalPrice);
			}else if(price>=100 && price<500) {
			discount=50;
			finalPrice=price-(price*0.5);
			System.out.println(finalPrice);
			}else {
			discount=75;
			finalPrice=price-(price*0.75);
			System.out.println(finalPrice);
			}
	}else {
		System.out.println("Not Interested");
		}
		scan.close();
	}
}
