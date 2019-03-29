package com.class7;

import java.util.Scanner;

public class Review_7 {

	public static void main(String[] args) {
		//---print/println---//
		/*println diye yazdirdigimizda cevaplar; alt alta cikiyor
		 * print diye yazdirdigimizda cevaplar; yan yana cikiyor.
		 * print(i+" ") diye yazarsak; yan yana ayrik bir sekilde cikiyor.
		 */

		
		
		//---Compound Operators---//
		/* Mesela a=20 buna 10 daha eklemek istiyoruz. a= a+10 dicegimize kisa yol direk;
		 * a+10; diyince a=30 oluyor. ayni seyi cikarma/toplama ve carpma islemlerinde de yapabiliriz.
		 */
		
		/*
		int d=30;
		d-=10;//d=d-10
		System.out.println(d);//20
		
		d+=50;//d=d+50
		System.out.println(d);//70
	
		d/=5;//d=d/5
		System.out.println(d);//14
		
		d%=2;//d=d%2
		System.out.println(d);//0
		*/
		
		
		
		//---Increment/Decrement---//
		/*d++; yada ++d; increment oluyor ve sayinin degeri '1' artiyor.
		 * d--; yada --d; decrement oluyor ve sayinin degeri '1' azaliyor.
		 * 
		 */
		
		
		
		//---post/pre(Increment/Decrement)---//
		/*
		 * Burada olan sey; ++c'yi veya c++'i tek basina kullaninca bir sorun yok cevap ayni cikar.
		 * basina ++ konmasi yada sonuna ++ konmasi, baska bir variable'i tanimlarken onem kazaniyor.
		 * burda ikiye ayriliyor. int d = 10 diyelim ve int c = ++d dersek burda c'nin degeri 11 cikar. cunku artilari
		 * once koyduk Ama c= d++ dersek c d'ye esit olur. cunku ilk d'yi yazdik ve c, d olarak tanimlandi.degeri 10 kaldi.
		 */
		
		/*
		int a=10;
		int b=++a;
		System.out.println(b);//preincrement =first increment --> assign//11
		System.out.println(a);//11
		
		int c=10;
		int d=c++;
		System.out.println(d);//postincrement= firstassign --> increment//10
		System.out.println(d);//11
		*/
		
		
		
		//---loop---//
		/*
		 * Bir ifadeyi birden fazla kez print etmek istiyorsak, loop sistemi kullanilir
		 * Loop sistemi; while, do while ve for'dur.
		 */
		
		
		
		//---while---//
		/*while kullanimi icin bir mekanizma kurulur.
		 * bir int degeri tanimlanir. Bu genelde istenilen sonucun ilk rakami yada son rakami olur
		 * sonra while condition'i konur. sonra defalarca cikmasi istenen ifade yazilir ve en son sistemi dondurecek cark konulur.
		 * yani increment yada decrement.
		 */
		
		
		//Bu ornekte 'good morning' sonucu 10 kere cikartilir.
		/*
		int a=1;
		while (a<10) {
			System.out.println("Good Morning");
			a++;
		}
		*/
		
		
		
		/*
		//Eger bir ifade defalarca ciksin, bir digeri en sonda bir defa ciksin istiyorsak, bu ornek takip edilir.
		//while parantezinin disina yazilir, en son cikmasi istenen ifade.
		int b=1;
		while (b<=5) {
			System.out.println("I am inside while loop"+b);//b degeride output'da degisir burda, sirasiyla degerlerini alir.
			b++;
		}
		System.out.println("I am outside");
		*/
		
		
		
		/*while loop'unun icine 'if' yerlestirilerek, ayri bir condition daha kurabiliriz.
		 */
		
		/*
			//print only even numbers from 10 to 100
		int num;
		num = 10;
		while (num<=100) {
			if(num%2!=1) {
			System.out.println(num);
		}
			num++; 
		}
		 */
		
		
		
		/*Loop sistemini anlayabilmemiz icin onemli bir ornek.
		 * Normalde while'i yazarken bir int tanimliyoruz ve increment yada decrement koyuyoruz disliyi cevirsin diye.
		 * eger bu mekanizmayi kurmaz sadece while'i koyarsak, ifade sonsuz kere cikar.
		 * Asagidaki ornekte istedigimiz cevabi alincaya kadar , user 'a ayni soruyu sormamiz isteniyor.
		 * ve tamda anlatilanin ornegi,
		 */
		
		/*
		Scanner scan = new Scanner(System.in);
		double price;
		System.out.println("please pay for soda");
		price = scan.nextDouble();

		while (price != 1.99) {
			System.out.println("please pay for soda");
			price = scan.nextDouble();
		}
		System.out.println("please enjoy your soda");
		 */
		
		
		
		//---Do While---//
		
		//do ile while arasindaki ana fark oncelik. oncelige gore 'do' kullaninca while condition yanlis olsa bile
		//bir kerede olsa output alabiliyorsun.
		/*
				int a=10;
				do {
					System.out.println("Hello");//hello bir kere cikti, cunku ilk dowhile kullandik. //execute first
					a++;
				}while(a>15);
		*/
		
		
		
		
		
	}

}
