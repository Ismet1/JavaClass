package com.Class26;

public class ThisWithMethods {

	public void m1() {//bu m1 oldugu icin bu cikmiyor cunku bunu call etmedik.
		System.out.println("I am m1 method");
	}
	
	public void m2() {
		this.m1();//bu this method oldugu icin ilk bunu print ediyor
		System.out.println("I am m2 method");//sonra bunu print ediyor
	}
	
	public static void main(String[] args) {
		
		ThisWithMethods obj=new ThisWithMethods();
		obj.m2();
	}
	
}
