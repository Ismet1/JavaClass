package com.Class30;

import java.util.ArrayList;

public class IntegerArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers=new ArrayList<Integer> ();
		numbers.add(10);
		numbers.add(20);
		numbers.add(33);
		numbers.add(100);
		
		numbers.set(2, 3333);//burada 2.index'i 3333 ile degistirdik, set yaptik.
		
		for(Integer num:numbers) {
			System.out.println(num);//10,20,3333,100
		}
	}

}
