package com.Class30;

public class WrapperClass {

	public static void main(String[] args) {
		
		Integer integer1=new Integer(10);//Boxing
		System.out.println(integer1);
		Integer integer2=10;//AutoBoxing
		//Yukarida bir kere object'i olusturduktan sonra digerlerini line9 daki gibi olusturabiliriz(autoboxing)

		int num=integer1.intValue();//unboxing
		System.out.println(num);
		
		int num2=integer2;//AutoUnboxing
	}

}
