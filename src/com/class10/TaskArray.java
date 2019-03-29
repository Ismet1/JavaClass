package com.class10;

public class TaskArray {

	public static void main(String[] args) {
		// Task-1
		/*Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * Then print a grade B (use 2 different ways of creating an array).
		 */
		
		
		//first way
		/*
		char[] grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[5]);//F
		*/
		
		//second way
		char[] grades= {'A','B','C','D','E','F'};
		System.out.println(grades[0]);//A
		
		
		
	}

}
