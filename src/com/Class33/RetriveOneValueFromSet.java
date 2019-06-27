package com.Class33;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RetriveOneValueFromSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> cars=new LinkedHashSet<>();
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Audi");
		cars.add("BMW");
		cars.add("Ford");
		
		//1st way to convert to the arraylist
		//a- add collection into Arraylist
		List<String> list=new ArrayList<>(cars); 
		System.out.println("list collection:"+list);
		System.out.println(list.get(2));//Audi //sadece index 2yi cikti aliyoruz.
		//b- add collection into arraylst
		List<String> list2=new ArrayList<>();
		list2.addAll(cars);//tum listeyi burda eklemis olduk
		list2.add("Ford");//bir ford daha eklemis olduk
		System.out.println("list2 collection:"+list2);
		
		//2 way to convert to array
		Object[] array=cars.toArray();
		
		System.out.println(array[1]);
		
	}

}
