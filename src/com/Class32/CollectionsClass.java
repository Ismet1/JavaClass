package com.Class32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsClass {

	public static void main(String[] args) {
		
		ArrayList<Integer> integerList=new ArrayList<>();
		integerList.add(90);
		integerList.add(33);
		integerList.add(56);
		integerList.add(1000);
		
		System.out.println("collecting before sorting"+integerList);
		Collections.sort(integerList);
		System.out.println("collection after sorting"+ integerList);
		
		
		int[] integerArray= {12,57,9799,1};
		Arrays.sort(integerArray);//This class contains various methods for manipulating arrays
		System.out.println("Array after sorting");
		for(int num: integerArray) {
			System.out.print(num+" ");
		} 
	}

}
