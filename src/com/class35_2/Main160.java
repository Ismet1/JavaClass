package com.class35_2;

import java.util.HashSet;

class Main160 {

	public static void main(String[] args) {
		HashSet<String> row = new HashSet<String>();
		row.add("first");
		row.add("second");
		row.add("third");
		
		System.out.println("My HashSet content:");
		System.out.println(row);
		System.out.println("Clearing HashSet:");
		System.out.println("Content After clear:");
		row.removeAll(row);
		System.out.println(row);

	}

}
