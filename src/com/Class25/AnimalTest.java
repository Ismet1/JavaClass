package com.Class25;

public class AnimalTest {

	public static void main(String[] args) {
		
		//METHOD HIDING,static kullanilarak verinin child class'tan alinmamasina denir.Parent claass'in output'u alinir
		Animal obj=new Monkey();
		obj.whoAmI();//I am an animal //child class'in output'ini vermedi
		//cunku static method is not overriding!!!!!
		//O yuzden parent class'in outputunu alir
		

	}

}
