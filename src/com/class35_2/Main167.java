package com.class35_2;

import java.util.HashMap;
import java.util.Map;

public class Main167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map=new HashMap<>();
		map.put("mango", 10);
		map.put("apple", 30);
		map.put("orange", 20);
		map.put("mango", 40);
		map.put("mango", 40);
		
		
		System.out.println(map);
	}

}
