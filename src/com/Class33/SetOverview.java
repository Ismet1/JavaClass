package com.Class33;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetOverview {

	public static void main(String[] args) {
		// Collection FrameWork'e bakip daha iyi anlayabilirsin, Set parent class orada digerleri implement ile baglaniyor bu Set class'ina.

		
		Set<String> classDays=new LinkedHashSet<>(); //Burada add yapma sirasina gore cikti alicak. Ama HashSet yapsaydik karisik cikarcakti
		//Set java'dan gelen bir Parent class. Object olusturabiliyoruz Hashset(No dublicate and does not maintain the order) yada 
		//LinkedHashset(No dublicate and Maintain the order) yada 
		//TreeSet(alfabetik sira-yada numara sirasini saglar) ile beraber.
		classDays.add("Tuesday");
		classDays.add("Wednesday");
		classDays.add("Thursday");
		classDays.add("Saturday");
		classDays.add("Sunday");
		
		System.out.println(classDays);
		
		
	}

}
