package com.class3;

public class Relationaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a=198;
		int b=501;
		boolean result=a>b;
		boolean result1= a==b;
		System.out.println(result);
		System.out.println(result1);
		
		
		//compare 2 numbers and if a is larger than b --> print
		// ifteki icerik dogruysa onun sonucunu veriyor, degilse elsetekinin sonucunu veriyor.
		if (a<b) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye");
		}
		
		//declare price and if price is higher than expected price --. I will not
		
		double shoesPrice = 12.99;
		double allowedPrice = 31.99;
		if (shoesPrice<=allowedPrice) {
			System.out.println("I am buying those shoes");
		}else {
			System.out.println("i am buying not those shoes");
			
		}
		// elseten sonrakileri tum icine aliyor, alttaki satirida yazarsak iki satir cikaricak sonuc else fonksiyonuysa eger.
		System.out.println("I am continues code");
		

	}

}
