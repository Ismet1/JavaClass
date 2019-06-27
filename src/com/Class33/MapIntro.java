package com.Class33;

import java.util.HashMap;
import java.util.Map;
//import java.util.*; yapiyoruz, hepsine karsilik geliyor.

public class MapIntro {

	public static void main(String[] args) {
		// Map<Key, Value>
		
		Map<Integer, String> map=new HashMap<>(); //integer=key'in karsiligi, String=value'nin karsiligi.
		//HashMap ise alt classlardan biri. 3 tane var. slaytlara bak. LinkedHashMap.
		
		//add entries(key+value)
		map.put(101, "John");
		map.put(102, "Jane");
		map.put(103, "Kate");
		map.put(104, "James");
		
		
		//retrive or access values
		System.out.println(map.get(102));//jane //ciktilarini alirken sadece key'in datasini giriyosun "get" method'a.
		
		//how to find a size of a map
		System.out.println(map.size());//4
		
		//how to update value
		map.replace(103, "Bilal");
		System.out.println(map.get(103));//bilal //replace ettik.
		
		//how to remove the value
		map.remove(104);
		System.out.println(map.size());//3 //cunku 104'u remove ettik
		
		//how to check if there is any value in the map
		System.out.println(map.isEmpty());//false //cunku valuelar var.
		
		//to see the output
		System.out.println(map);
		
		//to check is specific key/value is there
		System.out.println(map.containsKey(102));//true //key dedik key giriyoruz yani 102(integer gibi)
		System.out.println(map.containsValue("Bilal"));//true //value dedik, "Bilal" giriyoruz.(String gibi)
		
		//adding extra entries
		map.put(105, "Jane");
		System.out.println(map);
		map.put(101, "Shaban");//ayni key numarasi girince, onceki key ile replace yapiyor.
		System.out.println(map);
		
		//adding null key
		map.put(null, "Some Value");//en basa ekliyor bu key'i cunku null sifir gibi bisey.
		System.out.println(map);
		map.put(null, null);
		System.out.println(map);//null onceki null degeriyle yer degistiriyor.
		
		
	}

}
