package com.class17_2;

public class ReturnWork {

	
	
		 public static void main(String[] args) {
		        ReturnWork obj=new ReturnWork();
		        String name="ismet";
		        obj.example();
		        obj.example2(name);
		        obj.example3();
		        obj.example4(name);
		        obj.example5(name);
		        //System.out.println(obj.example6());//char oldugu icin sysout'in icindekinden sonra degerin sayisal karsiliginida cikariyor.
		    }

		    void example() {

		        System.out.println("No retrn value and NO Parameters");
		    }

		    void example2(String name) {

		        System.out.println("No retrn value but with Parameter : " + name);
		    }

		    boolean example3() {

		        System.out.println("With retrn value and NO Parameters");
		        return true; //ustteki sysout'i return yap eger condition true'sa diyoruz.
		    }

		    String example4(String name) {

		        System.out.println("No return value but with Parameter : " + name);
		        
		        return name;
		    }
		    
		    
		    boolean example5(String name) {

		        System.out.println("No return value but with Parameter : " + name);
		        
		        return false;
		    }
		    
		    
		    long example6(char name) {

		        System.out.println("No return value but with Parameter : " + name);
		        
		        return name;
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    

		}
