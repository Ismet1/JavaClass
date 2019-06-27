package com.Class34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PersonTest {

	public static void main(String[] args) {

		
		Map<Integer, Person> personMap=new HashMap<>();
		personMap.put(1, new Person("ismet", "kaldi", 31, 30000));
		personMap.put(2, new Person("deli", "dumrul", 31, 50000));//ikinci kismin set;ine 2 demeseydik tek bir output vericekti
		
		
		for(Person person:personMap.values()) { 
			person.userDetails();
		}

	}

}
