package com.class8;

import java.util.Scanner;

public class Review_8 {

	public static void main(String[] args) {
		//---for loop---///
		/*
		for (int i=0; i<=5; i++) { //for'da son i++'a noktali virgul konmuyor)(ifade 'int' ile basliyoruz)
			System.out.println("good morning"); //'good morning' 5 kere tekrar edicek
		}
		 */

		
		
		/*
		for (int b=1; b<=50; b+=5) { //initialization/condition/code/increment-decrement
			System.out.print(b+ " ");
		}
		*/
		
		
		
		/*For'a guzel bir ornek. For'un icine yazdigimiz hersey, for fonksiyonunda kurdugumuz duzenegin
		 * sayisinca doner. Asagidaki ornekte iki sayi isteniyor user'dan. cevap'i almamiza ragmen, pc 5 defa yeniden
		 * iki rakam istiycek user'dan.
		 */
		
		/*
		Scanner myScanner;
        int num1, num2;
        int largest = 0;

        myScanner = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) { 
            
            System.out.println("Please enter 2 numbers");
            num1 = myScanner.nextInt();
            num2 = myScanner.nextInt();

                if (num1 > num2) {
                    largest = num1;
                } else if (num2 > num1) {
                    largest = num2;
                } else {
                    System.out.println(num1 + " is queals to" + num2);
                }

            System.out.println(largest + " is the largest");
        }
		*/
		
		
		
		//Bir baska ornek daha. user'dan iki rakam alip, o rakamlar arasindaki rakamlari nasil cikartiriz?
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a starting number");
		int startNumber=scan.nextInt();
		
		System.out.println("please enter an ending number");
		int endNumber=scan.nextInt();
		
		for(int i=startNumber; i<=endNumber; i++) {
			System.out.println(i);
		}
		 */
		
		
		
		//---Break/Continue---//
		
		
		//Break sistemi durdurur tamamen
		/*
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break; // i=5 sartina gelene kadar break yapmiyor, dolayisiyla 1/2/3/4 sonucu cikiyor.
			}
			System.out.println(i);
		}
		*/
		
		//ikinci ornek, ilk ornekle arasindaki fark, ilk ornekteki gibi break'i bir if condition'a baglamadigimiz icin
		//sistem bir kere donecek ve 'hello' sonucu bir kere print olucak.
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
			System.out.println(i);//burada sonuc 0/1/2/3/4/6 cikicak, yani 5'ten sonrada sonuc vermeye devam edicek. Break'le olan farki.
		}
		*/
		
		
		
		//---Finding the sum---//
		
		//find sum of the all even numbers from 1 to 100
				/*
				 int sum=0;
				 for (int i=0; i<=100; i+=2) { //i<=100'ifadesinden sonra denklem coding'e gidip sonra i+=2'ye gidiyor.
					 sum=sum+i;
				 }
				 System.out.println(sum);
				 */
		
		
		
		
		
		
		
	}

}
