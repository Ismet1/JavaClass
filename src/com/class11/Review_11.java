package com.class11;

public class Review_11 {

	public static void main(String[] args) {
		//---ARRAYS 2D---//
		
		
		//---Each Loop---//
		//Asagidaki for loop ile cikaracagimiz sonucu,
		/*
		int[] numbers= {12,13,14,15,16,17};
		for (int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		 */
		//Bu for loop ile cikarmaya each loop diyoruz.
		/*
		int[] numbers= {12,13,14,15,16,17};
		for (int monkey:numbers) {
			System.out.print(monkey+" ");
		}
		 */
		//Each Loop'un String'li ornegi
		/*
		String[] studentNames= {"Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank"};
		for (String student : studentNames) { //bu sekilde listeyi "student" kelimesine tanimladik ve hepsinin ciktisini aldik.
			System.out.println(student);    //bu sisteme advenced yada each loop deniyor.
		}
		*/
		
		
		
		
		//---2D arrays---//
		//ilk yol, array declare etme yolu olarak
		int [][] d=new int[4][4];//16 elements we have total 4*4
		//1 row
		d[0][0]=12;
		d[0][1]=13;
		d[0][2]=14;
		d[0][3]=15;
		//2 row
		d[1][0]=1;
		d[1][1]=2;
		d[1][2]=3;
		d[1][3]=4;
		//3 row
		d[2][0]=5;
		d[2][1]=10;
		d[2][2]=15;
		d[2][3]=20;
		//4 row
		d[3][0]=100;
		d[3][1]=200;
		d[3][2]=300;
		d[3][3]=400;
				
		System.out.println(d[1][2]);//3		
				
		//ikinci yol, array declare etme yolu olarak
		int[][] c= { 
				{12,13,14,15},
				{1,2,3,4},
				{5,10,15,20},
				{100,200,300,400} 
				};
						
		System.out.println(c[3][1]);//200	
		
		//2. yolun String ile olani
		String[][] groups= {
				{"Jawid","Mustafa","Amina","Mahri","Emily","Ahmad"},
				{"Bilal","Shaban","Asmit","Sasha","Olga","Moe"}
		};
		System.out.println(groups[1][4]+" "+groups[1][3]);//Olga Sasha
		
		
		
		//---2D Array'deki verilerin tek tek yazilmasi formulu---//
		/*
		int[][] num= {
				{11,12,13,14},
				{21,22,23},
				{31,32,33,34},
		};
		
		for(int row=0; row<num.length; row++) {
			for(int col=0; col<num[row].length; col++) {
				System.out.print(num[row][col]+" ");
			}
			System.out.println();
		}
		*/
		
		
		//---2D Array'deki verilerin tek tek yazilmasi formulunun ikinci kisa yolu---//
		/*
		String[][] grocery= {
				{"apple","banana","apricot"},
				{"eggplant","carrot","onion"},
				{"milk","egg","yogurt"}
		};
		
		
		//For loop'un icinde biri []'li ikinci for loop ta yok.
		//Birincisi 2D array oldugu icin bir [] kullaniyoruz. Ikincisi single D oldugu icin [] kullanmiyoruz.
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
		*/
		
		
	}
}
