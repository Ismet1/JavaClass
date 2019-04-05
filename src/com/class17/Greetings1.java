package com.class17;

public class Greetings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Greetings1 obj=new Greetings1();
		obj.askHowAreYou("Omer"); //123 yazarsan iceri cikmaz cunku string olarak kodladik.
		obj.askHowAreYou("ismet"); //you have to call methods in the main method!
	}

	
	void askHowAreYou(String name) {
		System.out.println("How are you "+name);//buralari dynamic yapmak daha avantajli. Hard code yaparsak degistiremeyiz sonradan.
	}
	
	void askHowAreYou1(String name) {
		System.out.println("How are you "+name);
	}
	
	void askHowAreYou2(String name) {
		System.out.println("How are you "+name);
	}
	
	void askHowAreYou3(String name) {
		System.out.println("How are you "+name);
	}
	
	
	
}
