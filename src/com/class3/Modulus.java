package com.class3;

public class Modulus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10;
		int b=3;
		
		int div=a/b;
		System.out.println(div);
		// int ile verdigimiz icin bu bolumun sonucu 3 cikicak!
		
		//syso ctrl+space+enter or sysout ctrl+space
		
		
		//modulus operator
		int mod=a%b;
		System.out.println(mod); //% kalani veriyor. 10'u 3'e bolunce kalan 1, sonuc '1'
		
		// Parentheses, Exponents, Multiplication/Dvision, Modulus, Addition/Substraction
		int e=-5+4*6;
				System.out.println(e);
				
				int x=(22+9) % 7;
				System.out.println(x);
				
				int y = 20 + -3*5 / 8;
				System.out.println(y);
				
				int z = 5 + 15 / 3*2 - 8 % 3;
				System.out.println(z);
		
		
		
	}

}
