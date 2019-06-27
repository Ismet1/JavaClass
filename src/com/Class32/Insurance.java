package com.Class32;
/*
 * Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as 
 * getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList. Using 1 reference variable access methods from different classes.
 */
public abstract class Insurance {

	public String insuranceName;
	abstract void getQuote();
	abstract void cancelInsurance();
}
class Car extends Insurance{

	public String carModel;
	
	Car(String carModel){
		this.carModel=carModel;
	}
	
	@Override
	void getQuote() {
		System.out.println("get quote for car "+carModel);
	}

	@Override
	void cancelInsurance() {
		System.out.println("cancel insurance for car "+carModel);
	}
}

class Pet extends Insurance{

	
	public String petType;
	
	Pet(String petType){
		this.petType=petType;
	}
	
	@Override
	void getQuote() {
		System.out.println("get quote for pet "+petType);
	}

	@Override
	void cancelInsurance() {
		System.out.println("cancel insurance for pet "+petType);
		
	}	
}

class Health extends Insurance{

	@Override
	void getQuote() {
		System.out.println("get quote for health");
		
	}

	@Override
	void cancelInsurance() {
		System.out.println("cancel insurance for health");
		
	}
	
}
