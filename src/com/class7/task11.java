package com.class7;

public class task11 {

	public static void main(String[] args) {
		/* 1. Declare variable and increase by 100 using shorthand operator
        * 2. Declare variable and decrease by 67 using shorthand operator
        * 3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator
        * each person should get an equal piece of cake
        *
        * 4. Declare variable cakePiece=25 and divide cakePiece between 7 people
        * using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people
*/
		
		int a;
		a = 50;
		a+=50;
		System.out.println(a);
		
		int b;
		b= 100;
		b-=33;
		System.out.println(b);
		
		double cakePiece1;
		cakePiece1=11;
		cakePiece1/=4;
		System.out.println(cakePiece1);
		
		double cakePiece2;
		cakePiece2=25;
		cakePiece2%=7;
		
		System.out.println(cakePiece2);
	}

}
