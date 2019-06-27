package com.Class34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CarTest {

	public static void main(String[] args) {
		// create a map in which we will store the car number and car itself
		
		Car car1=new Car("Toyota", "Corolla");
		Car car2=new Car("Honda", "Accord");
		Car car3=new Car("Lada", "Priora");
		car1.printCarDetails();
		car2.printCarDetails();
		car3.printCarDetails();
		
		Map<Integer, Car> carMap=new HashMap<>();
		carMap.put(1, new Car ("BMW", "X8"));//bu sekilde objectlerin icine yeni data girisi yapabiliriz
		carMap.put(2, car2);
		carMap.put(3, car3);
		
		System.out.println("--------------collection/values()------------------");
		Collection <Car> carValues=carMap.values();
		for(Car car:carValues) { //burada car'in icerisine tek tek carMap'in icine depo ettigimiz
			//car1, car2, car3 objectleri yerlesiyor sirayla.
			car.printCarDetails();
		}
	}

}
