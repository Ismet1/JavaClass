package com.Class12;

public class StringManipulations2 {

	public static void main(String[] args) {
		// String Manupulation'lara genelde boolean'le bakiyoruz cevabini.
		
		//1)contain function(iceriyormu-icermiyormu)
		String str="Good morning, students!";
		boolean contains=str.contains("morning");
		System.out.println(contains); //true olucak cunku morning String'in icinde var.
		//eger "morning" degilde "Morning" yazsak cevap --> false olucak cunku "m" buyuk harfle sorulmus olcak.
		
		
		//2)iki function'i ardi ardina uygulamak.
		String present="Welcome, Asel";
		String neededValue="Welcome,";
		
		boolean flag=present.contains(neededValue); //cevap true cikicak cuku welcome ifadenin icinde var
		System.out.println(flag);
		
		boolean flag1=present.toUpperCase().contains(neededValue);//false cikicak cevap cunku ilk olarak "present'a tanimladigimiz
		System.out.println(flag1);//ifadeyi uppercase yaptik sonra neededValue'ya tanimladigimiz ifade senin icinde mevcutmu dedik.
		//dolayisiyla cevap "false" cikti. Cunku uyusmuyo veriler.
		
		
		//3)starts-ends function; startsWith(), endsWith()
		//Hangi harfle baslayip-bittigini buldugumuz function.
		String str1="Syntax";
		
		boolean starts=str1.startsWith("S");
		System.out.println(starts);
		System.out.println(str1.endsWith("x"));
		
		
		
		//4)isEmpty function. String ifadesinin icerisi bosmu degilmi diye soruyoruz.
		String str2="Hello";
		boolean isEmpty=str2.isEmpty();
		System.out.println(isEmpty);
		
		
		
		//5)concat function ("+"'nin gorevini goruyor)
		String str3="Hello";
		String str4="Ali!";
		System.out.println(str3+str4);
		System.out.println(str3.concat(str4));
		
		
		//6 ile 7'yi beraber calistir.
		//6)"Trim()" will remove spaces at the begining and ending
		String expected="You may qualify for a multi-policy discount!";
		String actual="You may qualify for a multi-policy discount! ";
		System.out.println(expected.equals(actual)); //false cikicak cevap cunku ayni degiller		
		//7)Trim(); empty places would disappear at the end and beginning
		actual=actual.trim();
		System.out.println(expected.equals(actual));//cevap true cikicak cunku trim kullanarak String icindeki "ensondaki" ve
		//"enbastaki" bosluklari trimledik.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
