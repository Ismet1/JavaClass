package com.class8;

public class BreakContinue {

	public static void main(String[] args) {
		// ---BreakContinue--//
/*
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break; // i=5 sartina gelene kadar break yapmiyor, dolayisiyla 1/2/3/4 sonucu cikiyor.
			}
			System.out.println(i);
		}
		*/
		
		//ikinci ornek, ilk ornekle arasindaki farka bak
		/*
		for (int i = 0; i <= 4; i++) {
			System.out.println("hello"); //break sistemi durdurdu.
				break; 
			}	
		*/
		
		//continue
		
		/*
		for(int i=0; i<=6; i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		*/
		
		/*
		for (int i=0; i<5; i++) {
			if(i==2) {
				continue;
			}
			System.out.println(i);
			System.out.println("hi");
			}
		System.out.println("im outside of for loop"); //bu satir for condition'in dsinda oldugu icin en son loop'tan sonra print olucak
	    */
		
		
		//print from 1 to 20 but skip that divisible by3
		/*
		for(int a=1; a<=20; a++) { 
			if (a%3==0) {
				continue;
			}
			System.out.println(a);
		}
		*/
		
		
		
		
		
	}
}