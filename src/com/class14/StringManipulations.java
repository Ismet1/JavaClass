package com.class14;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//1) Replace
		//will replace old character with new value
		/*
		String str="I am good tester#1!";
		String newStr=str.replace("a", "e");
		System.out.println(newStr);

		
		String newStr1=str.replace("good", "great");
		System.out.println(newStr1);
		
		
		String newStr2=str.replace("tester",  "programmer");
		System.out.println(newStr2);
		
		String newStr3=str.replace("Tester",  "programmer");//tester degismiycek cunku case sensetive
		System.out.println(newStr3); //I am good terter (olarak cikicak)
		
		
		str=str.replace("!", "?"); //direk kendisine tanimlayabilirsin.
		System.out.println(str);
		
		
		str=str.replace("1", "2");
		System.out.println(str);
		*/
		
		
		
		
		
		//2) replaceAll() - wil replace all that matches specified pattern
		/*
		String str1="12Hello 3234 World 465%^%";
		String replaced=str1.replaceAll("[0-9]", "");//0'dan 9'a tum numaralari cikarmak icin 'boslukla' replace yapiyoz
		System.out.println(replaced);
		
		String replacedNoNumbers=replaced.replaceAll("[a-z]", "");
		System.out.println(replacedNoNumbers);//H   W%^% (sonucu cikti cunku sensetive case)
		
		
		String replacedNoCharacter1=replaced.replaceAll("[A-Za-z]", "");//hem kucuk hem buyuk harfleri tanimladik
		System.out.println(replacedNoCharacter1);//%^% (sonucu cikti cunku)
		*/
		/*
		String str1="12Hello 3234 World 465%^%";
		String replacedNoNumbers=str1.replaceAll("[0-9]", "");
		System.out.println(replacedNoNumbers);
		
		String newString=replacedNoNumbers.replaceAll("[^A-Z a-z]", "");
		System.out.println(newString);
		
  		//String replacedNoCharacter=replacedNoNumbers.replaceAll("[A-Za-z]", "");
		//System.out.println(replacedNoCharacter);
		
		String str2="1Hello123";
		System.out.println(str2.replaceAll("[^0-9]", ""));
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
