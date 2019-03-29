package com.class11;

public class Task2D_2 {

	public static void main(String[] args) {
		//Create a 2D array that first row will contain 4 names and second row will contain grades. 
		// Then you program should print name of the students that has as an A and B grade

		String[][] names= { 
				{"Frank","Ismet","HuseyinNebili","Batman"},
				{"A","B","C","D","F"},
				};
		
		System.out.println(names[0][0]+" your grade is "+names[1][0]);
		System.out.println(names[0][1]+" your grade is "+names[1][1]);
		System.out.println(names[0][2]+" your grade is "+names[1][4]);
		System.out.println(names[0][3]+" your grade is "+names[1][3]);
		
		
	}

}
