package com.Class31;

import java.util.ArrayList;
import java.util.Iterator;

//4.Create an arrayList of even numbers from 1 to 50. Using Integer remove any number that is divisible by 5 from that arrayList.
public class Task4 {

	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList<Integer>();
		
		for(int i=1; i<=50; i++) {
			if(i%2!=0) {
			alist.add(i);}
		}
		System.out.println(alist);
		
	
		Iterator<Integer>it=alist.iterator();
		while(it.hasNext()) { 
			int number=it.next(); 
			if(number%5==0) {
				it.remove();
			}
		}
		System.out.println(alist);
	}

}
