package com.class16;

public class Dog {

	
		String name,bread;
	    int age,weight;
	    
	    void run() {
	        System.out.println("Ths dog can run");
	    }
	void sit() {
	    System.out.println("This dog can sit");
	}
	void eat() {
	    System.out.println("This dog can eat");
	}

	public static void main(String[] args) {
	    Dog d1=new Dog();
	    d1.name="Moss";
	    d1.bread="Husky";
	    d1.age=8;
	    d1.weight=13;
	    d1.run();
	    d1.sit();
	    d1.eat();
	    
	    Dog d2=new Dog();
	    d2.name="Boss";
	    d2.bread="Bulldog";
	    d2.age=2;
	    d2.weight=13;
	    d2.run();
	    d2.sit();
	    d2.eat();
	    
	    Dog d3=new Dog();
	    d3.name="Hvost";
	    d3.bread="Labrador";
	    d3.age=11;
	    d3.weight=60;
	    d3.run();
	    d3.sit();
	    d3.eat();
	}

}
