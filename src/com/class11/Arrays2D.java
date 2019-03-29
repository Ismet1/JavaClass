package com.class11;

public class Arrays2D {

	public static void main(String[] args) {
		// 2D arrays
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
		
		
		
		//ikinci yolun string'lisi
		String[][] groups= {
				{"Jawid","Mustafa","Amina","Mahri","Emily","Ahmad"},
				{"Bilal","Shaban","Asmit","Sasha","Olga","Moe"}
		};
		
		System.out.println(groups[1][4]+" "+groups[1][3]);//Olga Sasha
		
	}

}
