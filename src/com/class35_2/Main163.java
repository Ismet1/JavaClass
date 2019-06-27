package com.class35_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main163 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map=new HashMap<>();
		map.put("Shiva",222);
		map.put("Sandish",333);
		map.put("Asel",555);
		map.put("Sumair",666);
		
		Set<String> snow = map.keySet();
		
		Iterator<String>it=snow.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
