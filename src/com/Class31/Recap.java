package com.Class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		
		int[] array= {10,10,20,20};
		
		
		
		//Oncekileri unut yeni ArrayList olusturuyoruz;
		
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(0, 13);//bu sekilde yapinca 13'u 0 indexine yaziyor yani grup spyle oldu(13, 12)
		//.add(index, element) cikiyor ordan yerlestiriyoruz 0 ile 13'u.
		numbers.add(0, 14);//bu durumda 12 en son index'e gitti 2.index oldu. 14 ise 0ci index oldu
		
		System.out.println(numbers.size());//3
		System.out.println(numbers.get(2));//12
		
		
		numbers.set(1, 33);//1. index'i 33 ile degistirdik 14 gitti yani.
		System.out.println(numbers.get(1));//33
		System.out.println(numbers.contains(33));//true
		
		
		//4 ways of getting print of ArrayList
		System.out.println("1st way using for loop");
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
			

		System.out.println("2nd way using advanced for loop");
		for(int num: numbers) {
		System.out.println(num);
		}
		
		
		System.out.println("3rd way using iterator");
		Iterator <Integer>it=numbers.iterator();//import iterotor yapicaksin soldaki errordan
		while(it.hasNext()) {
			int number=it.next();
			System.out.println(number);
		}
		
		
		System.out.println("4t way by using while");
		int c=0;
		
		while(numbers.size()>c) {
			int myNum=numbers.get(c);
		System.out.println(myNum);
		c++;
		}
	}

}
