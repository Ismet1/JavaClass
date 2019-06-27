package com.Class24;
//parent class
public class Bank {

	
	public int chargeInterest() {
		return 0;
	}
}
	//1 child class
	class BOA extends Bank{
		public int chargeInterest() {
			return 2;
		}
	}
	
	//2. child class
	class PNC extends Bank{
		public int chargeInterest() {
			return 3;
		}
	}
	
	


