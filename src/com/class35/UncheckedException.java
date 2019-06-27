package com.class35;

public class UncheckedException {

	public static void main(String[] args) {
		// Code'u yazinca gorunmuyolar fakat gizlice var olan exceptionlar.
		
		//ornek1
		int [] array = {12,13,12};
		System.out.println(array[3]);
		//Exception'in ismi =  java.lang.ArrayIndexOutOfBoundsException //cunku array icinde index 3 yok. (0,1,2)
		
		//ornek2
		String a="Hello";
		System.out.println(a.charAt(5));//java.lang.StringIndexOutOfBoundsException //cuku 5. index yok
		
		//ornek3
		String str=null;
		System.out.println(str.length());//NullPointerException //cunku null'un length'i olmaz
	}

}
