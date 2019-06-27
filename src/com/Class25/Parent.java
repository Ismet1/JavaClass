package com.Class25;

public class Parent {
//We can not overriding a constructor but we can overload.
	
	Parent () {
		System.out.println("i am a parent constructor");
	}
}
	
	class Child extends Parent{
	//we can not override a constructor.
		/*
		Parent () {
			System.out.println("i am a child constructor");
		}
		*/
		
		Child () {
			System.out.println("i am a child constructor");
		}
		
	
}
