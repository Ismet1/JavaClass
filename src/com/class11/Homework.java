package com.class11;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		String[] days=new String[7];
	
			
		    System.out.println("Please enter day 1 of the week");
		    days[0]=input.nextLine();
		    System.out.println("Please enter day 2 of the week");
		    days[1]=input.nextLine();
		    System.out.println("Please enter day 3 of the week");
		    days[2]=input.nextLine();
		    System.out.println("Please enter day 4 of the week");
		    days[3]=input.nextLine();
		     System.out.println("Please enter day 5 of the week");
		    days[4]=input.nextLine();
		    System.out.println("Please enter day 6 of the week");
		    days[5]=input.nextLine();
		    System.out.println("Please enter day 7 of the week");
		    days[6]=input.nextLine();
		    
		    
		    for(int i=0; i<days.length; i++){
		   System.out.println(days[i]); 
		    }
		    
		
		
		
		
		
	}

}
