package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		/*prompt user to ask the name 3 times and print "you are doing great____"
		 * 
		 */

		
		Scanner input=new Scanner(System.in);
		String name;
		
		int a=1;
		
		while(a<=3) {
		System.out.println("please enter your name");
		name=input.nextLine();
		
		System.out.println("you are doing great "+name);
		a++;
		}
	}

}
