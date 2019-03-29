package com.class5;

public class NestedIfPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//check if user has credit card
		//check what is the balance if balance is more than 1000 pay off else you are good
		
		boolean creditCard = true;
				int balance =1000;
				
				if (creditCard) {
					System.out.println("Let's check the balance");
					
					if (balance>=1000) {
					System.out.println("pay off now");
					}else {
					System.out.println("you are safe");
					}
				}else {
						System.out.println("do you want a credit card");
					}
				
		
		
		
	}

}
