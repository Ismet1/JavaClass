package com.class17_2;

public class NestedLoop {

	public static void main(String[] args) {
		//---Nested Loop---//
		NestedLoop mthd=new NestedLoop();
		mthd.printNestedLoop();
	
	
			
	}

	
	
	void printNestedLoop() {

		for (int i=0; i<3; i++) {//outer loop
		System.out.println(i);//3 times executed
		
		for (int y=0; y<3; y++) {//inner loop		
			System.out.println(y);//9 times executed //
		}
	}
		
	/*
	 * output;
	 * 0 - outer loop
	 * 0 - inner loop
	 * 1 - inner loop
	 * 2 - inner loop
	 * 1 - outer loop
	 * 0 - inner loop 
	 * 1 - inner loop
	 * 2 - inner loop	
	 * 2 - outer loop
	 * 0 - inner loop
	 * 1 - inner loop
	 * 2 - inner loop
	 */	
	}
	
}
