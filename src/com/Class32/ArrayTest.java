package com.Class32;

public class ArrayTest {

	public static void main(String[] args) {
		
		
		String a="A";
		String b=new String("B");
		
		int[] intArray= {10,21,34};
		String[] stringArray= {"Hello", "Bye"};
		
		
		//can we place object into array?
		
		Visa visa1 =new Visa("Visa Platinum");
		Visa visa2 =new Visa("Visa Platinum");
		Visa visa3 =new Visa("Visa Platinum");
		

		AX ax1 =new AX("ax Platinum");
		AX ax2 =new AX("ax Platinum");
		AX ax3 =new AX("ax Platinum");
		
		
		//Bunlar normal array. Arraylist ile farklari size.Bunlarda sonradan ekleme yapamiyoruz. ama arraylist'lerde yapabiliyoruz.
		CreditCard[] visaArray= {visa1, visa2, visa3, ax1, ax2, ax3};//array tipini creditcard secince diger tum card turlerinin objectlerini yazabilirz.
		AX [] axArray= {ax1, ax2, ax3}; //bu sekilde child class'in da array listi olusturulabilir ama burada visa kullanamayiz.
		Object[] objectArray= {visa1, ax1, "John", 67, true}; //"Object" tum classlarin parent class'i. O yuzden Object'i her zaman array type olarak kullanabiliriz.
				
		
	}

}
