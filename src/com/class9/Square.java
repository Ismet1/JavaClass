package com.class9;

public class Square {

	public static void main(String[] args) {
		//Square

		for (int i=0; i<5; i++) {
			for(int y=0; y<=6; y++) { 
				if(i==0 || i==4 || y==0 || y==6) {
				System.out.print("*");
			}else
		System.out.print(" ");
		}
			System.out.println();
		}
		
		
	}

}
