package com.class32_2;

import java.util.ArrayList;

public class Main149 {

	public static void main(String[] args) {
		ArrayList<Integer>Numbers=new ArrayList<Integer>();
		Numbers.add(111);
		Numbers.add(222);
		Numbers.add(333);
		Numbers.add(444);
		Numbers.add(555);
		Numbers.add(666);
		
		Numbers.remove(1);
		
		System.out.print(Numbers);
		
		
		System.out.println();
		
		Numbers.clear();
		System.out.println(Numbers);

	}

}
