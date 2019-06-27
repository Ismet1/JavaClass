package com.Class24;

public class Task2 {
	//Task-2 (kendi basina sayfa)
	/*
	 * 2. Create 1 class with a static method that has 3 overloaded forms. 
	 * Then call each overloaded method with specific arguments and observe result.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method(5);
		method("ismet", 5);
		method("ismet");
	}

	static void method(int a) {
		System.out.println(a);
	}
	
	static void method(String str) {
		System.out.println(str);
	}
	
	static void method(String str, int a) {
		System.out.println(str+a);
	}
}
