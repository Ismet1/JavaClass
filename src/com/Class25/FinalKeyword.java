package com.Class25;

public class FinalKeyword {
	

	public static void main(String[] args) {
		/*
		 * final keyword can be used in 3 places/ways
		 * 1.variables
		 * 2.methods
		 * 3.classes //we cannot create child of a final class
		 */
		
		
//1.Final Variable
		
		final String str="Hello"; //it means u can not change this variable anymore
		//str="John"; / compiler complaning 
	}
		
	
	
	
//2.Final Methods

	public final void hello() {
		System.out.println("Hello from Parent class");
	}	
}
//bu class'i yarattik cunku "final method override yapiliyormu diye
class ChildOfFinal extends FinalKeyword{
	//gordukkki hata  veriyor. Eger commentten cikarsan hata vericek. Final Method override yapilamiyor.
	/*
	public final void hello() {
		System.out.println("Hello from Parent class");
	}
	*/
}