package com.class17_2;

public class LoopExamples {

	public static void main(String[] args) {
	
		LoopExamples mthd = new LoopExamples();
		mthd.printExamples();	
		
		
	}

	
	
	
	void printExamples() {
		// I want to print pattern
				// 12345
				// 12345
				// 12345
				// 12345
				
				/*
				for (int i=1; i<5; i++) { //outer loop gorevi goruyor burda, 4 kere ceviricek cevabi
					for(int y=1; y<6; y++) {
						System.out.print(y);//12345
					}
					System.out.println();//yeni satira gecmene yariyor.
				}
		*/
				
				
				
				
				
				
				/*
				 * i want to print pattern
				 * 111111
				 * 222222
				 * 333333
				 * 444444
				 * 555555
				 * 666666
				 * 777777
				 */
				/*
				for (int i=1; i<=7; i++) {
					for(int y=1; y<=7; y++) {
					
					System.out.print(i);}
				
				System.out.println();}
				*/
				//2. yolu
				/*
				for(int y=1; y<=7; y++) {
					
					System.out.print(y+""+y+""+y+y+y+y+y);
				
				System.out.println();}
				 */
				
				
				
				
				/*
				 * i want to print pattern
				 *  *****
				 *  *****
				 *  *****
				 *  *****
				 *  *****
				 */
				/*
				for (int i=0; i<5; i++) {
					for(int y=0; y<5; y++) {
						System.out.print("*");
					}
				System.out.println();
				}
				*/
				
				
				
				
				/*
				 * i want to print pattern
				 * 54321
				 * 54321
				 * 54321
				 * 54321
				 */
				/*
				for (int i=0; i<4; i++) {
					for(int y=5; y>0; y--) {
						System.out.print(y);
					}
				System.out.println();
				}
				*/
				
				
				
				/*
				 * i want to print pattern
				 * 55555
				 * 44444
				 * 33333
				 * 22222
				 * 11111
				 */
				/*
				for (int i=5; i>0; i--) {
					for(int y=5; y>0; y--) {
						System.out.print(i);
					}
				System.out.println();
				}
				*/
				
				
				/*
				 * i want to print pattern
				 * *
				 * **
				 * ***
				 * ****
				 */
				/*
				for (int i=4; i>0; i--) {
					for(int y=4; y>=i; y--) { //satirda degisiklik yapicaz, o yuzden y>i'yi buraya koyduk
						System.out.print("*");
					}
				System.out.println();
				}
				*/
				
				
				
	}
}
