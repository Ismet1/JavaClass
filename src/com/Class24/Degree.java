package com.Class24;

public class Degree {
	//Task
	/*
	 * Create a class ‘Degree’ having a method ‘getDegree’ that prints “I got a degree”. 
	 * Class ‘Degree’ has two subclasses namely ‘Undergraduate’ and ‘Postgraduate’ each having a method 
	 * with the same name that prints “I am an Undergraduate” and “I am a Postgraduate” respectively. 
	 * Call the method by creating an object of each of the three classes.
	 */
	
	public void getDegree() {
		System.out.println("I got a degree");
	}

	public static void main(String[] args) {
		Degree obj = new Degree();
		Undergraduate obj1 = new Undergraduate();
		PostGraduate obj2 = new PostGraduate();
		
		obj.getDegree();
		obj1.getDegree();
		obj2.getDegree();
	}
}
class Undergraduate extends Degree{
	public void getDegree() {
		System.out.println("i am an Undergraduate");
	}
}

//2. child class
class PostGraduate extends Degree{
	public void getDegree() {
		System.out.println("i am a PostGraduate");
	}}