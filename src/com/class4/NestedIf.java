package com.class4;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//write a program to checkwork eligibility
		// if user is younger than <16 not allowed to work
		// otherwise allowed to work (if user younger than 64---->go to work otherwise
		// ----> enjoy your life)

		int age = 18;
		int eligibleAge = 16;
		int retirementAge = 64;
		if (age < eligibleAge) {
			System.out.println("You are too young, no work for you");
		} else {
			System.out.println("You are eligible to work");

			if (age < retirementAge)
			{				System.out.println("go work hard");
			}
			else {
				System.out.println("enjoy your life");

			}
		}

	}

}
