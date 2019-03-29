package com.class9;

public class Review_9 {

	public static void main(String[] args) {
		
		//---Foor Loop Examples and more PROPERTIES!!!----//
		
		
		/*
		 * Car Mileage Example!!!
		 * For Loop Dongusunu anlatan cok onemli bir ornek! Car mileage. 
		 * Mesela 10.000 mile'a kadar donecek bir program yapalim. En yukarida loop'tan asagiya 0-0-0 diye iniyor ve en 
		 * asagidaki loop yani inner loop 9'a gelinceye kadar sayiyor. Sonra bir usteki yani 3.loop 0'dan 1 oluyor sonra 4.loop tekrar
		 * saymaya basliyor. Bu sekilde isleyen bir mekanizma. Ilk bir kereligine yukaridan asagiya iniyor sonra, asagidan yukariya
		 * yedire yedire cikiyor.
		 */
		/* 
		for(int a=0; a<=9; a++) {
			for(int b=0; b<=9; b++) {
				for(int c=0; c<=9; c++) {
					for(int d=0; d<=9; d++) {
					
					System.out.println(a+""+b+""+c+""+d);
				}
				}
		}
		}
		*/
		
		
		
		
		
		//Digital Clock Example!!! Cool exercise for for loop and if condition together.
		/*
		for(int h=0; h<24; h++) {
			
			for(int m=0; m<60; m++) {
				
				if(m<10) {
					System.out.println(h+":0"+m);
				}else {
				
				System.out.println(h+":"+m);
			}}		}
		*/
		
		
		
		
		//Square Example!!!
		/*
		for (int i=0; i<5; i++) {
			for(int y=0; y<=6; y++) { 
				if(i==0 || i==4 || y==0 || y==6) {
				System.out.print("*");
			}else
		System.out.print(" ");
		}
			System.out.println();
		}
		*/
		
		
		
		
		
		
	}

}
