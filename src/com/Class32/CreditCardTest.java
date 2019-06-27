package com.Class32;

import java.util.ArrayList;
import java.util.Iterator;

public class CreditCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visa visa=new Visa("Visa Platinum");
		
		
		AX ax=new AX("AX Rewards");
		
		
		MasterCard mc=new MasterCard("MC basic");
		
		
		ArrayList<CreditCard>alist=new ArrayList<CreditCard>(); //farkli siniflardan verileri collection yaptigimiz zaman, parent class'in ismini yazariz data type
		//yerine yada basitce ortak kelime "Object" yazilabilir. Integer yada string giremeyiz.
		alist.add(visa);
		alist.add(ax);
		alist.add(mc);
		//alist.add(12) olmaz mesela cunku creditcard parent sinifinin object'i degil
		
		//how can i get a name of each card
		for(CreditCard card:alist) {
			System.out.println(card.creditCardName);
			card.interestRate();//diger sayfada method olarak olusturdugumuz icin bu sekilde printedebiliyosun.
		}
		
		System.out.println("-----------------------------------------------------");
		//how can we print and interest rate of each card
		Iterator<CreditCard>myIterator=alist.iterator();//yine creditcard data type olarak kullanilir.
		while(myIterator.hasNext()) {
			CreditCard obj=myIterator.next();
			obj.interestRate();
		}
		
		System.out.println("------------------------------------------------------");
		//how to print an annual fee of each card
		for(int i=0; i<alist.size(); i++) {//burada -1 yada -2 yazip size()'in yanina , sadece bir tanesinin output'unu alabiliriz.
			CreditCard obj=alist.get(i);
			obj.annualFee();
		}
	}

}
