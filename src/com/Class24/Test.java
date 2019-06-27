package com.Class24;

public class Test {
	//kendi basina sayfa, baglantisi yok.
	
	//method signature'lar farkli olucak method overloading yapabilmemiz icin.
	//method overloading nedir: ayni isimde methodlar fakat farkli parametrelerle farkli kilinmislar
	//yada siralari farkli da olablir. ilk string sonra int birisi, digeri ilk int sonra string mesela

	public int test(double a){
		//System.out.println("I am public method");
		return 5;
	}
	
	public void test(){
		System.out.println("I am public method");
	}

	protected void test(String str){
		System.out.println("I am protected method");
	}

	void test(String str, int num){
		System.out.println("I am default method");
	}

	private void test(int num){
		System.out.println("I am private method");
	}
}
