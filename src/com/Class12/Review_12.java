package com.Class12;

public class Review_12 {

	public static void main(String[] args) {
		//---String Manupilations---//
		
		//1)Finding the words are how many letters.
		/*
		String name="ismet"; 
		int a=name.length();
		System.out.println(a);
		*/
		
		
		
		//2)Turn the all letters to uppercase or lowercase
		/*
		String name1="Tarik";
		String CapName1=name1.toUpperCase();
		System.out.println(CapName1);
		
		String lowName1=name1.toLowerCase();
		System.out.println(lowName1);
		*/
		
		
		
		
		//3)Equality-IgnoreCase Equality. We use this property with boolean.
		/*
		String str1="Hello";
		String str2="hello";
		boolean answer=str1.contentEquals(str2);
		System.out.println(answer); //cevap false cikicak cunku veri str4 ile str5 farkli. "h" buyuk ve kucuk.
		//Compares 2 strings with ignorecase
		String a="Chrome";
		String b="chrome";
		boolean equals=a.equalsIgnoreCase(b);//burda cevap true cikiyor cunku "ignorecase"yaptik
		System.out.println(equals);//harf buyuk kucuk sallamiyo yani. ignorecase cunku.
		*/
		
		
		
		
		//4)Contain function(iceriyormu-icermiyormu)
		/*
		String str="Good morning, students!";
		boolean contains=str.contains("morning");
		System.out.println(contains);
		*/
		//Contain function'da sormak istedigimiz kelimeyi parantez icine yazmak yerine, onceden tanimladigimiz bir
		//variable'i da sorabiliriz.
		/*
		String aa="Welcome, Asel";
		String bb="Welcome,";
		boolean answer=aa.contains(bb); //cevap true cikicak cuku welcome ifadenin icinde var
		System.out.println(answer);
		*/
		
		
		
		
		//Note: Iki islemi ardi ardinada yapabiliriz.
		/*
		String aa="Welcome, Asel";
		String bb="Welcome,";
		boolean answer=aa.toUpperCase().contains(bb);//false cikicak
		System.out.println(answer);
		*/
		
		
		
		
		//5)Starts-ends function; startsWith(), endsWith()
		//Hangi harfle baslayip-bittigini buldugumuz function.
		/*
		String str="Syntax";
		boolean starts=str.startsWith("S");
		System.out.println(starts);
		System.out.println(str.endsWith("x"));
		*/
		
		
		
		//6)isEmpty function. String ifadesinin icerisi bosmu degilmi diye soruyoruz.
		/*
		String str2="Hello";
		boolean answer=str2.isEmpty();
		System.out.println(answer);
		*/
		
		
		
		
		//7)Concat function ("+"'nin gorevini goruyor)
		/*
		String str3="Hello";
		String str4="Ali!";
		System.out.println(str3+str4);
		System.out.println(str3.concat(str4));
		*/
		
		
		
		
		//8)"Trim()" will remove spaces at the begining and ending
		/*
		String aaa="You may qualify for a multi-policy discount!";
		String bbb="You may qualify for a multi-policy discount! ";
		System.out.println(aaa.equals(bbb)); //false cikicak cevap cunku ayni degiller		
		//Trim(); empty places would disappear at the end and beginning
		bbb=bbb.trim();
		System.out.println(aaa.equals(bbb));//cevap true cikicak cunku trim kullanarak String icindeki "ensondaki" ve
		//"enbastaki" bosluklari trimledik.
		 */
		
		
		
		
		
		//9)charAt() --> returns a character at specified index
		/*
		String str="Students";
		char character=str.charAt(7);
		System.out.println(character);//cevap 's'
		//if we wanna print all letters one by one
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+" ");//
		}
		*/
		
		
		
		
		//10)(Aslinda charAt'in tersi) indexOf()-returns an index of specified character
		/*
		String str1="Sunday";
		int index=str1.indexOf("n");//cevap "2" cikicak cunku "n" index=2'ye esit(0-1-2)3.harf oldugu icin
		System.out.println(index);
		
		String str2="Syntax Technologies";
		System.out.println(str2.indexOf("Syntax"));//0 (burada syntax'in basladigi index'i veriyor)
		System.out.println(str2.indexOf("Technologies"));//7 (technologies'in basladigi index'i veriyor)
		System.out.println(str2.indexOf(" "));//6 (cunku bosluk 6.sirada basliyor)
		System.out.println(str2.indexOf("w"));//-1 (cunku "w" yok icerikte, olmayani "-1" olarak veriyor)
		*/
		
		
		
		//11)substring() - gives another string from your current String
		/*
		String str3= "Today is Sunday Java class";
		String newString=str3.substring(9);
		System.out.println(newString);//Sunday Java class //bu sonuc cikicak cunku '9' sirada susbtring yapiyor.(9'dan snrasini komple cikariyor)
		System.out.println(str3.substring(0, 5));//Today //bu sonuc cikicak cunku index 0 ile 5 arasinda bu letter'lar var
		System.out.println(str3.substring(9, 20));//Sunday Java
		System.out.println(str3.substring(21));//class //tek rakam yazmamiza ragmen "class" cikardi cunku ikinci numarayi yazmak isek
		//ilk rakamdan sonrasini komple cikariyor.
		*/
		
	}

}
