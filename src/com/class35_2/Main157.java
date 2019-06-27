package com.class35_2;

import java.util.HashSet;

class Main157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> row=new HashSet<String>();
		row.add("first");
		row.add("second");
		row.add("third");
		row.add("fourth");
		row.add("fifth");
		
		System.out.println(row);
		row.remove("second");
		System.out.println(row);
		row.removeAll(row);
		System.out.println(row);
	}

}
