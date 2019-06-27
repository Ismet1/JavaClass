package com.Class31;

import java.util.ArrayList;
import java.util.Iterator;

/*
* 1.Create an arraylist of cars and retrieve all the values using 4 different ways.
 */
public class Task {

	public static void main(String[] args) {
	
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("BMW");
		cars.add("HONDA");
		cars.add("JEEP");
		
		for(int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
			
		for(String car: cars) {
		System.out.println(car);
		}
		
		
		Iterator <String>it=cars.iterator();
		while(it.hasNext()) {
			String car1=it.next();
			System.out.println(car1);
		}
		
			
		int a=0;		
		while(cars.size()>a) {
			String myCar=cars.get(a);
		System.out.println(myCar);
		a++;
		}
	}

}
