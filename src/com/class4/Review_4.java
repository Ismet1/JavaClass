package com.class4;

import java.util.Scanner;

public class Review_4 {

	public static void main(String[] args) {
		// ---Review-4---//

		// ---User'dan bilgi almak---//
		/*
		 * 'Scanner scan=new Scanner(System.in);' bu ifadeyi yazip soldaki kucuk
		 * dosyaciga cift tiklayip, import bar'ina cift tiklayarak, programimiz user'dan
		 * bilgi almaya yatkin hale gelir. Bu ifadedeki "scan" haric, diger tum ifadeler
		 * degistirilemez. User'dan bilgi alma durumu soyle calisir genelde; user'a bir
		 * soru sorulur ve o sorunu ardindan user'dan bilgiyi alacagimiz deger int ise;
		 * int, string ise; string yada boolean ise boolean olarak cumleye baslanir.
		 * Variable ismi yerlestirilir ve '=' yazip sonra ilk cumlede yazilanlardan
		 * sadece bir tanesi kendi secimimiz gore isimlendirilir demistik, o
		 * isimlendirdigimiz kelime yazilir, ornekte 'scan' ve sonra '.' yazilip nextInt
		 * yada nextLine yada nextBoolean yazilir. variable'in cesidine gore.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("fatih kac gol atti?");
		int gol = scan.nextInt();
		System.out.println("fatih tekke " + gol + " gol atti");
		
		//---User'dan bilgi alma---//
		/*user'dan bilgi alma ayrica su sekildede tanimlanabilir.
		 * Scanner scan;
		 * scan=new Scanner(System.in); diyede kodlanip program import hale getirilebilir.
		 */

		// ---Bir formul uygulamasi//Userdan aldigimiz veriyi donusturup yazma---//
		/*
		 * String cityName; int temp;
		 * 
		 * Scanner myScanner=new Scanner(System.in);
		 * System.out.println("Please enter your city");
		 * 
		 * cityName=myScanner.nextLine();
		 * System.out.println("Please enter temperature in Fahrenheit");
		 * temp=myScanner.nextInt();
		 * 
		 * //formula (F-32) x 5/9;
		 * 
		 * int convertedTemp=(temp-32)*5/9;
		 * System.out.println("the temperature in the city "+cityName+" is "
		 * +convertedTemp);
		 */

		// ---if ve else if condition---//
		//if=eger else if=eger o degilde buysa, else=onlarin haricindekiler ise

		/*
		 * System.out.println("Please enter the length"); int lenght=input.nextInt();
		 * System.out.println("Please enter the width"); int width=input.nextInt(); if
		 * (lenght>width) { System.out.println("The shape of your object is rectangle");
		 * 
		 * 
		 * }else if (lenght<width) {
		 * System.out.println("The shape of your object is rectangle");
		 * 
		 * }else { System.out.println("The shape of your object is square"); }
		 */
		
		//---Nested if---//
		/*Nested if'te if'in yada else'in icine baska bir if condition eklenir
		 * ve eklenen bu condition, hangisinin icine eklendiyse, onun parantezi icine girer nestedif. 
		 */
		
		/*
		int age = 18;
		int eligibleAge = 16;
		int retirementAge = 64;
		if (age < eligibleAge) {
			System.out.println("You are too young, no work for you");
		} else {
			System.out.println("You are eligible to work");

			if (age < retirementAge)
			{				System.out.println("go work hard");
			}
			else {
				System.out.println("enjoy your life");

			}
		}
		*/
		
		
	}

}
