package com.class4;

import java.util.Scanner;

public class DMVrepresentative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("What is your age?");
		
		int age= input.nextInt();
		
		if (age>=18) {
			System.out.println("ok you are good");
		}else {
			System.out.println("you are not eligable for license");
		}
		
	}

}
