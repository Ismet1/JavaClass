package com.Class29;

public class Review_29 {

	
	
//--------------------------Extends/implements iliskileri-----------------------------//

//Asagida verilen datalari (WebDriver-Browser-ChromeDriver-FirefoxDriver-TakeShreenShot-Executes-Report) sayfalarindaki iliskilerinden gozlemle.
	
//2 class arasi parent-child iliskisi "extends" ile kuruluyor idi.
//2 interface arasi parent-child iliskiside "extends" ile kuruluyor.
//Ancak class'in interface'ten farki , 2 class arasi uzantiya 3. eklenemez fakat interface siniflari arasindaki
//"extends"e 3. bir sinif eklenebilir.
//class ile interface arasinda kurulan yada tam tersi interface ile class arasindaki kurulan parent-child iliskisi ise 
//"implements" ile kurulur.
	
//Terminoloji;
//Multiple=2 parent/1 child
//Multilevel=1 grandparent/1 parent/1 child
//Hiearhical relation=1 parent/2 child
	
	

	
//-------------------------Encapsulation/Setters and Getters------------------------------//
	
//Coding sayfasi;
	public class Students {
	    private String name;
	    private int age;
	    
	    //create setters to set the value
	    //burada setterlarda variable'i initilize ediyoruz bir nevi constructor gibi kullaniyoruz.
	    public void setName(String name) {
	        if(!name.isEmpty()) {
	        this.name=name;
	        }        
	    }
	   
	    public void setAge(int age) {
	        if(age>=18) {
	            
	        this.age = age;
	        }
	    }	    
	    // create getters to return the value of the variables
	    //buradada getterlarda call diyoruz veriyi ama return'e depoluyoruz.
	    public String getName() {
	        return name;
	        
	    }
	    public int getAge() {
	        return age;
	    }
	}
	
//Test sayfasi:
	/*
	public class StudentTest {
	    public static void main(String[] args) {

	        Students obj = new Students();
	obj.setName("Alex");  
	obj.setAge(17);

	System.out.println(obj.getName()+" is "+obj.getAge());//alex is 17 
	    }
	*/
}
