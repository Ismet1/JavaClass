package com.class35_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main165 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
		
		
		Set<String>prn=map.keySet();
		System.out.println("HashMap Before Remove");
		for(String prn1:prn) {
			System.out.println(prn1+" : "+map.get(prn1));
		}
		
		
		map.replace("THREE", "ASEL");
		map.replace("FIVE", "SUMAIR");
		System.out.println("------------------");
		System.out.println("HashMap After Remove");
		
		for(String prn1:prn) {
			System.out.println(prn1+" : "+map.get(prn1));
		}
		
	}

}
