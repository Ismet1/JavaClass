package com.class10;

public class Review_10 {

	public static void main(String[] args) {
		// ---ARRAYS---//

		int[] array1;// declare an array
		int[] array2;// declare an array //we can NOT specify in this step, like 'int [2] array2'
		int array3[];// declare an array
		array1 = new int[4]; // initialize, create an array
		array1[0] = 10; // assigning values
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;

		
		
		// initializing in one step
		int[] numbers1 = new int[3];
		// assigning a value
		numbers1[0] = 5;
		numbers1[1] = 10;
		numbers1[2] = 15;

		
		
		//---String Array---//
		String[] a = new String[3];
		a[0] = "Hello";
		a[1] = "Hi";
		a[2] = "Bye";
		
		
		//Array'in yan kurallari;
		int[] numbers=new int[4];
		numbers[0]=1;
		numbers[1]=15;
		System.out.println(numbers[2]);//0 //yani fazladan sayi declare edersek[4] ve o numaralari initialize etmezsek cevap '0' cikar.
		numbers[0]=2;
		System.out.println(numbers[0]);//2 //tekrardan initialize ettikmi onun degerini alir. onceki gibi.

		
		
		//---ShortCut to create an Array---//
		int[] array= {10,20,30,40};//Shortcut. We are doing everything at the same time.declaring, initializing.
		System.out.println(array[2]);//30
		
		
		
		//---Finding the Length of the Array---//
		System.out.println(array.length);//to find the size of an array //4
		
		
		//---Variable'a deger vererek output alma---//
		// names[0] yerine int a'ya degeri vererek cikarmak
		String[] names= {"John", "Mike", "Jane", "Talgat", "Olga", "Mehmet",};//isimler 0-1-2-3-4-5 e tanimladik
		int b=3;
		System.out.println(names[b]);//Talgat (talgat cikiyor cunku "0-1-2-3-4" zaten tanimlanmis oluyor)
		
		
		
	}

}
