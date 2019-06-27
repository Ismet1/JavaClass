package com.Class23;

public class Review23 {

}

//---------Extend new Classes and calling methods and variables in different classes----------//

//Burada (Employee) sinifina bagli (scrumTeam) sinifi ve bu sinifa bagli (tester-developer-businessAnalyst-scrumMaster-productOwner)
//ve (developer) sinifina bagli (frontEnd-BackEnd) ve (tester) sinifina bagli (automationTester-ManualTester) siniflari test edildi.
//asagida test kisminin iki class'i iceren kismi var sadece.
//Burada static method ve variablelar ile instance method ver variable'lar arasindaki call etme ve print etme farkini goruyoruz.
/*
	public static void main(String[] args) {
		//bu class i execution icin kullaniyoruz
		System.out.println("-------------creating employee object-----------");
		Employee emp = new Employee(); //diger siniftaki verileri object ile call edicez. Cunku static degil.Static olsaydi class uzrinden.
		System.out.println(Employee.department);//static variable//buda static , o yuzden employee yazarak call ettik.
		Employee.work(); //static method//static memberslari bu sekilde call ediyoruz(class name ile)
		emp.salary=90000;
		emp.getPaid();//instance method //yukarida olusturdugumuz object'in semboluyle(emp) call edilir
		
		System.out.println("-------------creating scrumteam object-----------");
		ScrumTeam st = new ScrumTeam();
		ScrumTeam.work();//static method
		System.out.println(st.salary);//instance variable //yukarida olusturdugumuz object'in semboluyle(st) call edilir
		st.salary=100000;
		st.getPaid();//instance method
		st.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";//instance variable'i declare ediyoruz.
		st.ceremonies="Sprit grooming, Sprint planning, Daily StandUp, Sprint Demo";
		st.attendScrumMeetings();//instance method
		st.workOnArtifacts();//instance method
		
		//Note: eger en uc noktadan mesela bu ornekte 'manual tester' class'inda verilmemis method , test classinda call edildiyse
		//manual tester class'inin bagli oldugu classlarda var ise bu method , o classin methodunun output'u cikar.
 */



//-----------------Overloading Method-----------------//

//Test etmek icin (Addition ve testaddition classlarina git
//Overloading ayni method ismi kullanilarak, farkli parameter ile farkli method olusturmak. Asagidaki gibi yapilir

/*
//1. overloading methods by changing number of parameters
public void add(int a, int b) {
	System.out.println("Method to add 2 integers");
	System.out.println(a+b);
}

public void add(int a) {
	System.out.println("Method to add 100 to an integers");
	System.out.println(a+100);
}

public void add(int a, int b, int c) {
	System.out.println("Method to add 3 integers");
	System.out.println(a+b+c);
}
//2. overloading method by changing the data type of the parameters

public void add(double a, double b) {
	System.out.println("Method to add 2 double values");
	System.out.println(a+b);
}
public void add(int a, double b) {
	System.out.println("Method to add 1 int value & 1 double value");
	System.out.println(a+b);
}

public void add(double a, int b) {
	System.out.println("Method to add 1 double value & 1 int value");
	System.out.println(a+b);
}

public void add(double a, double b, double c) {
	System.out.println("Method to add 3 double values");
	System.out.println(a+b+c);
}
*/




//---------------Constructor Overloading------------------//

//test etmek icin ConstructorOverloading ve testconstructorOverloading class'ina gidebilirsin
/*
public class ConstructorOverloading {

	ConstructorOverloading() {
		System.out.println("I am a constructor with no parameters");
	}
	
	ConstructorOverloading(String str) {
		System.out.println("I am a constructor with 1 string parameters");
	}
	
	ConstructorOverloading(String str, String str2) {
		System.out.println("I am a constructor with 2 string parameters");
	}
	
	ConstructorOverloading(int a) {
		System.out.println("I am a constructor with 1 integer parameter");
	}	
}
*/
//bu kisimda test class'indan. Main method icine call ediliyor constructorlar. Object yaratarak call ediliyorlar constructorlar.
//parantez icine parameter tipine uygun veri girince, constructor hangi constructor tipine ait oldugunu anliyor ve ona gore output veriyor.
/*
public static void main(String[] args) {
	// Overloading Constructor

	ConstructorOverloading obj = new ConstructorOverloading();//"I am a constructor with no parameters"
	ConstructorOverloading obj1 = new ConstructorOverloading("ismet");//"I am a constructor with 1 string parameters"
}




//-------------------Main Method Overloading---------------------//
//Test icin yukaridaki basligin class'ina git
 
/*
public class MainMethodOverload {

public static void main(String[] args) {
	System.out.println("i am main method with stringargumant array");
}

public static void main() {
	System.out.println("i am main method with no parameters");
}

public static void main(String str) {
	System.out.println("i am main method with 1 string parameters");
}

public static void main(int a) {
	System.out.println("i am main method with 1 int parameters");
}
}
*/
//test kismi asagidaki gibi. Constructor seklinde class ismi yazilip sonuna '.main' yazilip call ediliyor main methodlar.
/*
MainMethodOverload.main();//i am main method with no parameters
MainMethodOverload.main(args);//i am main method with stringargumant array
MainMethodOverload.main(5);//i am main method with 1 int parameters
*/