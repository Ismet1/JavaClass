package com.class35;

public class FinallyBlock {

	public static void main(String[] args) {
		// finally always get executed.

		
		int a=10;
		int b=20;
		
		try {
			System.out.println("Try block code");
			System.out.println(a/b); //10'u 20 ye boldugumuzde double karakter oldugu icin int direk "0" cevabini cikariyor ve bunun icinde catch'i
			//print etmedi.
		}catch (ArithmeticException e) {
			System.out.println("catch block code");
		}finally {
			System.out.println("finally block code");
		}
		
		
		//bu kismi commentde yapabilirsin
		try {
			System.out.println(a/b);
		}finally {
			System.out.println("finally block code");
		}
		System.out.println("continues code....");
	}

}
