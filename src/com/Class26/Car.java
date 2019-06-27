package com.Class26;

public class Car {
	public void drive() {
		System.out.println("car drives");
	}
	
	public void drive(int speed) {
		System.out.println("car drives with"+speed);
	}
}


class BMW extends Car{
	
	public void drive() {
		System.out.println("BMW car drives fast");
	}
}

class Toyota extends Car{
	public void drive() {
		System.out.println("Toyota drives safe");
	}
}