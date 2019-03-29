package com.class11;

public class Recap {

	public static void main(String[] args) {
		// let's create an array of names that will hold 5 elements and retrieve all values from it
		//1.create an array using new keyword
		
		/*
		String[] names=new String[6];
		names[0]="Asel";
		names[1]="Awet";
		names[2]="Arif";
		names[3]="Weqas";
		names[4]="Dzmitri";
		names[5]="Shiva"; //will get an runtime exception when trying to run
		
		for(int i=0; i<names.length; i++) {			
System.out.println(names[i]);
		}
		*/
		
		//2. create an array using array literal
		/*
		String[] studentNames= {"Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank"};
		
		for(int i=0; i<=studentNames.length-1; i++) { //-1 dedik cunku denklemde 0'dan 6'ya kadar 7 deger var.
		System.out.println(studentNames[i]);
		}
		*/
		
		
		//retrieve values using: advanced for loop, for each loop, enhanced for loop
		
		
		String[] studentNames= {"Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank"};
		for (String student : studentNames) { //bu sekilde listeyi "student" kelimesine tanimladik ve hepsinin ciktisini aldik.
			System.out.println(student);    //bu sisteme advenced yada each loop deniyor.
		}
		
	}

}
