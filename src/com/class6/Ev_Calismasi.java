package com.class6;

import java.util.Scanner;

public class Ev_Calismasi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String carMake, carOrigin;
		System.out.println("Please enter your favoritecar make");
		carMake=input.nextLine();
		
		switch (carMake) {
		case "BMW":
			carOrigin = "german car";
		break;
		case "Toyota":
			carOrigin = "japanese car";
		break;
		case "Maserati":
			carOrigin = "italian car";
		break;
		default:
			carOrigin = "Unknown";
		}
		System.out.println("Your favorite car is "+carOrigin);
	}
}
