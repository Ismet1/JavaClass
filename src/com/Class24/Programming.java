package com.Class24;

public class Programming {

	public static void main(String[] args) {
		//Task1 (kendi basina sayfa)
		/*
		 * 1. Create a class named ‘Programming’. While creating an object of the class, 
		 * if nothing is passed to it, then the message “I love programming languages” should be printed. 
		 * If some String is passed to it, then in place of “programming languages” the value variable should be printed.
		 *  Example, if we pass “Java”, then “I love Java” should be printed.
		 */

		Programming obj = new Programming();
		Programming obj2 = new Programming("java");
	}

	
	public Programming() {
		System.out.println("I love programming languages");
	}
	
	public Programming(String str) {
		System.out.println("I love "+str);
	}
	
}
