package com.class4;

public class NestedIfAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declare varible for gpa and having a diploma
		//if user has a diploma (congratulations --> (if gpa is higher 3.5 ---> hi ..........else do not hire))
		
		double gpa=3.6;
		double expectedGpa=3.5;
		
		boolean hasDiploma=true;
		
		if (hasDiploma) {
			System.out.println("Congratulations");
			if (gpa>expectedGpa) {
				System.out.println("you are hired");
		    } else {
				 System.out.println("unfortunately we cannot hire you");
			} 
		} else {
			System.out.println("please get your degreee");
	}
		}
}
