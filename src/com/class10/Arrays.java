package com.class10;

public class Arrays {

	public static void main(String[] args) {
		// Arrays Intro
		
		/*ayni sayiyi iki kere baska rakama tanimlayamiyoruz. so
		 * 
		 */
		
		// we have 3 way to declare an array
		int[] array1;//declare an array
		int [] array2;//declare an array //we can NOT specify in this step, like 'int [2] array2'
		int array3[];//declare an array

		array1=new int[4]; //initialize, create an array
		array1[0]=10; //assigning values
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		//access values
		System.out.println(array1[2]);//30
		System.out.println(array1[0]);//10
		
		
		
		
		//initializing in one step
		int[] numbers=new int[3];
		//assigning a value
		numbers[0]=5;
		numbers[1]=10;
		numbers[2]=15;	
		//numbers[3]=20; (no error during compilation but error during run time)(exception!!!)
		//ArrayIndexOutOfBoundsException // istisna cunku numbers'i 3'e tanimladik ve bu asamada 4.yu girmeye calisiyoruz.
		System.out.println(numbers[2]);//15
		System.out.println(numbers[0]+numbers[2]);//20
		
		
		//String Array
		String[] a=new String[3];
		a[0]="Hello";
		a[1]="Hi";
		a[2]="Bye";
		System.out.println(a[1]+" friends");//Hi friends
	}

}
