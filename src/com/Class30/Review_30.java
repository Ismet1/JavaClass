package com.Class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Review_30 {

//30.classta 4 farkli interview sorusu ornegi cozuldu.
//Bunlari (Car/Marks/Shape ve Registration) siniflarinda run edip inceleyebilirsin.
	
	
//--------------------------------Boxing/AutoBoxing/UnBoxing------------------------//
	
/*
	Integer integer1=new Integer(10);//Boxing 
	//burada integer1'a 10 degerini verdik ve boxing yaptik
	
	Integer integer2=10;//AutoBoxing
	//bir kere Integer objectini olusturunca sonra farkli degerler ile Autoboxing yapabiliyoruz ustteki gibi
	
	int num=integer1.intValue();//unboxing
	System.out.println(num);
	//onceden boxing yaptigimiz bir variable'in sonuna "." koyup "intValue();" ekledik unboxing yapiyoruz ve sysout ile print edebiliriz
	
	int num2=integer2;//AutoUnboxing
	//.intValue(); degeri eklemedende unboxing yapilip print edilebilir.
*/	
	
	
	
//------------------------------Create an ArrayList(Collection)------------------------------------------//
//Collection 3 e ayriliyor. List, Queue and Set. Burada list'in icindeki ArrayList'i kullaniyoruz.	
	/*
	// generic array that stores only string object
	
			ArrayList<String> names=new ArrayList<String>();//generic ArrayList'in object'i
			names.add("ismet"); //bu sekilde array listesine eklemeler yapiyoruz.
			names.add("ismet1");
			names.add("ismet2");
			names.add("ismet3");
			names.add("ismet4");
			
			
	//generic  int array list
			
			ArrayList<Integer> numbers=new ArrayList<Integer> ();//generic ArrayList'in object'i
			numbers.add(10); //bu sekilde array listesine eklemeler yapiyoruz
			numbers.add(20);
			numbers.add(33);
			numbers.add(100);
			
			numbers.set(2, 3333);//burada 2.index'i 3333 ile degistirdik, set yaptik.
			
			
	//non generic array that stores any type of object
			
			ArrayList alist =new ArrayList();//non generic arraylist object'i olusturma
			alist.add("String");
			alist.add(100);
			alist.add(100.10);
			alist.add(true);
			alist.add('a');
			
	//daha sonra bunlarin ciktilarini for loop ile aliyoruz.
	*/
	
	
	
	
	
	//-------------------------------get&size in ArrayList----------------------------------//
	
	/*
	ArrayList<String> greetings=new ArrayList<String>();
	greetings.add("Hello");
	greetings.add("Welcome");
	greetings.add("Hi");
	greetings.add("Bye");
	
	System.out.println(greetings.get(1));//welcome //.get diyince kelimenin kendiini print ediyoruz. "1"yazdik dolayisiyla arrayin 1.siradakini cikariyor.
	System.out.println(greetings.size());//4 //size'nin print ediyoruz
	*/
	
	
	
	
	
	//----------------------------------Iterator-------------------------------------------------//
	/*
	ArrayList<String> names = new ArrayList<String>();
	names.add("John");
	names.add("Jack");
	names.add("Nick");
	names.add("Sam");
	
	System.out.println("---3 way using iterator---");
	Iterator<String> it=names.iterator();
	//boolean check=it.hasNext();
	while(it.hasNext()) {
		System.out.println(it.next());
	*/
	
}
