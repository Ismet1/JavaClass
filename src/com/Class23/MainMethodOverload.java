package com.Class23;

public class MainMethodOverload {

	public static void main(String[] args) {
		System.out.println("i am main method with stringargumant array");
	}

	public static void main() {
		System.out.println("i am main method with no parameters");
	}
	
	public static void main(String str) {
		System.out.println("i am main method with 1 string parameters");
	}
	
	public static void main(int a) {
		System.out.println("i am main method with 1 int parameters");
	}
}
