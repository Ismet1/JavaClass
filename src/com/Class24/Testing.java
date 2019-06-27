package com.Class24;

public class Testing {

	public static void main(String[] args) {
		// Parent ve child sayfalarinin testi icin

		String a;
		a = "10";
		
		Parent parent = new Parent();
		parent.love();
		parent.work();
		
		Child child = new Child();
		child.love();
		child.cry();
		child.work();
		
		//type casting(deniyor iki sinifin ortak object olusturulmasina)
		Parent obj = new Child();
		obj.work();// Parent work cikicak sonuc
		obj.love();//Child love cikicak. Overriden veriler ice giren siniftan yani bu ornekte child sinifindan cikicak.
		//obj.cry(); is not accessible cunku ilk parent i yazdik. Child parent in icine grdi ve parent'i baz aliyoruz.
		
		//Child obj1 = new Parent(); bu sekilde object yaratamiyosun cunku child 
		//kucuk olan sinif ve buyuk olan sinif parent in icine girer
	}

}
