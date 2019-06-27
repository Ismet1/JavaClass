package com.Class28;

public class VehicleTest {

	public static void main(String[] args) {
		Car car =new BMW("bmw");
		car.drive();
		car.start();
		car.stop();
		Vehicle.displayTotalVehicles();//sysout'u diger sayfada yazdik
		//static oldugu icin, class'in ismini yazip nokta koyup method ismini yazinca call edebiliyoruz.
		
		new BMW("bmw");
		new Toyota("camry");
		System.out.println(Vehicle.vehicleCount);

	}

}
