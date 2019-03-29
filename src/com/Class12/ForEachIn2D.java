package com.Class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		/*
		 *  Create a grocery list: fruits, veggies, dairy
		 *  Retrive all values using 2 different loops
		 */

		String[][] grocery= {
				{"apple","banana","apricot"},
				{"eggplant","carrot","onion"},
				{"milk","egg","yogurt"}
		};
		
		
		for(String[] grocerylist:grocery) {
			for(String result:grocerylist) {
				System.out.print(result+" ");
			}
			System.out.println();
		}
		
		
		//2nd easy way for me
		
		for(int i=0; i<grocery.length; i++) {
			for(int j=0; j<grocery[i].length; j++) {
				System.out.print(grocery[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
