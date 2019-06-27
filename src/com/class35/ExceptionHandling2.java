package com.class35;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("begining of the code");
		
		int a=10;
		int b=0;
		
		try {
			System.out.println(a/b);//burasi exception verdigi icin "try" blogunun icindeki hic birsey calismaz
			System.out.println("code inside try block");
		}catch (ArithmeticException e) {//catch 'in icindeki veriler calisir./Eger exception olmasaydi "try"in icindeki o zaman burasi calismiycakti.
			//Parantezin icine arithmetic exception yerine baska bisey yazsaydik, hicbirsey run olmayacakti. cunku "0"a bolunme ArithmeticException
			System.out.println("code inside catch block");
		}
		System.out.println("the end of ht e program");//fix ettigimiz icin try-catch functini ile bu line'da calisir.

	}

}
