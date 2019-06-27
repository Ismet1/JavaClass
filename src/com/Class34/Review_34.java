package com.Class34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Review_34 {

	
	
//--------------------------------Map'te (K, V) degerlerine iliskin ozellikler-----------------------//	
	
	/*
	Map<String, Integer> groceryMap = new LinkedHashMap<>();
	groceryMap.put("Milk", 1);
	groceryMap.put("Bread", 2);
	groceryMap.put("Eggs", 12);
	groceryMap.put("Coffee", 2);
	groceryMap.put("Potato", 2);
	groceryMap.put("Cookies", 3);

	//Normalde kural "K" duplicate edilemez "V"lar duplicate olabilir seklindeydi.
	System.out.println(groceryMap);//Bu ornekte stringler "K" ye yazilmis. Ynia Stringler burada "K" olarak islem yapilacak
	groceryMap.put("Cheese", 1);//Listeye eklenecek cunku 1 tekrar ediyor ama bu ornekte 1 "V" oldugu icin sorun yok.
	System.out.println(groceryMap.size());

	groceryMap.replace("Eggs", 18);//eggs burada "K" dolayisiyla daha onceden eggs oldugu icin ekstradan listeye eklemicek. oncekinin yerine alicak
	System.out.println(groceryMap);

	groceryMap.remove("Cheese");
	System.out.println(groceryMap);	
	*/
	
	
	
	
	

//-----------------------Map'te {keySet()/values()} kullanimina iliskin ozellikler-----------------------//
	
	/*
	Map<String, Integer> groceryMap = new LinkedHashMap<>();//Map'i olusturuyoruz.
	groceryMap.put("Milk", 1);
	groceryMap.put("Bread", 2);
	groceryMap.put("Eggs", 12);
	groceryMap.put("Coffee", 2);
	groceryMap.put("Potato", 2);
	groceryMap.put("Cookies", 3);

	// retrieving all keys+values using keySet(); (2 farkli sekilde olabilir)(ufak farklilik)
	Set<String> keySet = groceryMap.keySet();//keySet()'i kullanarak "K" dgerlerini ayirmis oluyoruz.
	for (String key : keySet) {//1.Sekli; Bizim olusturdugumuz "key" objectini yine yukarda initiate olustururken kendi olusturdugumuz
		//"keySet" objectine initilize ediyoruz.
		System.out.println("Key is " + key + " and values is " + groceryMap.get(key));//"key", "K" degerlerini tek tek call edip value'lari veriyor.
	}
	System.out.println("//------------------keyset/iterator-----------------//");
	Iterator<String> keyIt=keySet.iterator();//Aynisinin iterator'lisi
	while(keyIt.hasNext()) {
		String key=keyIt.next();
		System.out.println(key+":"+groceryMap.get(key));
	}

	for (String key : groceryMap.keySet()) {//2.Sekli; Bizim olusturdugumuz "key" objectini direk obj.keySet() methoduna initilize ediyoruz.
		System.out.println("Key is " + key + " and values is " + groceryMap.get(key));
	}

	Iterator<String> keyIt = groceryMap.keySet().iterator();
	while (keyIt.hasNext()) {
		String key = keyIt.next();
		System.out.println(key + ":" + groceryMap.get(key));
	}

	// retrieving all values using;
	Collection<Integer> valCollection=groceryMap.values();
	for(Integer value:valCollection) {
		System.out.println(value);
	}

	for (Integer value : groceryMap.values()) {
		System.out.println(value);
	}

	Iterator<Integer> valueIt = groceryMap.values().iterator();
	while (valueIt.hasNext()) {
		System.out.println(valueIt.next());
	}
	*/
	
	
	
	
	//--------------------------------Map'e Array'in verilerini depolama------------------------------------------//
	
	/*
	String[] names= {"Mehmet", "Asha", "Amina", "Omar", "Siyar", "Danny"};
	
	Map<Integer, String> nameMap=new LinkedHashMap<>();
	
	int key=1;
	for (String name:names) {
		nameMap.put(key, name);
		key++;
	}
	System.out.println(nameMap);
	*/
	
	
	
	
	//---------------------------Map'e onceden olusturulan class datalarinin object'ler ile yuklenmesi-----------------//
	//Car/CarTest siniflari run edilerek sonuc gorulebilir.
	
	/*
	Car car1=new Car("Toyota", "Corolla");//onceden implementation yaptigimiz siniflarin objectlerini olusturuyoruz.
	Car car2=new Car("Honda", "Accord");
	Car car3=new Car("Lada", "Priora");
	car1.printCarDetails();
	car2.printCarDetails();
	car3.printCarDetails();
	
	Map<Integer, Car> carMap=new HashMap<>();//Olusturulan objectleri Map'in icine depoluyoruz //Values kismina "Car" yazabiliriz deger olarak.
	//Onceki sinifin ismi "Car". baglantili olan sinifin ismi object degeri olarak yazilabiliyor.
	carMap.put(1, new Car ("BMW", "X8"));//bu sekilde objectlerin icine yeni data girisi yapabiliriz
	carMap.put(2, car2);
	carMap.put(3, car3);
	
	Collection <Car> carValues=carMap.values();//Onceden olusturdumuz method'u print ediyoruz. //Yine deger olarak "Car" yazilabilir
	for(Car car:carValues) { //burada car'in icerisine tek tek carMap'in icine depo ettigimiz
		//car1, car2, car3 objectleri yerlesiyor sirayla.
		car.printCarDetails();
	}
	*/
	
	
	
	//Person ve PersonTest siniflarinin run edilmesiyle bakabilirsin
	/*
	Map<Integer, Person> personMap=new HashMap<>();//onceki sinif "Person" oldugu icin deger olarak yazilabilir Value kismina.
	personMap.put(1, new Person("ismet", "kaldi", 31, 30000));//Value'lari bu sekilde yeni datalar ilede girebiliriz.Sanki object olusturuluyor gibi.
	personMap.put(2, new Person("deli", "dumrul", 31, 50000));//ikinci kismin set;ine 2 demeseydik tek bir output vericekti
	
	
	for(Person person:personMap.values()) { 
		person.userDetails();
	}
	*/
}
