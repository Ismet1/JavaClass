package com.class17;

import com.class17_2.ScannerMethod;//Scannermethod class'ini buraya yazip, eslestirnce direk olarak cikiyor bu.

public class Application1 { 

	public static void main(String[] args) {
		//class_17/2'nin konusu. Burda review yapma.	

		ScannerMethod scnMthd = new ScannerMethod();
		System.out.println(scnMthd.sum(123, 150)); //class17_2 pack'dan ScannerMethod sinifindaki "sum" method'una ulasabiliyoruz.
	}

}
