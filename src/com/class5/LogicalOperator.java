package com.class5;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ask user daily sales amount
		// based on the sales range comission will be different
		//example; sales is less then 100 commission will be 2, more than 100 and less than 200 comiission will be 5
		
		Scanner scan;
		int sales;
		int commission = 0;
		
		scan =new Scanner(System.in);
		System.out.println("Please enter sales amount");
		sales=scan.nextInt();
		
		if (sales>0 && sales<100) {
			commission=2;
		}else if (sales>=100 && sales<200) {
		commission=5;
		}else if (sales>=200 && sales<500) {
			commission=10;
			
		}else if (sales>=500) {
			commission=0;
		}
		System.out.println("Your commision is "+ commission);
		
		
	}

}
