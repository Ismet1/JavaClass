package com.class11;

public class Task3 {

	public static void main(String[] args) {
		// Task-3
		// Create an array on integers and calculate the sum of all elements in an array.

		int[]numbers= {10, 11, 12};
		int sum=0;
		for (int i=0; i<numbers.length; i++) { 
			sum=sum+numbers[i];
		
		}
		System.out.println(sum);
	}

}
