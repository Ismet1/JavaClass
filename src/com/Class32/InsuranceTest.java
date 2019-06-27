package com.Class32;

import java.util.ArrayList;

public class InsuranceTest {

	public static void main(String[] args) {
		
		Car car=new Car("BMW");
		
		
		Pet pet=new Pet("Golden");
		
		
		Health health=new Health();
		
		ArrayList<Insurance>alist=new ArrayList<>();
		alist.add(car);
		alist.add(pet);
		alist.add(health);
		
		
		for(int i=0; i<alist.size(); i++) {
			Insurance obj=alist.get(i);
			obj.getQuote();
			obj.cancelInsurance();
		}
		
		System.out.println("-------------------------------------------");
		for(Insurance Insu:alist) {		
			Insu.getQuote();
			Insu.cancelInsurance();
		}
		
		
	}

}
