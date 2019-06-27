package com.Class23;

public class TestTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task obj = new Task();
		System.out.println("Area of Square");
		obj.findArea(5, 5);
		System.out.println("Area of Rectangle");
		obj.findArea(5.5, 6.5);
		System.out.println("Area of Cube");
		obj.findArea(5);
	}

}
