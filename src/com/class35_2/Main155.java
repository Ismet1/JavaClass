package com.class35_2;

import java.util.HashSet;

public class Main155 {

	public static void main(String[] args) {
		
		HashSet <Integer> numbers=new HashSet<Integer>();
		numbers.add(111);
		numbers.add(111);
		numbers.add(111);
		numbers.add(999);
		numbers.add(999);
		numbers.add(999);
		
		
		for(int num:numbers) {
			System.out.println(num);
		}
	}

}
