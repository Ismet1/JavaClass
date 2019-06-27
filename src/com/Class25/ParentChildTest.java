package com.Class25;

public class ParentChildTest {

	public static void main(String[] args) {
	
		Parent p = new Parent();//i am a parent constructor
		//sadece kendi output'unu cikartir parent class constructor.
		
		Child c = new Child();
		//burda output
		//i am a parent constructor
		//i am a child constructor
		// seklinde cikar. Child constructor ilk parent in ciktisini
		//sonra kendisinin ciktisini alir. Method overridingden farkli

	}

}
