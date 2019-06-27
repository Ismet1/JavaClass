package com.Class24;

public class TestEmployees {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		FullTimeEmployee ft = new FullTimeEmployee();
		Contractor contractor=new Contractor();
		
		emp.getPaid();//employee gets paid salary
		ft.getPaid();// full time employee gets paid salary + bonus
		contractor.getPaid();//Contactor sayfasi bos olmasina ragmen, employee sayfasindaki print'i verdi.
		//cunku contractor ve fulltimeemployee sayfasi parent sayfaya baglandilar. extend ile. 
		//eger child sinifinda bir veri yoksa parent yani ana sayfadakiyi bilgiyi print eder.
		
	}

}
