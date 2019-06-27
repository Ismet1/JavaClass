package com.Class30;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> greetings=new ArrayList<String>();
		greetings.add("Hello");
		greetings.add("Welcome");
		greetings.add("Hi");
		greetings.add("Bye");
		
		System.out.println(greetings.get(1));//welcome //.get diyince kelimenin kendiini print ediyoruz. "1"yazdik dolayisiyla arrayin 1.siradakini cikariyor.
		System.out.println(greetings.size());//4 //arrayin size i 4.
		
		//collections - growable in size //yani size istedigimiz gibi cogaltabiliriz.
		greetings.add("how are you?");
		greetings.add("how are you?");
		greetings.add("how are you?");
		System.out.println(greetings.size());//7 //7 oldu genislettik.
		
		System.out.println("for loop--------------------------------------");
		for (int i=0; i<greetings.size(); i++) {
			System.out.println(greetings.get(i));//butun add yaptiklarimizi get yapicak burada for loop araciligiyla
		}
		
		System.out.println("advance for loop--------------------------------------");
		for(String greetWords: greetings) {
			System.out.println(greetWords);
		}
	}

}
