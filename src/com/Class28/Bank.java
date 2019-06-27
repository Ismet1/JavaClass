package com.Class28;

public interface Bank {
	//In interface, we can only have an abstract(undefined) methods!
	//void hasAtm(){ } // bu error veriyor cunku abstract method kullnmaliyiz interface'te.
	void hasChecking();//undefined method/abstract method
	void hasSavings();
	public void hasCreditCard();//buna public koymasaydik bile zaten bydefault publicti. default yada protected falanda kullanamiyoruz.
	//ozetle tum methodlar "abstarct" ve "public" olmak zorunda.
		
	//diger bir kural bu interface'lerde tum methodlar publictir by default.
	//burda da yine static abstract method kullanamiyoruz. Static yasak interfacete.
	//ama static variable declare edip initilize edebiliyoruz mesela:
	static String name="ismet";//gibi ama bunu initilize etmeseydik yani "static String name;" yapsaydik hata vericekti.
	//bu sadece static icin degil instance variable'lar da da ayni sekilde interface'te.
	//bunuda soyle izah ediyoruz; by defaultall variables inside the interface are public static and final.
	String lastname="inal";//by default it will be public final static. Constant variable yani.
	
	//instance variable'lar kullanamadigimiz icin burda yani variable'lari sonradan degistiremedigimiz icin
	//constructor da kullanmiyoruz interface'te.
	
}

class BOA implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("BOA has two checking account");
	}

	@Override
	public void hasSavings() {
		System.out.println("BOA has two savings account");
	}

	@Override
	public void hasCreditCard() {
		System.out.println("BOA has 10 different cc");
	}
	
}

class PNC implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("PNC has three checking account");
	}

	@Override
	public void hasSavings() {
		System.out.println("PNC has 3 savings account");
	}

	@Override
	public void hasCreditCard() {
		System.out.println("PNC has 7 checking different cc");
	}
	
}
