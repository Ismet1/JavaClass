package com.class36;

public class StringIsImmutable {

	public static void main(String[] args) {
		// 2 way creating a string
		//1st way
		String str="hello";
		
		//2nd way
		String str2 = new String("Bye");
		
		str.toUpperCase();//HELLO //garbage collcter man will comeand destroy it cuz we didnt point it out (str=)
		str.replace("o", "a");//hella //garbage collecter man come and destry it cuz we didnt point it out (str=)
		
		System.out.println(str);//hello //cuz string immutable

	}

}
