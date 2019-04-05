package com.class14;

public class TaskSplit {

	public static void main(String[] args) {
		//Task-1
		/*
		 * Create a string that will hold a sentence write a program to get a new string
		 * without any spaces
		 */

		String sentence="Ismet gets tired easily";
		String newSentence= sentence.replace(" ", "");
		System.out.println(newSentence);
		
		
		
		//Task-2
		/*
		 * Createa string that should be combination of letters, numbers and special characters.
		 * Find out how many alpha characters are there in the string 
		 */	
		String str="ismet%100tired";
		String newStr=str.replaceAll("[a-z0-9]", "");
		System.out.println(newStr.length());
		
		
		//Task-3
		/*
		 * You have a String a="Is it saturday? Is it raining? Do we have a Java Class today?"
		 * how would you find out how many sentences are in the String?
		 */
		String a= "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array = a.split("\\? ");
		System.out.println(array.length);
		
		
		
	}

}
