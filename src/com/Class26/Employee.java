package com.Class26;

public class Employee {

	String name, lastName;
	
	Employee(){
		System.out.println("i am a parent class constructor");
	}
	
	Employee(String name, String lastName){
		this.name=name;
		this.lastName=lastName;
	}
}

class Tester extends Employee{
	int salary;
	
	Tester(String name, String lastName, int salary){
		super(name, lastName);
		//super misrasini yazarak verileri tester constructor'in icindeki
		//variablelardan alip yukari parent class'inn icindeki "2 stringli
		//constructor'in icine tasiyor. O constructor icindeki this'ler ile
		//kahverengi variablelar=blue variablara esitleniyor.
		//dolayisiyla 'displayDetails' ciktida verileri goruyoruz
		this.salary=salary;
		//test sinifina yazilmiz salary'i buradaki tester constructor'in
		//icindeki kahverengi salary'ye geliyor rakam.
		//kahverengi salary'nin verisini mavi salary'ye alabilmemiz icin
		//line 22 'daki gibi yaziyoruz. line 22 'da kahverengindeki rakami
		//mavi veriye tasiyoruz.
		//dolaysiyla 'displayDetails' ciktida verileri goruyoruz.
	}
	
	public void displayDetails() {
		System.out.println("Employee "+name+lastName+" has a salary of "+salary);
	}
}
