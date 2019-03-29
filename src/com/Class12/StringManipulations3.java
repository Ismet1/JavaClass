package com.Class12;

public class StringManipulations3 {

	public static void main(String[] args) {
		
		// charAt() --> returns a character at specified index
		String str="Students";
		char character=str.charAt(7);
		System.out.println(character);
		
		//we wanna print all letters one by one
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+" ");//
		}
		
		
		//Baska Ornek //indexOf()-returns an index of specified character
		String str1="Sunday";
		int index=str1.indexOf("n");//cevap "2" cikicak cunku "n" index=2'ye esit(0-1-2)3.harf oldugu icin
		System.out.println(index);
		
	
		String str2="Syntax Technologies";
		System.out.println(str2.indexOf("Syntax"));//0 (burada syntax'in basladigi index'i veriyor)
		System.out.println(str2.indexOf("Technologies"));//7 (technologies'in basladigi index'i veriyor)
		System.out.println(str2.indexOf(" "));//6 (cunku bosluk 6.sirada basliyor)
		System.out.println(str2.indexOf("w"));//-1 (cunku "w" yok icerikte, olmayani "-1" olarak veriyor)
		
		
		//substring() - gives another string from your current String
		String str3= "Today is Sunday Java class";
		String newString=str3.substring(9);
		System.out.println(newString);//Sunday Java class //bu sonuc cikicak cunku '9' sirada susbtring yapiyor.(9'dan snrasini komple cikariyor)
		System.out.println(str3.substring(0, 5));//Today //bu sonuc cikicak cunku index 0 ile 5 arasinda bu letter'lar var
		System.out.println(str3.substring(9, 20));//Sunday Java
		System.out.println(str3.substring(21));//class //tek rakam yazmamiza ragmen "class" cikardi cunku ikinci numarayi yazmak isek
		//ilk rakamdan sonrasini komple cikariyor.
		
		
	}

}
