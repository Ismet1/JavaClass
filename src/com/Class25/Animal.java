package com.Class25;

public class Animal {

	public void whoAmI() {
		System.out.println("I am an animal");
	}
}

class Puppy extends Animal {
	// we can not override static method with instance
	/*
	public void whoAmI() {
		System.out.println();
	}
	*/
}

class Monkey extends Animal{
	public void whoAmI() {
		System.out.println("I am a Monkey");
	}
}