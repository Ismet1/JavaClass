package com.class3;

public class Review_3 {

	public static void main(String[] args) {
		
		//---Concatenate---//
		
		/*
		String a="Hello";
		String b="Bye";
		
		int x = 10;
		int y = 20;
		
		System.out.println(x+y+a+b); //30HelloBye
		System.out.println(x+a+y+b); //10Hello20Bye
		System.out.println(x+a+b+y); //10HelloBye20
		System.out.println(a+b+x+y); //HelloBye1020 cunku sonda oldugu icin! string olarak basliyor.
		System.out.println(a+b+(x+y)); //HelloBye30
		System.out.println((a+b)+x+y); //HelloBye1020
		System.out.println(a+b+x*y); //HelloBye200
		System.out.println(a+b+y/x); //HelloBye2
		System.out.println(a+b+(y-x)); //HelloBye10
		*/
		
		//note; ilk once yazilan tum islemler yapilir ancak islemleri sonda yapmaya calistigimizda; sonucu negatif olanlari ve 
		//toplama islemlerini sonucta vermiyor.
		
		
		
		//---Arithmetic Operators---//
		/* int'da yapilan bir carpma yada bolme sonucu ondalikli cikmaz, tam sayi cikar. ondalikli sonuc icin double kullanmaliyiz
		 * int a= 10/3 sonucu "3" tur ama double a = 10/3 sonucu "3.33333333333335"
		 * int ile double'in bir diger terslesmesi ise ayni program icerisinde ayni verileri hem int hem double ile declare edemeyiz.
		 * Hata verir ama asagidaki gibi farkli verileri declare edebiliriz.
		 */
		
		/*
		double a, b;
		a=10;
		b=3;
		int c, d;
		c=10;
		d=3;
		
		int div=c*d;
		double divi=a/b;
		System.out.println(divi);
		System.out.println(div);
		*/
		
		//---Parentheses, Exponents, Multiplication/Division, Modulus, Addition/Substraction (islem sirasi)---//
		
		/*
						int e=-5+4*6;
						System.out.println(e);
						
						int x=(22+9) % 7;
						System.out.println(x);
						
						int y = 20 + -3*5 / 8;
						System.out.println(y);
						
						int z = 5 + 15 / 3*2 - 8 % 3;
						System.out.println(z);
		*/
		
		//---Equality Operators---//
		// <, >, <=, >=, ==, !=(not equal)
		// rakamlar icin esittir "==" ama string'ler icin esittir '.equals' ve ikinci veri parantez icinde yazilir.
		// yani su sekil  'word1.equals(word2)'
		
						
		//---IF/ ELSE IF(2.IF) / ELSE---//
						
		int a, b;
		a = 10; b = 5;
		
		if (a>b) {
			System.out.println("Ahamda dogru cevap"); } 
		else if (a==b) {
			System.out.println("La deli esit olurmu hic"); }
		else {
			System.out.println("baska bi dogru cevapta yok hade bakem!"); }
		
						
						
						
						
						
	}

}
