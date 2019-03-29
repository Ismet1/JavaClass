package com.class7;

public class doWhile {

	public static void main(String[] args) {
		//---dowhileloop--//
		
		//do ile while arasindaki ana fark oncelik. oncelige gore 'do' kullaninca while condition yanlis olsa bile
		//bir kerede olsa output alabiliyorsun.
		int a=10;
		do {
			System.out.println("Hello");//hello bir kere cikti, cunku ilk dowhile kullandik. //execute first
			a++;
		}while(a>15);
		
		
		int b=10;
		while (b>15) {
			System.out.println("Bye");//bye hic cikmadi cunku ilk while condition'i kullandik.//check condition first
			b++;
		}
		
	}

}
