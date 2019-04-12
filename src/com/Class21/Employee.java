package com.Class21;

public class Employee {
	
	int eID;
	int salary;
	static String CEO = "Sumair";

	public static void main(String[] args) {
		
		
		Employee Emp1 = new Employee();
		Employee Emp2 = new Employee();
		
		Emp1.eID = 101010;
		Emp1.salary = 1000;
		Emp1.result();
		Emp2.eID = 202020;
		Emp2.salary = 2000;
		Emp2.result();
	}

	void result() {
		System.out.println(eID+" "+salary+" "+CEO);
	}
}
