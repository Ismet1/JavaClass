package com.class14;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1)split() cumleyi ayiriyor hangi veriyi koyarsak icine, o ayirac oluyor. Ornegimizde 'bosluk' ayiriyor.
		String str="Welcome Syntax Students Batch 4";
		String[] array=str.split(" ");//bu ayirac kelimede olabilir, harfte olabilir, burada bosluk.
		System.out.println(array.length);//kac parcaya ayirdiginin sonucunu veriyor burda.
		
		for(String substring: array) {
			System.out.println(substring);//ayrilmis kelimeleri bu formulle cikariyoruz
		}
		for(int i=0; i<array.length; i++) {//ayrilmis kelimeleri bu formulle cikariyoruz yine
			System.out.println(array[i]);
		}
	}

}
