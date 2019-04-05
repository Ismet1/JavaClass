package com.class14;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse  a string without using a reverse function

		
		String original="Today is Java Class";
		String reverse="";
		
		//1st way using toCharArray
		char[] array=original.toCharArray();
		for (int i=array.length-1; i>=0; i--) {
			reverse=reverse+array[i];
		}
		System.out.println("Reverse String is: "+ reverse);
		
		
		//2nd way using charAt()
		String reverse1="";
		
		for (int i=original.length()-1; i>=0; i--) {
			reverse1=reverse1+original.charAt(i);
		}
		System.out.println("Reverse String is: "+ reverse1);
		
		
		
		
		//3rd way using substring()
		String reverse2="";
        for(int i = original.length(); i>0; i--) {
            reverse2+=original.substring(i-1,i);
        }
        System.out.println("Reverse String is: " + reverse2);
		
		
		
		
		
		
		
	}

}
