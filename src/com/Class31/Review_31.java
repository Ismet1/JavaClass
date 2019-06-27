package com.Class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Review_31 {

//---------------------------------ArrayList olusturma------------------------------//
	
/*
	ArrayList<Integer> numbers=new ArrayList<Integer>(); 
	numbers.add(12);
	numbers.add(0, 13);//bu sekilde yapinca 13'u 0 indexine yaziyor yani grup spyle oldu(13, 12)
	//.add(index, element) cikiyor ordan yerlestiriyoruz 0 ile 13'u.
	numbers.add(0, 14);//bu durumda 12 en son index'e gitti 2.index oldu. 14 ise 0ci index oldu
	
	System.out.println(numbers.size());//3
	System.out.println(numbers.get(2));//12
	
	
	numbers.set(1, 33);//1. index'i 33 ile degistirdik 13 gitti yani.
	System.out.println(numbers.get(1));//33
	System.out.println(numbers.contains(33));//true
*/
//Olusturdugumuz bu arrayList'in ciktisini 4 farkli sekilde aliriz.
	
	//4 ways of getting print of ArrayList
	//Normalde sysout(Numbers); diyincede cikti aliriz ama parantez icinde List seklinde cikti aliyoruz. Ciplak cikti icin asagidaki methodlar uygulanir.
	/*
			System.out.println("1st way using for loop");
			for(int i=0; i<numbers.size(); i++) {
				System.out.println(numbers.get(i));
			}
				
			System.out.println("2nd way using advanced for loop");
			for(int num: numbers) {
			System.out.println(num);
			}
						
			System.out.println("3rd way using iterator");
			Iterator <Integer>it=numbers.iterator();//import iterotor yapicaksin soldaki errordan
			while(it.hasNext()) {
				int number=it.next();
				System.out.println(number);
			}
						
			System.out.println("4t way by using while");
			int c=0;			
			while(numbers.size()>c) {
				int myNum=numbers.get(c);
			System.out.println(myNum);
			c++;
			}
	*/	
	
	
	
	
	//----------------------------------ArrayList'de Liste olusturma-----------------------------------------//
	
	//Normalde ArrayList'de liste olusturma onceden gorduk, su sekildeydi;
	/*
	ArrayList<Integer> numbers=new ArrayList<Integer>(); 
	numbers.add(12);//bu sekilde 12'yi eklemis oluyorduk. 
	//Ama Egerki 100yada 1000 sayi eklemek istersek o zaman ne yapicaz.
	for(int i=1; i<=10; i++) {
		numbers.add(i);
	}//Bu sekilde "numbers.add(i)'yi for loop icerisine aliyoruz. Boylce istedigimiz kadar rakam atabiliriz.
	*/
	
	
	
	
	
	//-----------------------------------Iterator(hasNext(),next(),remove())----------------------------------//
	
	/*
	Iterator<Integer>iterator=alist.iterator();
	while(iterator.hasNext()) { //hasNext check ediyor herhangi bir variable varmi diye
		int number=iterator.next(); //next ise return yapiyor verileri, for loop gibi
		if(number%2!=0) {
			iterator.remove();//if conditiondaki sarti sagliyan verileri cikartiyruz. "remove" ile.
			//remove da arka arkaya islem yaptigimizda index sirasina dikkat et. her seferinde degisiyor cunku
		}
	}
	System.out.println(alist);
	*/


	
	
	
	
	//------------------------------Bir coding sayfasinin 4 farkli objectini olusturup , o objectleri ArrayList yapma-----------------------//
	
	public static void main(String[] args) {
		Student student1 =new Student("John", 101);
		Student student2 =new Student("James", 102);
		Student student3 =new Student("Anna", 103);
		Student student4 =new Student("Katy", 104);
		//Ayni sinif icin yukaridaki gibi 4 farkli object olusturup, contructordaki variable'lara
		//4 farkli data tanimi yapabiliriz.
		
		ArrayList<Student>alist =new ArrayList<>();//yukarida olusturdugumuz  objectlerden arraylist yaptik burda
		alist.add(student1);
		alist.add(student2);
		alist.add(student3);
		alist.add(student4);
		
		//Burada yukarida topladigimiz tum datalari print ediyoruz iki ayro sekilde
		//Advance for loop ile;
		for(Student student: alist) {
			student.printStudentDetails();//tum bilgileri print eder isim+numara
			System.out.println(student.name);//john, james, anna, katy
		}
		//Iterator ile;
		Iterator<Student> it=alist.iterator();
		while(it.hasNext()) {
			Student obj=it.next();
			obj.printStudentDetails();//isim numara seklinde print aliyoruz Iterator ile.
		}
	}



}
