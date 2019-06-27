package com.Class34;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names= {"Mehmet", "Asha", "Amina", "Omar", "Siyar", "Danny"};
		
		Map<Integer, String> nameMap=new LinkedHashMap<>();
		
		int key=1;
		for (String name:names) {
			nameMap.put(key, name);
			key++;
		}
		System.out.println(nameMap);
		
		
		
		//print key and values using entrySet(Loop & Iterator)
		
		for(Map.Entry<Integer, String> entry:nameMap.entrySet()) {
			String mapEntry = entry.getKey() +" "+ entry.getValue();
			System.out.println(mapEntry);
		}
		
		Iterator<Map.Entry<Integer, String>> it=nameMap.entrySet().iterator();
		while (it.hasNext()){
		Map.Entry entry = it.next();
		String entryMap = entry.getKey() +" "+ entry.getValue();
		System.out.println(entryMap);
		}
	}

}
