package com.class17;

public class Greetings {

	public static void main(String[] args) { //main method makes our code executable
		//	
		Greetings obj = new Greetings();
		obj.hello();
		//how to find largest number
		obj.findLargest();//kodu method'un icine gomduk
		obj.findLargest();//istedigimiz kadar calistirabiliriz bu sekilde kodu. Yazmasi kolaylasti
		
		obj.helloToInstructor("Asel"); //burada parameter olusturduk. bu parameterda hangi isim varsa onu cikariyoruz
		obj.helloToInstructor("Weqas");
	}
	
	void helloToInstructor(String name) {
		System.out.println("Hello " + name);//name'in yerine "a" da yazabilirdin, variable yani.
	}
	
	
	void hello() {
		System.out.println("Hello");
	}
	
	void findLargest() {
		int a=10;
		int b=20;
		if(a>b) {
			System.out.println("A is larger than B");
		}else {
			System.out.println("B is larger than A");
		}	
	}
	
	
	
}
