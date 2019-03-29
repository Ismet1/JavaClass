package com.class6;

import java.util.Scanner;

public class Task1uzanti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;
		boolean rain, snow, sunny;
		int temp;
		String activity;

		scan = new Scanner(System.in);
		System.out.println("what is the temp?");
		temp = scan.nextInt();
		if (temp > 40 && temp < 80) {
			System.out.println("is it raining?");
			rain = scan.nextBoolean();
			if (rain) {
				activity = "watchMovie";
			} else {
				activity = "goHiking";
			}
		} else if (temp>25 & temp<40) {
			System.out.println("is it snowing?");
			snow = scan.nextBoolean();
			if (snow) {
				activity = "snowBoarding";
			} else {
				activity = "doCoding";
			}
		} else if (temp > 80) {
			System.out.println("is it sunny?");
			sunny = scan.nextBoolean();
			if (sunny) {
				activity = "goBeach";
			} else {
				activity = "moreCoding";
			}
		} else {
			activity = "unKnown";
		}

		System.out.println("activity is " + activity);
	}
}
