package com.Class25;

public class Test {

	public static void main(String[] args) {
		
		Student stu=new SyntaxStudent();
		stu.study();
		stu.doHomework();
		stu.attendClasses(5);
		//stu.doResearch //private method can not be overridden

		//parameterlarla oynayip, parameter koyup overriding'i bozabilirsin
		//o zaman parent classtaki veri run yapilir
		//3. yu degistirdik en son stu.attendClasses(5) yazdik
		//oyle olunca ayni method overriding yapilmasina ragmen, output'u
		//parent classtan aliyor. Student class takinin icine 'int a' koyduk
	}

}
