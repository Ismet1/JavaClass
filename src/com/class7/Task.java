package com.class7;

public class Task {

	public static void main(String[] args) {
		/*create a boolean variable workday and assign true, create int variable day and assign it to 1
		 * as long as it is workday print --> "i need a day off" and increment day
		 * day once day is 6 --> your condition for your loop should become false
		 * 
		 */

		boolean workDay = true;
        int day = 1;
        
        while (workDay) {   
                
            if (day == 6) {
            	System.out.println("i do not need a day off");
                workDay = false;
            }else {
            	System.out.println("I need a day off");
            }
            day++;
        }
		
	}

}
