package com.class17;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		
	        Task3 a=new Task3();
	        a.palindrome("woow");
	    	}
	
			void palindrome(String text) {
				
	        String reverse="";
	        for(int i=text.length()-1;i>=0;i--) {
	            reverse=reverse+text.charAt(i);
	        }
	        if(reverse.equals(text))
	        	System.out.println("Palindrom");
	        else 
	        	System.out.println("Not palindrom");
	        
			}	
		
		
}	
		
		
		
		
	


