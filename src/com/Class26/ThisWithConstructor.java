package com.Class26;

public class ThisWithConstructor {

	
	ThisWithConstructor() {
		System.out.println("i am inside constructor with no parameters");
		System.out.println("I have no parameters");
	}
	
	
	ThisWithConstructor(String str) {
		this();//hre zaman ilk line da olmali this. mesela burda 16 line'a koysydik calismayacakti.
		System.out.println("i am inside constructor with 1 parameters");
		System.out.println("I have 1 string parameters"+str);
	}
	
	ThisWithConstructor(String str1, String str2) {
		this(str1);//bu this constructor oluyor ve "1 string"li olana tanimlandigi icin, ortadaki methodu print ediyor.
		System.out.println("i am inside constructor with 2 parameters");
		System.out.println("I have 2 string parameters"+str1+" "+str2);
	}
	
	
	public static void main(String[] args) {

		//ThisWithConstructor obj1 = new ThisWithConstructor();
		//ThisWithConstructor obj2 = new ThisWithConstructor("Hello");
		ThisWithConstructor obj3 = new ThisWithConstructor("Hello", "Bye");//bunu yazmassak "this constructorlar"'da calismaz. cunku ayni constructordalar.
		
		//Su durumda outputta tum sonuclari goruyoruz cunku tek bir object olusturmamiza ragmen.
		//cunku digerlerini 'this constructor' ile print ediyoruz.
	}

}
