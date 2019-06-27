package com.Class26;

public class SuperWithConstructor {

	 SuperWithConstructor() {
		System.out.println("i am a parent class constructor");
	}
	
	 SuperWithConstructor(String str) {
		System.out.println("i am a parent class constructor with 1 parameter");
	}
}

class ChildOfSuperWithConstructor extends SuperWithConstructor {
	
	public ChildOfSuperWithConstructor() {
		//burda super'i kullaninca yukari cikip parent class'taki parameterinin eslestigi
		//constructor'i print etti.
		super("Hello");//superde this gibi ilk line'da olmali yoksa calismaz
		System.out.println("i am a child class constructor");
	}
}
