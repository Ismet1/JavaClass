package com.class17;

public class Task {

	public static void main(String[] args) {
		// Create a method that will take 2 parameters as a numbers and prints which number is larger.
		
		Task num=new Task();
		num.findLargest(5, 6); 	
	}

	
	void findLargest(int a, int b) {
		if(a>b) {
			System.out.println("A is larger than B");
		}else {
			System.out.println("B is larger than A");
		}
	}
		
		
		
		
		
	}


