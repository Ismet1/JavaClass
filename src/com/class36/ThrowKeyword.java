package com.class36;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		int b =0;
		
		//System.out.println(a/b);//new ArithmeticException
		
		//checkAgeEligiblity(17);
		//twoNumDiv(10, 0);
		checkUserNameLength("A");//throw un yanina biz hata tipini yaziyoruz "new" yazdiktan sonra. sonrada hatanin ne oldugunu belirtmek istiyosak
		//onu parantez icinde yaziyoruz ve onu print ediyor sysout gibi.
	}
	
	
	public static void checkAgeEligibility(int age) {
		if(age>=18) {
			System.out.println("Congratilations on your driver license");
		}else {
			throw new ArithmeticException("you are not eligible to get driver license");
		}
	}
	
	
	public static void twoNumDiv(int a, int b) {
		if(b!=0) {
			System.out.println(a/b);
		}else {
			throw new ArithmeticException("we cannot divide by zero");
		}
	}
	
	public static void checkUserNameLength(String userName) {
		if(userName.length()>3) {
			System.out.println("username is accepted");
		}else {
			throw new NullPointerException("username must be longer than 3 chracters");	
		}
	}

}
