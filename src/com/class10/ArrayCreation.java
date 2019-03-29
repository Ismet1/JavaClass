package com.class10;

public class ArrayCreation {

	public static void main(String[] args) {
		// Array creation
		
		//			  0, 1, 2, 3	// 0 1o'u, 1 20'yi, 2 30'u 3 40'i otomatik initialize etti.
		int[] array= {10,20,30,40};//Shortcut. We are doing everything at the same time.declaring, initializing.
		System.out.println(array[2]);//30
		System.out.println(array.length);//to find the size of an array //4
		
		
		
		
		//string of names-5;
		String[] names= {"John", "Mike", "Jane", "Talgat", "Olga"};
		System.out.println("There are "+names.length+" values in my array of names");
		System.out.println(names[2]);
		
		
		
		
	}

}
