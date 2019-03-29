package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		
		/* prints out if it is good weather to go for any activity or not
		 * if the temperature is between 40 degrees and 80 degrees inclusive & no rain --->we will go for hiking
		 * otherwise----> we will not go hiking
		 * if temperature is between 25 and 40 inclusive &snowing --->going snowboarding otherwise
		 * we are not going snowboarding
		 * it if temperature is more than 80 & sunny ---> we gonna go to the beach
		 * otherwise ---> not go to the beach
		 */
		
		
		
		Scanner scan;
		boolean rain= true;
		boolean snow= true;
		boolean sunny= true;
		int temp;
		String activity;
		
		scan=new Scanner(System.in);
		System.out.println("what is the temp?");
		temp=scan.nextInt();
		
	if (temp>40 && temp<80) {			
			if (rain) {
				activity= "watchMovie";
			} else {
				activity= "goHiking";
			}
	}else if (temp>25 && temp<40) {			
			if (snow) {		
				activity= "snowBoarding";
			}else {
				activity= "doCoding";
			}
	}else if (temp>80) {			
			if (sunny) {
				activity= "goBeach";
			}else {
				activity= "moreCoding";
			}		
	}else {
		activity= "unKnown";
		}
	
		System.out.println("activity is "+ activity);
		}
	}


