package com.class36;
/*
 * create an exception: when user it trying to withdraw larger amount that the balance
 * throw an exception saying "you do not have enough money"
 */
public class Task {

	//throw method'un icinde kullanulir. Main methodta o method call edilince run edilir.
	
	public static void main(String[] args) {
		
		withdraw(1500, 1000);
	}

	public static void withdraw(int amount, int balance) {
		
		if(amount<balance) {
			System.out.println("Congratilations you can get your money");
		}else {
			throw new ArithmeticException("you are not eligible to get that much money");
		}
	}
}
