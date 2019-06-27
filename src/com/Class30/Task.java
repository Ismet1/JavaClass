package com.Class30;

import java.util.ArrayList;

/*
 * Create a generic ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
 */
public class Task {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("ismet");
		names.add("ismet1");
		names.add("ismet2");
		names.add("ismet3");
		names.add("ismet4");
		
		
		System.out.println(names.isEmpty());
		System.out.println(names.contains("ismet5"));
		System.out.println(names.get(0));
		System.out.println(names.size());
		
		for(String allvalues: names) {
			System.out.println(allvalues);
		}
	}

}
