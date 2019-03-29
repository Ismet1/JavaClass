package com.class8;

public class forloop {

	public static void main(String[] args) {
		//---for loop---///
		/*
		for (int i=0; i<=5; i++) { //for'da son i++'a noktali virgul konmuyor)
			System.out.println("good morning"+i);
		}
*/
		
		//i want to print numbers from 10 to 1
		
		/*
		for (int i=10; i>=1; i--) { 
			System.out.println(i);
		}
		*/
		
		//what is the output
		
		/*
		for (int a=0; a<=20; a+=2) {
			System.out.println(a); //from 0 to 20 even numbers
		}
		*/
		
		/*
		for (int b=1; b<=50; b+=5) { //initialization/condition/code/increment-decrement
			System.out.print(b+ " ");
		}
		*/
		
		//print numbers from 1 to 100
		/*
		for (int b=1; b<=100; b++) {
			System.out.print(b+ " ");
		}
		*/
		
		//print numbers from 100 to 1
		/*
		for (int b=100; b>=1; b--) {
			System.out.print(b+ " ");
		}
		*/
		
		//print odd numbers from 1 to 20(2 ways)
		/*
		for (int b=1; b<=20; b+=2) {
			System.out.print(b+ " ");
		}
		*/
		
		//print even numbers from 20 to 1
		/*
		for (int b=20; b>=1; b-=2) {
			System.out.print(b+ " ");
		}
		*/
		
		//print even numbers between 20 and 50
		/*
		for (int b=20; b<=50; b+=2) {
			System.out.print(b+ " ");
		}
		*/
		
		//print odd numbers between 20 and 50
		/*
		for (int b=21; b<=50; b+=2) {
			System.out.print(b+ " ");
		}
		*/
		
	
		for (int b=20; b<=50; b++) { //2.way
			if(b%2==1)
			System.out.print(b+ " ");
		}
		
	}

}
