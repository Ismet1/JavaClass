package com.Class30;

public class TestShape {

	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.calculateArea(20.5);
		circle.calculatePerimiter(40);
		
		Shape obj1=new Circle();
		obj1.calculateArea(10);
		obj1.calculatePerimiter(20);
		//obj1.whoAmI(); not available cunku parent class'ta bu method yok sadece child classta var
		//dolayisiyla parent class'in child class ile yapilan objectinden bunun sonucunu alamayiz
		
	}

}
