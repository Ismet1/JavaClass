package com.class11;

public class FinalTask_2 {

	public static void main(String[] args) {
		// Create an array of countries: north america countries, south america countries, europe countries, asian countries, 
		//african countries. Then print all values from that array.

		
		String[][] country = { { "Usa", "Canada"}, { "Paraguay", "Columbia", "Peru" }, { "France", "Italy","Germany" },
				{ "Japan", "Korea"}, {"Gana","Zambia"}};

		for (int i = 0; i < country.length; i++) {
			for (int j = 0; j < country[i].length; j++) {
				System.out.print(country[i][j] + " ");
			}
			System.out.println();
		}

		
	}

}
