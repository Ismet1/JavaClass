package com.Class33;

import java.util.HashMap;
import java.util.Map;

/*
 * Create a map of a building. Store floor number and it is associated company name. 
 * (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */
public class TaskMap {

	public static void main(String[] args) {
		
		Map<Integer, String> building=new HashMap<>(); 
		
		
		building.put(1, "Google");
		building.put(2, "Microsoft");
		building.put(3, "Apple");
		building.put(4, "Nokia");
		building.put(4, "Syntax");
		building.put(5, "Google");
		building.put(6, "Opel");
		
		System.out.println(building.size());
		building.replace(4, "The Ismet's Syntax");
		building.remove(7);
		System.out.println(building);

	}

}
