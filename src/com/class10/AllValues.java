package com.class10;

public class AllValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		for (int i=0; i<=grades.length-1; i++) { 
			System.out.println(grades[i]);
		}
		//burda '-1' dedik cunku grades.length=6 cunku 6 harf var.
		//i=0 oldugu icin loop 0'dan baslicak ve i<=grades.lenght oldugu icin
		//7 tane sonuc vermeye calisacak. 6 tane sonuc veridkten sonra, 7cide hata vericek
		//ilk 6 taneyi cikardiktan sonra.(buda Array'in istisnasiydi.
		//dolayisiyla; 7cide hata vermesini onlemek icin 'grades.length-1' dedik yani 1 cikardik.
		//i<=grades.length ifadesindeki '='de cikarilabilirdi. ama ileride '=' ifadesini kullanmamiz gereken yerler olucak
		//o yuzden -1 kullandik
		
		
	}

}
