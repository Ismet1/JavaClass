package com.Class24;

public class BankTest {

public static void main(String[] args) {
		
		Bank bank=new Bank();
		BOA boa=new BOA();
		PNC pnc=new PNC();
		
		int interestRate;
		
		
		bank.chargeInterest();
		
		
		interestRate=boa.chargeInterest();
		System.out.println("BOA charges interest="+interestRate);
		
		interestRate=pnc.chargeInterest();
		System.out.println("PNC charges interest="+interestRate);
	}
}
