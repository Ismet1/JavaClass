package com.class35_2;


import java.util.HashSet;
import java.util.Iterator;



class Main156 {

	public static void main(String[] args) {
		
		HashSet <String> row=new HashSet<String>();
		row.add("first");
		row.add("second");
		row.add("third");
		row.add("fourth");
		row.add("fifth");
		
		Iterator<String> it=row.iterator();
		while(it.hasNext()) {
			String row1=it.next();
			System.out.println(row1);
		}
		System.out.println("Does HashSet contains first element? "+row.contains("first"));
	}

}
