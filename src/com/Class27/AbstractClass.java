package com.Class27;
//abstract is a non access modifier
public abstract class AbstractClass {

	//implemented
	public void test() {
		System.out.println("I am non static test method");
	}
	
	//unimplemented 
	//buna abstract  diyor. Bunu kullandigimiz zaman class'in abstract yapilmasi gerekiyor
	//bunun amaci burda bir sysout yapmiyoruz. Sonraya birakiyoruz, child class'lara.
	//ilerisi icin daha kullanisli olucak.
	public abstract void hello(); 
		
	
	
	
}
