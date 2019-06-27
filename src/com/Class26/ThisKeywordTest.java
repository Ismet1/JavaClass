package com.Class26;

public class ThisKeywordTest {

	public static void main(String[] args) {
		
		ThisKeyword obj=new ThisKeyword(10, 20);
		//diger sayfadaki constructor'a veriyor bu degerleri
		obj.sum(100, 200);
		//iki output cikartiyor. Ilk output zaten 100 ile 2oo'u 2 int'li method'un icine yerlestrip cikti veriyor.
		//Ikinci outputta ise daha oncden test sayfasinda yarattigimiz object'in icindeki rakamlari , parent sayfadaki constructor'in
		//icine yerlestiriyor. o constructor icindeki this.num'li verileri, local verilere esitlendiginden, this'li veriler
		//otomatikman 10 ve 20'li degerleri almis oluyor. Dolayisiyla "sum methodundaki" ikinci sysout this.num'li veriler oldugu
		//icin , output 30 oluyor.
		
		ThisKeyword obj1=new ThisKeyword();//the sum of instance variables=0 (cunku constructor'a bir veri girmedik)
		obj1.sum(12, 13);////the sum of local variables=2
	}

}
