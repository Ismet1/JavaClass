package com.class6;

import java.util.Scanner;

public class Review_6 {

	public static void main(String[] args) {
		
		
		//---Nested If---//
		/* If condition'in icinde ikinci bir if condition acmak.
		 * Bu ornekte ayrica; her seferinde "sysout" yapip print almanin yerine , resultari bir variable'a esitleyip
		 * esitledigimiz variable'i en sonda print etmenin ornegini goruyoruz.
		 */

		
		/*
		int num1, num2, num3, largest;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your 3 numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		if(num1>num2) {
			if(num1>num3) {
		
				largest=num1;
			}else {
				largest=num3;
			}	
		}else {
			if (num2>num3) {
				largest=num2;
		
			}else {
			largest=num3;
			}}
		System.out.println("the largest number is "+largest);
		*/
		
		
		//---Not Operator(!)---//
		
		/*
		 boolean b=!true;
		 
		 if(b) {
		System.out.println("the value of boolean variable is "+ b);
		 }else {
			 System.out.println("fuck you");
		 }
		 */
		 
		/*
		boolean snow=false;
		if (!snow) {
			System.out.println("i wll come");
		}
		*/
		
		
		//---AND(&)YADA(&&)---// //---OR(||)---//
		/*Bir sarti saglamasi icin, arasina kondugu iki ifadeninde dogru olmasi lazim
		 * if(temp>25 & temp<40) burda temp hem 25'ten buyuk hemde 40'tan kucuk olucakki,
		 * bu ifin altindaki veri print olsun, digerturlu else'tekini cikartir.
		 * 
		 * Or'da ise; if(temp>25 || temp<40) orneginde, temp verisi user tarafindan 20 girilse bile bu sartin altindaki
		 * veri print edilir. cunku sartlardan biri saglanmis oluyor. Iki sarttan bir tanesi saglanirsa Or'da veri 
		 * print edilir.
		 */
		
		/*
		 int num=15;
		
		if (num>=1 && num<=10) {
			System.out.println("number is small");
			//true and true
		}else if(num>=11 && num<=100) {
			System.out.println("number is medium");
			//false and true
		}else if(num>=101 && num<=1000) {
			System.out.println("number is large");
		}else {
			System.out.println("invalid number");
		}
		 */
		
		/*
		int day=5;
		// false or false or false or false or true -->true
		if (day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("it is a weekday");
			//false or false --->false
		}else if (day==6 || day==7) {
			System.out.println("it is a weekend");
		}else {
			System.out.println("Not a valid day");
		}
		*/
		
		//---SwitchCase---//
		/* User'dan alicagimiz degiskenlik gosterecek ifadeyi temsil eden kelime(sorulan sey) switch'in icine yazilir.
		 * Muhtemel cevaplari ise Case'in yanina yazip iki nokta koyariz. Muhtemel cevaplar numara is tirnak isareti
		 * olmadan yazabiliriz. Muhtemel cevaplar String ise tirnak isarretinin icine konur.
		 * break; cikartildigi zaman etkisi olurmu? cevap baska bir siradaki veriye gidecekse zaten etkisi olmaz, olup olmamasi
		 * bir onem arzetmez. Ama cevap break cikarildigi siradaki case'e esitse o zaman cevap bir asagi siraya kayar.
		 * break cevabi tutmaya yariyor. Cevap zaten o siradaki case 'de degilse bir anlam ifade etmiyor.
		 * default; bu condition'in else hukmunde. oncekiler degilse cevap bur seklinde.
		 */
		
		/*
		int day=7;
	String dayName;
	
	switch (day) {
	case 1:
		dayName="Monday";
		break;
	case 2:
		dayName="Tuesday";
		break;
	case 3:
		dayName="Wednesday";
		break;
	case 4:
		dayName="Thursday";
		break;
	case 5:
		dayName="Friday";
		break;
	case 6:
		dayName="Saturday";
		break;
	case 7:
		dayName="Sunday";
		break;
	default:
			dayName="Invalid";
	}
	System.out.println(dayName);
		 */
		
	}

}
