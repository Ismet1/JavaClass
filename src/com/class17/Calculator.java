package com.class17;

public class Calculator {

	public static void main(String[] args) {
		//class_17/2'nin konusu. Burda review yapma.
		//Bunlari package 17_2'den application sinifina yazdik ve asagida yazili olan method'lari orada calistirdik
		//Bunu methodlarinonune yerlestirdigimiz "public" ile mumkun kiliyoruz. "default" kullansaydik yani hic bisey yazmayip
		//(cunku hic bisey yazmayinca otomatik default oluyor) yada private yazsaydik packagler arasi bu iletiismi kuramazdik.
		/*
		 Calculator obj=new Calculator();
		int a=12;
		int b=6;
		obj.sum(a, b);
		obj.sub(a, b);
		obj.div(a, b);
		obj.mult(a, b);
		 */
	}

	
	
	
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	public void div(int a, int b) {
		System.out.println(a/b);
	}
	
	public void mult(int a, int b) {
		System.out.println(a*b);
	}
}
