package com.Class28;

public abstract class Vehicle {
	
	static int vehicleCount;
	
	Vehicle(){
		vehicleCount++;
	}
	
	//public static abstract void gps(); can not have static abstract methods //cunku override edemiyoruz
	//private abstract void speed(); can not have private abstract methods //cunku private 'i baska class'da kullanamazsin dolayisyla implement edemezsin
	//public abstract final void break(); can not have abstracts methods as final, same reason witj private.
	public abstract void start();
	
	public abstract void drive();
	
	public static void stop() {
		System.out.println("stop vehicle by pressing break");
	}
	
	public static void displayTotalVehicles() {
		System.out.println("total vehicles we build= "+vehicleCount);
	}
}

abstract class Car extends Vehicle{
	//child class yaratirken, parent classta implement etmedigimiz methodlar varsa , child class'i
	//abstract olarak yazariz yoksa hata veirr. yada asagidaki siniflardaki gibi implement ederiz methodlari
	
	//by default compiler will create a default constructor and by default we call parent class constructor inside the child constructr
	/*
	 * CAR(){
	 * super();} added by default. we dont see.
	 */
	
	
	//Burayi niye yezdik; Constructor neden gerekli cunku instance variable'larimizi initialize etmek icin constructor kullaniyoruz.
	//Onu gosteriyoruz burda.
	public String make;
	Car(String make){
	this.make=make;
	}
	
}

class BMW extends Car{
	//bu tip inheritance kodlamalarda, bir class'a constructor yazdikmi
	//artik tum class'lara constructor yazmaliyiz cunku biraz once yukarida
	//bahsettigimiz gizli constructor chainini bozmus oluruz.
	BMW(String make){
		super(make);
	}

	@Override
	public void start() {
		System.out.println("bnw car starts remote");
		
	}

	@Override
	public void drive() {
		System.out.println("BMW car drives fast");
		
	}
	
}

class Toyota extends Car{

	
	Toyota(String make){
		super(make);
	}
	
	@Override
	public void start() {
		System.out.println("toyota cars start with push button");
		
	}

	@Override
	public void drive() {
		System.out.println("toyota cars drive safe");
		
	}
	
}