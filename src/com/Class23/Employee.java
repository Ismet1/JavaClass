package com.Class23;

public class Employee {
	
	protected static String department="IT";
	public int salary;//instance variable(herkes paylasabilir.
	protected int salary1;
	
	public void getPaid() { //bunu public yerine private yapsaydik, test sinifinda error alirdik.
		System.out.println("employeegets paid "+ salary);
	}
	
	public static void work() { //static variable sonradan yazdik bunu. Test kanalinda ciktisini aliyoruz
		System.out.println("employee works in "+ department+" department");
	}
	
	
	
	protected void test() {
		System.out.println(" i am a protected method");
	}
	
	
	void test1() {
		System.out.println("i am a default method");
	}
	
}
