package com.class16;

public class Phone {

	
		// “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviours

		String brand,color;
	    int size,weight;
	    
	    void call() {
	        System.out.println("This "+brand+" phone can call");
	    }
	    void text() {
	        System.out.println("This phone can text");
	    }
	    void takePictures() {
	        System.out.println("This phone can take pictures");
	    }
	    
	    
	    
	public static void main(String[] args) {
	    Phone p1=new Phone();
	    p1.brand="Nokia";
	    p1.color="Black";
	    p1.size=5;
	    p1.weight=20;
	    p1.call();
	    p1.text();
	    p1.takePictures();
	    
	    Phone p2=new Phone();
	    p2.brand="Android";
	    p2.color="Blue";
	    p2.size=4;
	    p2.weight=10;
	    p2.call();
	    p2.text();
	    p2.takePictures();
	    
	    Phone p3=new Phone();
	    p3.brand="Iphone";
	    p3.color="Silver";
	    p3.size=5;
	    p3.weight=20;
	    p3.call();
	    p3.text();
	    p3.takePictures();
	    
		
		
		
		
		
		
	}

}
