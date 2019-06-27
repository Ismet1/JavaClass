package com.Class22;

public class TaskTwo {

	/*
	2. Write a java program of Class Students that takes students name and 3 subject grades.
	Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks. 
	Your program should print an average mark of each students name.
	*/
	
	String name;
	int grades;
	
	public TaskTwo(String name) {
		System.out.println("My name is "+name+" and my avarage is ");
	}
	int findAverage (int a, int b, int c) {
		return (a+b+c)/3;
	}
}
