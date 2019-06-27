package com.Class33;

import java.util.HashMap;
import java.util.Map;

/*
 * Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Print all keys and values from a Best Buy map using EntrySet.
 */
public class TaskEntry {

	public static void main(String[] args) {
		
		
	Map<Integer, String> bestBuy=new HashMap<>();
	bestBuy.put(7664847, "Printer");
	bestBuy.put(7879885, "TV");
	
	
	for(Map.Entry<Integer, String>alist:bestBuy.entrySet()) {
		System.out.println(alist.getKey()+"="+alist.getValue());
	}
	

	}

}
