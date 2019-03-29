package com.class11;

public class RetrievingAllValues2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String[][] food= {
			{"burger","fries","hot dog","meatloaf"},
			{"lo mein","fried rice"},
			{"biriyani", "korma", "naan", "chick peas"}
	};
	
	for(int i=0; i<food.length; i++) {
		for(int j=0; j<food[i].length; j++) {
			System.out.print(food[i][j]+" ");
		}
		System.out.println();
	}
	
	
	
	}

}
