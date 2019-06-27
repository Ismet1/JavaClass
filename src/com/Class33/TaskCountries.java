package com.Class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Create a map of countries with its capital. 
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
 */
public class TaskCountries {

	public static void main(String[] args) {
		Map<String, String>map=new HashMap<>();
		map.put("Turkey", "Ankara");
		map.put("France", "Paris");
		map.put("Russia", "Moscow");
		
		
		Set <String> keys=map.keySet();		
		for (String key:keys) {
		System.out.print(key+" ");
		}
		
		System.out.println();
		Iterator<String> keysIt=keys.iterator();
		while(keysIt.hasNext()) {
			System.out.print(keysIt.next()+" ");
		}
		
		System.out.println();
		Collection <String> values=map.values();
		for (String value:values) {
			System.out.print(value+" ");
		}
		
		System.out.println();
		Iterator<String> valuesIt=values.iterator();
		while(valuesIt.hasNext()) {
			System.out.print(valuesIt.next()+" ");
		}
	}

}
