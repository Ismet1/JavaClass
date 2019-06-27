package com.Class34;

public class Car {

	private String model;
	private String make;
	
	public Car(String make, String model) {
	this.make=make;
	this.model = model;
	}
	
	public void printCarDetails() {
		System.out.println("Make is "+make+"model is "+model);
	}
}
