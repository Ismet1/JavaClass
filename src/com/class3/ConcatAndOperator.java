package com.class3;

public class ConcatAndOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String a="Hello";
	String b="Bye";
	
	int x = 10;
	int y = 20;
	
	System.out.println(x+y+a+b); //30HelloBye
	System.out.println(x+a+y+b); //10Hello20Bye
	System.out.println(x+a+b+y); //10HelloBye20
	System.out.println(a+b+x+y); //HelloBye1020 cunku sonda oldugu icin! string olarak basliyor.
	System.out.println(a+b+(x+y)); //HelloBye30
	System.out.println((a+b)+x+y); //HelloBye1020
	System.out.println(a+b+x*y); //HelloBye200
	System.out.println(a+b+y/x); //HelloBye2
	System.out.println(a+b+(y-x)); //HelloBye10
	//note; ilk once yazilan tum islemler yapilir ancak islemleri sonda yapmaya calistigimizda; sonucu negatif olanlari ve 
	//toplama islemlerini sonucta vermiyor.
	
	
	}

}
