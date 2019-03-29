package com.Class12;

public class Recap {

	public static void main(String[] args) {
		// Recap
		
		
		int [][] arr= {
				{1,2,3},
				{10,20,30},
				{100,200,300},
		};
		/*
		for(int i=0; i<arr.length; i++) { //how maany arrays
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
*/
		
		
		//Recap'te yeni konuya gecti. For loop'un icinde biri []'li ikinci for loop ta yok.
		//Birincisi 2D array oldugu icin bir [] kullaniyoruz. Ikincisi single D oldugu icin [] kullanmiyoruz.
		for(int[] singleArray:arr) { //singleArray'e tanimliyoruz
			for(int numbers:singleArray) {//burda singleArray'in icine giriyoruz
				System.out.print(numbers+" ");
			}
			System.out.println();
		}
	}

}
