package com.Class12;

public class StringManipulations {

	public static void main(String[] args) {
		// Length function or method
		
		
		
		//1)verinin kac karakter yani letter'dan olustugunu buluyorz
		String str="Syntax"; 
		int lengthOfString=str.length();
		System.out.println(lengthOfString);
		
		String str1="Syntax Tech";
		int lengthOfString2=str1.length();
		System.out.println(lengthOfString2);
		
		
		String str2="Welcome, students!";
		int lengthOfString3=str2.length();
		System.out.println(lengthOfString3);
		
		
		//2)turn the all letters to uppercase or lowercase
		String str3="Hello";
		String newString=str3.toUpperCase();
		System.out.println(newString);
		
		String lowerCaseString=newString.toLowerCase();
		System.out.println(lowerCaseString);
		
		
		
		//3)equals() - compares 2 strings, if string are equal-->true, else-->false
		String str4="Hello";
		String str5="hello";
		boolean equality=str4.contentEquals(str5);
		System.out.println(equality); //cevap false cikicak cunku veri str4 ile str5 farkli. "h" buyuk ve kucuk.
		
		//compares 2 strings but ignorecase
		String expectedBrowser="Chrome";
		String actualBrowser="chrome";
		boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);//burda cevap true cikiyor cunku "ignorecase"yaptik
		System.out.println(equals);//harf buyuk kucuk sallamiyo yani. ignorecase cunku.
		
		
	}

}
