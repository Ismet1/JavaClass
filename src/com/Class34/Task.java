package com.Class34;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*
 * 1.Create a Map from array of cities that will sort keys in alphabetical order. 
 * As a key store the name of the city and as a value store the length of the city name (Example: Paris=5, Moscow =6 etc..).
If any city name is more than 7 characters remove that city ( use entrySet with Iterator ).


 */
public class Task {

	public static void main(String[] args) {
		
		Map<String, Integer> nameCities=new TreeMap<>();
		nameCities.put("Izmir", 5);
		nameCities.put("Istanbul", 8);
		nameCities.put("Ankara", 6);
		
		System.out.println(nameCities);
		
		Iterator<Map.Entry<String, Integer>> it=nameCities.entrySet().iterator();
		while (it.hasNext()){
		Map.Entry<String, Integer> entry = it.next();
		if (entry.getKey().length()>7) {
		it.remove();
		
		System.out.println(nameCities);
		}
	}
		
		
		
	}	
}	
