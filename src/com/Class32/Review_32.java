package com.Class32;

import java.util.HashSet;
import java.util.Iterator;

public class Review_32 {

//------------------------------------COLLECTION(ArrayList)-----------------------------//
	
//Description:
//Collection 3'e Parent Class'a ayriliyor. -List(ArrayList/LinkedList) -Set(HashSet/TreeSet/LinkedHashSet) -Queue(PriorityQueue/Deque)	
//Bu 3 ana baslikta saydiklarimiz "Interface" diger altbasliklar "Class" dolayisiyla birbirlerine implement ile baglanirlar.
//Ama siniflar ve interfaceler birbirlerine extend ile baglanirlar. Altbasliklarin tek istisnasi "Deque" o da bir interface. 
	
//Bunlar normal array. Arraylist ile farklari size.Bunlarda sonradan ekleme yapamiyoruz. ama arraylist'lerde yapabiliyoruz.
	//ArrayTest class'ta run edebiliriz
	//burada parent class CreditCard ve child class AX ve Visa olusturduk. o yuzden "String, Integer" gibi data type'larinin yazmasi gereken yerde
	//Parent class ismi yada child class ismi yaziyor.
	/*
	CreditCard[] visaArray= {visa1, visa2, visa3, ax1, ax2, ax3};//array tipini creditcard secince diger tum card turlerinin objectlerini yazabilirz.
	AX [] axArray= {ax1, ax2, ax3}; //bu sekilde child class'in da array listi olusturulabilir ama burada visa kullanamayiz.
	Object[] objectArray= {visa1, ax1, "John", 67, true}; //"Object" tum classlarin parent class'i. O yuzden Object'i her zaman array type olarak kullanabiliriz
	*/
	
	
//ArrayList nasil olusturulur.
	//Collection Class'ta run edebiliriz
	/*
	ArrayList<Integer> integerList=new ArrayList<>();
	integerList.add(90); //bu sekilde, "add" ile collection yapilir
	integerList.add(33);
	integerList.add(56);
	integerList.add(1000);
	
	System.out.println("collecting before sorting"+integerList);//90, 33, 56, 1000 //burada simply print ediyoruz.
	Collections.sort(integerList);// "Collection.sort" dedikten sonra object'i parantez icine yaziyoruz. Numaralari siraya sokuyor.
	System.out.println("collection after sorting"+ integerList);//33,56,90,1000
	*/
	
	
	
	
	
//---------------------------COLLECTION FROM OTHER CLASSES(Collecting a objects)-----------------------------//
	
//Bunu incelemek icin CreditCard ve CreditCardTest siniflarini run edebilirsin.
//Burada CreditCard sinifi acmisiz ve iki tane child classaciyoruz AX ve VISA diye.
//herbirinin icine unimplemented yaada implemented method yerlestiriyoruz. Test sinifi acip, bunlarin objectlerini olusturuyoruz.
//Olusturdugumuz bu objectleri Collection 'a dahil edebiliriz, soyleki:
	
	/*
	Visa visa=new Visa("Visa Platinum");	
	AX ax=new AX("AX Rewards");	
	MasterCard mc=new MasterCard("MC basic");
		
	ArrayList<CreditCard>alist=new ArrayList<CreditCard>(); //farkli siniflardan verileri collection yaptigimiz zaman, parent class'in ismini yazariz data type
	//yerine yada basitce ortak kelime "Object" yazilabilir. Integer yada string giremeyiz.
	alist.add(visa);
	alist.add(ax);
	alist.add(mc);
	//alist.add(12) olmaz mesela cunku creditcard parent sinifinin object'i degil 
	//yani artik kafamiza gore "alist.add" yapip ekleme yapamayiz.
	
	//how can i get a name of each card
	for(CreditCard card:alist) {
		System.out.println(card.creditCardName);
		card.interestRate();//diger sayfada method olarak olusturdugumuz icin bu sekilde printedebiliyosun.
	}
	
	//how can we print and interest rate of each card
	Iterator<CreditCard>myIterator=alist.iterator();//yine creditcard data type olarak kullanilir.
	while(myIterator.hasNext()) {
		CreditCard obj=myIterator.next();
		obj.interestRate();
	}
	
	//how to print an annual fee of each card
	for(int i=0; i<alist.size(); i++) {//burada -1 yada -2 yazip size()'in yanina , sadece bir tanesinin output'unu alabiliriz.
		CreditCard obj=alist.get(i);
		obj.annualFee();
	*/
	
	
	
	
	//-----------------------------------------HashSet Intro-------------------------------------------------//
	/*
	HashSet<Integer> hset=new HashSet<>();
	hset.add(12); //Bu sekilde ekleme yapariz. ArrayList ile ayni.
	hset.add(32);
	hset.add(34);
	
	System.out.println(hset.size());
	//SET doesn not keep the order
	System.out.println(hset);
	System.out.println(hset.contains(32));//true yada false olarak cevp verir. "object.contains()"
	//Set Interface does not allow duplicates
	hset.add(12);
	hset.add(32);//istedigimiz kadar ekleme yapabiliriz. Normal arraylerden farki bunlarin.
	System.out.println(hset.size());
	
	
	//to retrieve all values from hashset
	//1. using advance for loop
	System.out.println("-----using adnaced for loop-");
	for(int num:hset) {
		System.out.println(num);
	}
	//2. using iterator
	System.out.println("-----using iterator-");
	Iterator<Integer> iterator=hset.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
		
		*/
}
