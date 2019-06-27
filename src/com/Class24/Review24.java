package com.Class24;

public class Review24 {
}


//-------Class icinde baska Class'lar olusturma--------//

/*
 * Bu class'lar icindeki methodlari baska bir sayfada Main method icinde object olusturup
 * Methodlari call ederek , output alabiliriz. Burda dikkat etmen gereken Main Class'in parantezini
 * diger class'lari acmadan kapamis olman. Yoksa hata verir.
 */
/*
class Review24_1 extends Review24{
	public int chargeInterest() {
		return 2;
	}
}

class Review24_2 extends Review24{
	public int chargeInterest() {
		return 4;
	}
}
*/





//----------2 farkli class'in ortak Object'ini olusturmak-------------//

//Burada calistiramazsin (Parent/Child/Testing) classlarina bak calistirmak icin
//Normalde bir sinifin ismini saga ve sola yazip icinede bir variable'i = new 'e esitleyince object olusturuyoduk
//ve bu object vasitasiyla methodlari call edebiliyorduk. Burada gorecegimiz Iki sinifin ortak Objectini olusturmak.

/*
//Bu normal parent sinifinin object'i
Parent parent = new Parent();
parent.love();
parent.work();

//Bu normal Child sinifinin object'i
Child child = new Child();
child.love();
child.cry();
child.work();

//Olay burda basliyor.
//type casting(deniyor iki sinifin ortak object olusturulmasina)
Parent obj = new Child();
obj.work();// Parent work cikicak sonuc
obj.love();//Child love cikicak. Overriden veriler ice giren siniftan yani bu ornekte child sinifindan cikicak.
//obj.cry(); is not accessible cunku ilk parent i yazdik. Child parent in icine grdi ve parent'i baz aliyoruz.
//parent class'i baz aldigimiz icinde obj.cry'i call edemiyoruz. Sadece parent class'ta var olanlari call edebiliriz ve!!
//ortak call edilenler extend yaparak olusturdugumuz class'in methodlarina gore output verir!!!

//Child obj1 = new Parent(); bu sekilde object yaratamiyosun cunku child 
//kucuk olan sinif yani extendle olusturulan. O yuzden ilk Parent sinifi declare edilmesi lazim.
*/



//--------------------Extend'le olusturulan Class'lar arasi bir kural-----------------//

/*
//burda konuyu anlattik, execute etmek icin bahsi gecen siniflara git.
//Burada uc class olusturduk bir parent class yani employee ve iki child class fulltimeemployee ve contractor.
//testing sayfasinda asagida yer alan objectler olusturuldu ve herbir class icindeki methodlar call edildi.
//ancak contractor sinifinin icine herhangi bir method yerlestirilmedi. Bos oldugu icinde Contractor objectinden
//call edilen method "employee" yani parent class'in icindeki method 'u print etti.
Employee emp=new Employee();
FullTimeEmployee ft = new FullTimeEmployee();
Contractor contractor=new Contractor();

//
emp.getPaid();//employee gets paid salary
ft.getPaid();// full time employee gets paid salary + bonus
contractor.getPaid();//Contactor sayfasi bos olmasina ragmen, employee sayfasindaki print'i verdi.
//cunku contractor ve fulltimeemployee sayfasi parent sayfaya baglandilar. extend ile. 
//eger child sinifinda bir veri yoksa parent yani ana sayfadakiyi bilgiyi print eder.
*/




//---------------Static Method Overloading------------------//

//Execute etmek istiyosan Task-2'ye git.
//Static veri olusturunca , methodlari main method icinde call ederken, Object
//kullanmamiza gerek yok. Direk method ismini yazip, method'u call edebiliriz.'
/*
public static void main(String[] args) {
	
	method(5);
	method("ismet", 5);
	method("ismet");

//Eger farkli class'tan call ediyor olsaydik static veriyi o zaman;
// "Task2.method()"	diye call edicektik yani basina class ismini yazicaktik
	
}

static void method(int a) {
	System.out.println(a);
}

static void method(String str) {
	System.out.println(str);
}

static void method(String str, int a) {
	System.out.println(str+a);
}
*/




//------------Static method'ta output alma sekilleri------------------//
/*
 static String ss= "Welcome To Syntax Solutions";
 public static void main(String[] args) {
  System.out.println(ss);//direk olarak print etme
        System.out.println(Main.ss);//class ismi yazilarak //instance'ta bu olmaz
        Main obj = new Main();
        System.out.println(obj.ss);//object yaratarak output alma
 }
}
 */

