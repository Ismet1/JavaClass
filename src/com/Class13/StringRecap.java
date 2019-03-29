package com.Class13;

public class StringRecap {

	public static void main(String[] args) {
		// Task-1
		
		//Create a String and print it in reverse order (Sunday - yadnuS).

		String rev="Sunday";
        for(int i=5; i>=0; i--) {
            System.out.print(rev.charAt(i));
        }
		
		
        System.out.println();
        
        
        //Task-2
        //Create a String and if the String is not empty perform the following: 
        //if the String has an odd number of characters and has 3 or more characters, 
        //print the character in the middle of the String
        
        String a="ismet";
        int b=a.length();
        boolean answer=a.isEmpty();
		if (!answer) {
			if (b>3 & b%2==1 ) {
				System.out.println(a.charAt(a.length()/2));//kelimenin ortasindaki harfi bu sekilde buluyoruz.
			}
		}
	}

}
