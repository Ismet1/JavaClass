package com.Class30;

import java.util.ArrayList;

public class ArrayListTypes {

	public static void main(String[] args) {
		// generic array that stores only string object
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("ismet");
		names.add("ismet1");
		names.add("ismet2");
		names.add("ismet3");
		names.add("ismet4");
		
		
		//non generic array that stores any type of object
		ArrayList alist =new ArrayList();
		alist.add("String");
		alist.add(100);
		alist.add(100.10);
		alist.add(true);
		alist.add('a');
		
		for(Object values: alist) { //non generic array listte, farkli type ta veriler girince veri  tipi olarak "Object" yaziyoruz "Advance For"'a.
			System.out.println(values);
		}
		
	}

}
