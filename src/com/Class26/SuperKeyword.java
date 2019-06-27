package com.Class26;

public class SuperKeyword {
	
	String name="John";
	
	public void sayName() {
		System.out.println("Parent name is "+name);
	}
}

class ChildOfSuperKeyword extends SuperKeyword{
	String name="Micheal";
	
	public void sayName() {
		//super keyword'u sana burda parent class'in ozelliklerini
		//kullandiriyor. Child sinifinda bile olsan geriye donup
		//parent classtan veriyi alip kullaniyor.
		System.out.println("Parent name is "+super.name);
		System.out.println("Child name is "+name);
	}	
	
	
	public void callingMethods() {
		sayName();//this.sayName (compiler this'i kendi otomatik koyuyor.)
		super.sayName();
	}
	
	
}

