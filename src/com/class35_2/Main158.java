package com.class35_2;

import java.util.ArrayList;
import java.util.HashSet;

class Main158 {

	public static void main(String[] args) {

		
	
		
		HashSet<String> row = new HashSet<String>();
		row.add("first");
		row.add("second");
		row.add("third");
		row.add("fourth");
		row.add("fifth");

		System.out.println("HashSet contains: "+row+"Array elements: ");
		
		ArrayList<String>order=new ArrayList<>(row);
		for (String row1 : order) {
			System.out.print(row1+" ");
		}
		

	}
}
