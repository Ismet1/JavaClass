package com.Class31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {

	public static void main(String[] args) {
		// lets create an arrayList of integers from 1-10.remove all odds using iterator
		
		
		ArrayList<Integer> alist=new ArrayList<Integer>();
		//alist.add(1);
		//alist.add(2);
		//alist.add(3);//gibi 10'a kadar yapicaz yada kisayol loop uyguliycaz
		
		for(int i=1; i<=10; i++) {
			alist.add(i);
		}
		System.out.println(alist);
		
		
		Iterator<Integer>iterator=alist.iterator();
		while(iterator.hasNext()) { //hasNext check ediyor herhangi bir variable varmi diye
			int number=iterator.next(); //next ise return yapiyor verileri, for loop gibi
			if(number%2!=0) {
				iterator.remove();//if conditiondaki sarti sagliyan verileri cikartiyruz. "remove" ile.
			}
		}
		System.out.println(alist);
		
	}

}
