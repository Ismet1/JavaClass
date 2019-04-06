package com.class17_2;

import com.class17.Calculator;

public class Application {

	public static void main(String[] args) {
		
		//Bu ornegimiz, class17 sinifindan, calculater'in esi.
		//burda package'lar arasi class-method-object alis verisine ornek veriyoruz.
		//Claculater 'da method'lar olusturduk ve o methodlari burda cagiriyoruz.
		//cagirma islemini olusturdugumuz object'lerle yapiyoruz asagida. ve call edince,
		//calculater sinifinda olusturdugumuz method'lar burada calisiyor.
		
		Calculator obj=new Calculator();
		int a=12;
		int b=6;
		obj.sum(a, b);
		obj.sub(a, b);
		obj.div(a, b);
		obj.mult(a, b);
		
		

	}

}
