package com.class35;

public class MultipleCatch {

	public static void main(String[] args) {
		// Bu ornekte 1'den fazla catch olusturma ve exceptionla ilgili bilgi alma konulari islendi.
		//Note:!! at a time only one catch block is executed
		
		System.out.println("beginning of the code");
		
		
		try {
			Thread.sleep(2000);//checked exception'i try icine koyunca hallolmus oluyor. execute olur ve catch calismaz.
			System.out.println(10/0);//line 11 execute oldugu icin sira bu line'a gelir ve execute olmiycagi icin (0'a bolunmeme exceptionindan dolayi)
			//baglantili oldugu catch'in ici run edilir.
			
		}catch (ArithmeticException e) {
			
			//bu kismi komple comment icine alip farki gorebilirsin. //burasi exceptionla ilgili bilgi almanin yollarini gosteriyor.
			//3 ways to print name and details of an exception
			e.printStackTrace();//name of exception detail and location(location at the end)
			//System.out.println(e);//name of the exception and details
			//System.out.println(e.getMessage());//only details of exception
			
			System.out.println("code of arithmetic exception catch");
			
			
		}catch (InterruptedException e) {
			System.out.println("code of interrupted exception catch");
		}
		
		System.out.println("end of the code");
	}

}
