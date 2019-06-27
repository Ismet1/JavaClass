package com.Class33;

import java.util.*;


public class AllKeysAndValueFromMap {

	public static void main(String[] args) {
		
		Map<Integer, String>map=new HashMap<>();
		map.put(1, "A");
		map.put(2, "AA");
		map.put(3, "B");
		map.put(3, "C");
		map.put(4, "D");
		
		System.out.println(map);
		
		//returns a set of keys from the map
		Set <Integer> keys=map.keySet();
		
		//how to print all keys
		System.out.println("--------------Using for loop----------------");
		for (Integer key:keys) {
		System.out.print(key+":"+map.get(key)+" ");//sadece "key" desesydik sadece rakamlari cikarcakti. Sonradan ekledigimiz get methodu ile
		//yanina string value'larinida eklemis olduk.
		}
		
		System.out.println();
		System.out.println("--------------Using Iterator----------------");
		Iterator<Integer> keysIt=keys.iterator();
		while(keysIt.hasNext()) {
			System.out.print(keysIt.next()+" ");
		}
		
		System.out.println();
		//How to get All Values
		//return collection of values from a map
		Collection <String > valCol=map.values();
		System.out.println("Using for each loop--------------");
		for (String value: valCol) {
			System.out.print(value+", ");
		}
		System.out.println();
		System.out.println("Using iterator--------------");
		
		Iterator<String> itValues=valCol.iterator();
		while(itValues.hasNext()) {
			System.out.print(itValues.next()+", ");
		}
	}

}
