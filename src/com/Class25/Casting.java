package com.Class25;

public class Casting {

	public static void main(String[] args) {
		
		//Implicit(Automatic casting)casting or Widening
		//10 yazmamiza ragmen output'u double a uygun cikariyor. Buna implicit casting deniyor
		//cunku double int a gore daha buyuk data type dolayisiyla kendi donusebiliyor
		double a=10;
		System.out.println(a);//10.0 //compiler takes care of conversion
		
		
		//Explicit casting or Manual Casting or Narrowing
		//burda buyuk data type i kucuk data type'in icine kendimiz yerlestiriyoruz
		double b=10.0;
		int c=(int)b;
		System.out.println(c);

		int i=130;
		byte by=(byte)i;//byte istisna sanirim
		System.out.println(by);
		
		//UpCasting (buyukten kucuge otomatik ceviriyo biraz onceki gibi
		Payment pay = new MasterCard();
		
		
		//MasterCard mc = new Payment(); //compiler not allow you cunku kucukten buyuge.
		//dolayisiyla biz kendimiz cevirmek istiyosak buna "DownCasting" deniyor
		//MasterCard mc =(MasterCard)new Payment();
	}

}
