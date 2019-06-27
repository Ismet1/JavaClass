package com.Class31;

import java.util.ArrayList;
import java.util.Iterator;

//2.Create an arrayList of words. Remove every word that ends with “e”.
public class Task2 {

	public static void main(String[] args) {
		ArrayList<String> words=new ArrayList<String>();
		words.add("Remove");
		words.add("Every");
		words.add("Word");

		Iterator<String>it=words.iterator();
		while(it.hasNext()) { 
			String WordWithE=it.next(); 
			if(WordWithE.endsWith("e")) {
				it.remove();
			}
		}
		System.out.println(words);
		
	}

}
