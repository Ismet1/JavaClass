package com.class11;

public class FinalTask_1 {

	public static void main(String[] args) {
		// create an array of cars: american cars, german cars, korean cars.
		// then retrieve all values from that array

		String[][] cars = { { "Ford", "Chevy", "Ram" }, { "Opel", "Mercedes", "Bmw" }, { "Nissan", "Toyota" },
				{ "Ferrari", "Fiat", "AlfaRomeo" }, };

		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j] + " ");
			}
			System.out.println();
		}

	}

}
