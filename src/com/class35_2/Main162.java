package com.class35_2;

import java.util.HashMap;
import java.util.Map;

class Main162 {

	public static void main(String[] args) {
		
				Map<String, Integer> groceryMap = new HashMap<>();
				groceryMap.put("ONE", 1);
				groceryMap.put("TWO", 2);
				groceryMap.put("THREE", 3);
				groceryMap.put("FOUR", 4);
				groceryMap.put("FIVE", 5);
				
				for (Map.Entry<String, Integer> entry : groceryMap.entrySet()) {
					System.out.println(entry.getKey());
				}
			}

		

	}


