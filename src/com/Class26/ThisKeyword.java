package com.Class26;

public class ThisKeyword {

	int num1, num2;
	
	public ThisKeyword() {
		System.out.println("no parameters here");
	}
	
	public ThisKeyword(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	//maviler instance variable, bordolar local variable.
	}
	
	public void sum(int num1, int num2) {
		System.out.println("the sum of local variables="+(num1+num2));
		System.out.println("the sum of instance variables="+(this.num1+this.num2));
	}
}
