package com.class11;

public class Task {

	public static void main(String[] args) {
		// Task-1
		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		
		String[] cars= {"Fiat", "Ferrari", "Seat", "Ford", "Nissan", "Honda"};
		
		for (String models : cars) { 
			System.out.println(models);  
		}
		
		for(int i=0; i<=cars.length-1; i++) { 
			System.out.println(cars[i]);
		}
		
		
		
	}

}
