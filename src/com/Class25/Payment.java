package com.Class25;

public class Payment {

	public void makePayment() { //overridden method
		System.out.println("we can make a payment with no fee");
	}
	
	public void closePayment() {
		System.out.println("all payments needs to be closed");
	}
	
	
}

class MasterCard extends Payment{
	public void makePayment() { //overriding method
		System.out.println("we can make a payment with MC and 2%fee");
	}
}

class Visa extends Payment{
	public void makePayment() { //overriding method
		System.out.println("we can make a payment with Visa and 1.5%fee");
	}
	
	public void annualFee() { 
		System.out.println("Visa card has annual fee");
	}
}