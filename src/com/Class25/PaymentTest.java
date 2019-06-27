package com.Class25;

public class PaymentTest {

	public static void main(String[] args) {
		Payment parent = new Payment();
		parent.makePayment();
		
		MasterCard mc = new MasterCard();
		mc.makePayment();
		
		Visa visa = new Visa();
		visa.makePayment();
		visa.annualFee();
		
		//achieving run time polymorphism
		Payment pay=new MasterCard();//pay = reference variable, payment = type, new MasterCard(); = creating an Object
		pay.closePayment();
		pay.makePayment();//overriden yapilan veri child'tan aliyor.
		
		
		Payment pay1=new Visa();
		pay1.closePayment();//parent class'tan gelcek cunku child class'ta yok
		pay1.makePayment();//child class'tan gelcek cunku ortak veri
		//pay1.annualFee(); //undefined cunku bir ust sinifta tanimlanmamis
		
	}

}
