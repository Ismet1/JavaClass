package com.Class33;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Review_33 {
	
//--------------------------------------Set-------------------------------------------------//
//Description	
//Set is a Collection that can’t contain duplicate elements. 
//There are three main implementations of Set interface: •HashSet•LinkedHashSet•TreeSet
//HashSet, which stores its elements in a hash table, is the best-performing implementation.
//TreeSet, which stores its elements in a red-black tree, orders its elements based on their values; it is substantially slower than HashSet.
//LinkedHashSet, which is implemented as a hash table. orders its elements based on the order in which they were inserted into the set.
	
	//Asagidaki gibi olusturulur.
	/*
	 	//ilk basa asagidaki gibi "Set" yazilabilir yada LinkedHashSet'de yazilabilir. Cunku Set'in javadan gelen bir Parent
	 	//class olma ozelligi var. 
		Set<String> cars=new LinkedHashSet<>();
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Audi");
		cars.add("BMW");
		cars.add("Ford");
	 */
	
	
	
	
//--------------------------------Converting Set to ArrayList--------------------------------------------//
//Yukaridaki Set'in Objectini kullandik.
	/*
	//1st way to convert to the arraylist
			//a- add collection into Arraylist
			List<String> list=new ArrayList<>(cars); //ilk basta "List" olduguna takilma. ArrayList yazsakta ayni oluyor.
			//Yani convert ederken ArrayList object olusturulmasi aynen yazilir, en son parantezin icine "Set"'de olusturulan Object yazilir.
			//yani ornegimizde "cars" yazdik ve convert etmis olduk.
			System.out.println("list collection:"+list);
			System.out.println(list.get(2));//Audi //sadece index 2yi cikti aliyoruz.
			//b- add collection into arraylst
			List<String> list2=new ArrayList<>();//ONEMLI; Burada ikinci bir arraylist olusturuyoruz ayni "SET" objectinden AMA
			//bu sefer parantezin icine object ismini yazmiyoruz. obj.addAll(orjinal'obj') yapip asagidaki gibi, tum verileri
			//bu arraylist'e depolamis oluyoruz addAll kisayolu ile.
			list2.addAll(cars);//tum listeyi burda eklemis olduk
			list2.add("Ford");//bir ford daha eklemis olduk
			System.out.println("list2 collection:"+list2);
			
	//2 way to convert to array
			Object[] array=cars.toArray();
			
			System.out.println(array[1]);
	*/
	
	
	

	
//---------------------------------------Map Intro--------------------------------------//
	
//Decription;
	//Map stores the values in Key-Value pair and each pair is known as an entry.
	//Values in the Map can be duplicate but keys always must be unique
	//The Map interface is implemented by different Java classes, such as Map>(HashMap, HashTable, LinkedHashMap) and Map>SortedMap(TreeMap.) 
	//Parantez icine aldiklarim class, disindakiler interface.Map interface'ine bagli bir SortadMap interface'i var.Treemap class'ida ona bagli.
	//3'unu bilsen yeterli.Populer olanlar
	//HashMap: HashMap doesn’t maintain the insertion order of elements.
	//LinkedHashMap: It orders its elements based on the order in which they were inserted into the set (insertion-order).
	//TreeMap: orders its elements based on their values; it is substantially slower than HashMap.
	
	
//ArrayList ile Map'in farklari;
	//ArrayList'te key ve value degerleri yok. O yuzden  get function uygularken Map'te key degeri girilirken, ArrayListte 
	//index numarasini giriyoruz. Asagidaki func uygulamalari her ikisinde de var
	/*
	System.out.println(names.isEmpty());
	System.out.println(names.contains("ismet5"));
	System.out.println(names.get(0));
	System.out.println(names.size());
	*/
	
	
//Map Properties
	/*
	Map<Integer, String> map=new HashMap<>(); //integer=key'in karsiligi, String=value'nin karsiligi.
	
	//add entries(key+value)
	map.put(101, "John");//entryler HashSet'in yada arraylist in aksine burada "put" olarak baz alinmis
	map.put(102, "Jane");
	map.put(103, "Kate");
	map.put(104, "James");
	
	
	//retrive or access values
	System.out.println(map.get(102));//jane //ciktilarini alirken sadece key'in datasini giriyosun "get" method'a.
	
	//how to find a size of a map
	System.out.println(map.size());//4
	
	//how to update value
	map.replace(103, "Bilal");
	System.out.println(map.get(103));//bilal //replace ettik.
	
	//how to remove the value
	map.remove(104);
	System.out.println(map.size());//3 //cunku 104'u remove ettik
	
	//how to check if there is any value in the map
	System.out.println(map.isEmpty());//false //cunku valuelar var.
	
	//to see the output
	System.out.println(map);
	
	//to check is specific key/value is there
	System.out.println(map.containsKey(102));//true //key dedik key giriyoruz yani 102(integer gibi)
	System.out.println(map.containsValue("Bilal"));//true //value dedik, "Bilal" giriyoruz.(String gibi)
	
	//adding extra entries
	map.put(105, "Jane");
	System.out.println(map);
	map.put(101, "Shaban");//ayni key numarasi girince, onceki key ile replace yapiyor.
	System.out.println(map);
	
	//adding null key
	map.put(null, "Some Value");//en basa ekliyor bu key'i cunku null sifir gibi bisey.
	System.out.println(map);
	*/
	
	
	
	
	//-------------------------------Map'te Key/Value degerlerini ayriayri print etme------------------------//
	
	
	/*
	Map<Integer, String>map=new HashMap<>();//Map'i olusturduk
	map.put(1, "A");
	map.put(2, "AA");
	map.put(3, "B");
	map.put(3, "C");
	map.put(4, "D");
	
	//returns a set of keys from the map
	Set <Integer> keys=map.keySet();//sadece "Key" degerlerinin ciktisini almak icin Bu instantiate'i olusturduk.
	//Burada en basta "Set" dedik, "Collection"'da diyebilirdik. Ama value degerlerinin ciktisinin aliminda "Set" kesinlikle
	//kullanamayiz. o yuzden her zaman "Collection" kullanmak daha mantikli.
	//En sonda "obj.keySet()" diyerek key degerlerini yeni olusturdugumuz "keys" objectine yukluyoruz ornekte.
	
	//how to print all keys
	System.out.println("--------------Using for loop----------------");
	for (Integer key:keys) {
	System.out.print(key+":"+map.get(key)+" ");//sadece "key" desesydik sadece rakamlari cikarcakti. Sonradan ekledigimiz get methodu ile
	//yanina string value'larinida eklemis olduk. "Key" burda her seferinde ayri bir rakam degeri alicagi icin, tum value'lari sirayla
	//get etmis oluyoruz.
	}
	
	System.out.println();
	System.out.println("--------------Using Iterator----------------");
	Iterator<Integer> keysIt=keys.iterator();
	while(keysIt.hasNext()) {
		System.out.print(keysIt.next()+" ");
	}
	
	
	//How to get All Values
	//return collection of values from a map
	Collection <String > valCol=map.values();//burada en sonda "obj.keySet()" yerine "obj.values()" kullaniyorz. cunku value'lari cikti alicaz.
	System.out.println("Using for each loop--------------");
	for (String value: valCol) {
		System.out.print(value+", ");
	}
	
	System.out.println("Using iterator--------------");
	Iterator<String> itValues=valCol.iterator();
	while(itValues.hasNext()) {
		System.out.print(itValues.next()+", ");
	}
	*/
	
	
	
	//-------------------------------------EntrySet--------------------------------------//
	
	/*
	Map<String, String> userDetailsMap = new LinkedHashMap<>();//Map olusturuyoruz
	userDetailsMap.put("Name", "Alex Smith");//1 entry=Key=Name + value="Alex Smith"
	userDetailsMap.put("Salary", "90000");// 2 entry
	userDetailsMap.put("Department", "IT");//3 entry
	userDetailsMap.put("Title", "Automation Tester");//4 entry

	System.out.println(userDetailsMap);
	userDetailsMap.entrySet();// returns a set of entries

	for (Map.Entry<String, String> entry : userDetailsMap.entrySet()) {//entrySet olusturuyoruz
		System.out.println(entry.getKey() + ":" + entry.getValue());//getKey ve getValue methodlarini output almak icin kullaniriz "entrySet" icinde.
	}
	System.out.println("Using iterator------------------------------------");
	
	Iterator<Map.Entry<String, String>> it=userDetailsMap.entrySet().iterator();//iterator icinde entrySet olusturma.
	while(it.hasNext()) {
		Map.Entry<String, String> entry=it.next();
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
	*/
}
