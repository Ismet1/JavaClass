package com.Class24;

public class Task3 {

	public static void main(String[] args) {
		//Task-3 (kendi basina sayfa)
		/*
		 * 3. Create 1 class with a private method that has 3 overloaded forms.
		 *  Then call each overloaded method with specific arguments and observe result.
		 */
		Task3 obj = new Task3();
		obj.method(5);
		obj.method("ismet", 5);
		obj.method("ismet");
		
	}

	private void method(int a) {
		System.out.println(a);
	}
	
	private void method(String str) {
		System.out.println(str);
	}
	
	private void method(String str, int a) {
		System.out.println(str+a);
	}

	
	
}
