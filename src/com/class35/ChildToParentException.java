package com.class35;

public class ChildToParentException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 17, 99, 8 };

		try {

			Thread.sleep(2000);
			System.out.println(array[3]);// new ArrayIndexOutOfBoundsException
		} catch (InterruptedException e) {

		} catch (ArithmeticException e) {//child exceptionlar uste yazilir.
			
		} catch (Exception e) {//exception parent class tum exception turlerinin. O yuzden en alta yazilir

		}

		System.out.println("Code after an exception");//tek print bu cikicak cunku sysout kullanmadik.

	}
}
//ArrayIndexOutOfBoundsException e=new ArrayIndexOutOfBoundsException();
//Exception e1=new ArrayIndexOutOfBoundsException();
