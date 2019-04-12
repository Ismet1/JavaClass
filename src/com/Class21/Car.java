package com.Class21;

public class Car {

	public String color;//null
	public static int  totalCars;//0+1=1+1=2 //burada 0 olarak basliyor
	
	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.color="white";
		Car.totalCars++; //burada 1 oluyor
		
		Car car2=new Car();
		car2.color="black";
		totalCars++; //burada 2 oluyor
		
		System.out.println("Total car we made is "+totalCars);
		
	}
}
