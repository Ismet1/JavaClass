package com.Class28;

public class Review_28 {
	
	
//-----------------------------------Abstract class'in Ozellikleri------------------//
//coding class;(test class asagida)	
	
	/*
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
		
		public void stop() {
			System.out.println("stop vehicle by pressing break");
		}
		
		public static void displayTotalVehicles() {
			System.out.println("total vehicles we build= "+vehicleCount);
		}
	}

	abstract class Car extends Vehicle{
		
		public String make;
		Car(String make){
		this.make=make;
		}
		
	}

	class BMW extends Car{
		
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
	*/
//test class
	
	/*
	public class VehicleTest {

		public static void main(String[] args) {
			Car car =new BMW("bmw");
			car.drive();
			car.start();
			car.stop();
			Vehicle.displayTotalVehicles();
			//static oldugu icin, class'in ismini yazip nokta koyup method ismini yazinca call edebiliyoruz.
	*/	
		
	
	
	
	
	
	
//-----------------------------------Interface class--------------------------------//
	
	
	public interface Bank {
		//In interface, we can only have an abstract(undefined) methods!
		//void hasAtm(){ } // bu error veriyor cunku abstract method kullnmaliyiz interface'te.
		void hasChecking();//undefined method=abstract method
		void hasSavings();
		public void hasCreditCard();//buna public koymasaydik bile zaten bydefault publicti. default yada protected falanda kullanamiyoruz.
		//ozetle tum methodlar "abstarct" ve "public" olmak zorunda.
			
		
		//burda da yine static abstract method kullanamiyoruz. Static yasak interfacete.
		//ama static variable declare edip initilize edebiliyoruz mesela:
		static String name="ismet";//gibi ama bunu initilize etmeseydik yani "static String name;" yapsaydik hata vericekti.
		//bu sadece static icin degil instance variable'lar da da ayni sekilde interface'te.
		
		String lastname="inal";//by default it will be public final static. //Constant variable yani.
		//ONEMLI; instance variable'lar kullanamadigimiz icin burda yani variable'lari sonradan degistiremedigimiz icin
		//constructor da kullanmiyoruz interface'te.
		
	}
	class BOA implements Bank{ //ONEMLI; classtan class'a multiple class iliskilerinde "extends" kullaniyorduk. Fakat class'tan interface'e yada
		//interfaceten class'a "implements" kullaniyoruz. interface'ten interface'e ise yine "extends" kullaniyoruz.

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
	
	
	
	
}
