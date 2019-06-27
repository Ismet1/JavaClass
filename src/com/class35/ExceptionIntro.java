package com.class35;

import java.util.ArrayList;
import java.util.List;

public class ExceptionIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=0;
		
		System.out.println(a/b);//"0"a bolunme exception in java		
		System.out.println("code after an exception");//exception'dan sonra yazilan hicbisey cikmaz.
		
		ArithmeticException exception =new ArithmeticException();
		throw exception;//exception'i tutma yontemi.
		
		/*
		List<Object> fixedData = new ArrayList<>();//bu ise bir error.
		while (true) {
			Object data = new byte[64 * 1024 - 1];
			fixedData.add(data);
		}
		//System.out.println("Code after an error");will get an c error- unreachable code
		*/
		
		//Throwable'in altinda iki class vaer errors; which is we cannot fix and exceptions; which we can fix.
		//Exceptions 2 ye ayrilir. Checked and unchecked exceptions
		//Checked exceptions; IOexceptions , sqlexceptions, others
		//Unchecked exceptions; (runtime exceptions);....buraya bak notlardan
		
		//There are 2 ways to fix the exception
		//1.try catch
		
		//There are 5 keywords used in Java exception handling
		//try, catch, finally, throw
		
		
		/*
		List<Object> fixedData = new ArrayList<>();
		while(true)
		*/
		
		
		
	}

}
