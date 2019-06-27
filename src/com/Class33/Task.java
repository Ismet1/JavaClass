package com.Class33;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 * How can you remove all duplicates from ArrayList?

List<String> aList=new ArrayList<String>();
        aList.add(“John”);
        aList.add(“Jane”);
        aList.add(“James”);
        aList.add(“Jasmine”);
        aList.add(“Jane”);
        aList.add(“James”);
 */
public class Task {

	public static void main(String[] args) {
		
		List<String> aList=new ArrayList<String>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

       // System.out.println(aList);
        Set<String> noDublicate=new LinkedHashSet<>();
        noDublicate.addAll(aList);
        System.out.println(noDublicate);
        
	}

}
