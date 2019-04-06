package com.class17_2;

public class Pyramid {

	public static void main(String[] args) {
		// Pyramid

	
		Pyramid mthd = new Pyramid();
		mthd.printPyramid();
	}
	
	
void printPyramid() {
	for (int i=0; i<5; i++) {
		for(int y=0; y<=i; y++) { 
			System.out.print("*");
		}
	System.out.println();
	}
	
	for (int i=4; i>0; i--) {
		for(int y=0; y<i; y++) { 
			System.out.print("*");
		}
	System.out.println();
	}
}
}
