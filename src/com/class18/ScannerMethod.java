package com.class18;

import java.util.Scanner;

public class ScannerMethod {

public static void main(String[] args) {
        //bu sayfa return konusunun haricinde, application1 sayfalariyla eslestirilip,
		//veri alis-verisinin kullanilmasinin anlatildigi bir sayfa haline getirildi. Package 17 ve 17-2 yi incele.
        ScannerMethod obj = new ScannerMethod();
        
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int d =12;
        
        int c = obj.sum(d, 123);
        System.out.println(obj.sum(a, b)); //bu kismi incele
        
        
//        obj.sum(12, 13);
//        obj.sum(100, 100);
//        
//        obj.sub();
//        obj.sub();
        
    }
    
   public int sum(int a, int b) { //return yaptigimiz icin void yerine int koyduk
        
//        System.out.println(a +b);
        
        return b+a; //ayni sonucu cikartiyor.
       //Note; return'u cikartabilmemiz icin , return'un oldugu method'un basindaki "void"i kaldirmamiz gerekiyor. onun yerine
       //int yada diger variable type koyariz. ve return sysout gibi sonucu verir.
    }
    
    void sub() {
        int a=10, b=12;
        
        System.out.println(a - b);

        
    }
    
    
    
    
    

}