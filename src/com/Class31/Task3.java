package com.Class31;

import java.util.ArrayList;
import java.util.Iterator;

//3.Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
public class Task3 {

	public static void main(String[] args) {
		ArrayList<String> drinks=new ArrayList<String>();
		drinks.add("Coke");
		drinks.add("Milk");
		drinks.add("Tea");
		
		for (int i=0; i<drinks.size(); i++) {
			String drink=drinks.get(i);
			if(drink.contains("a") || drink.contains("e")) {
				drinks.set(i, "water");
			}
		}
		System.out.println(drinks);
	}

}
