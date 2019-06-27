package com.Class26;

public class Review26 {

	
//-----------------------Return'lu Method'u Call etme-----------------//
	
	/*
	 public class Bank {

	int getBalance() {
		return 0;
	}
}
//Test edilen kisim asagida
 * 
 public static void main(String[] args) {
		BankA obj=new BankA();
		System.out.println(obj.getBalance()); //sysout icerisine yazilir method'un call. Cunku return bilgiyi depoya koyar print etmez.
	 */
	
	

//-------------Object olusturmanin farkli versiyonu-------------//
	
//Ornegi run etmek icin "phone class"ina gidilebilir.
	/*
	Phone parentPhone;
	//assinging iphone object
	parentPhone=new iPhone();
	parentPhone.makeCall();
	parentPhone.hasCamera();
	//assinging samsung object
	parentPhone=new Samsung();
	parentPhone.makeCall();
	parentPhone.hasCamera();
	//assinging Nokia object 
	parentPhone=new Nokia();
	parentPhone.makeCall();
	parentPhone.hasCamera();
	
	*/
	
	
	
	
	//-----------------------------------This--------------------------------//
	
	//This. = variables or methods // this() = constructor
	//Calistirmak icin ThisKeyword sayfasina gidilebilir.(This'in yanindaki num1-num2'ler ve an bastaki num1-num2 mavi digerleri kahverengi)
	/*
	public class ThisKeyword {

		int num1, num2;
		
		public ThisKeyword() {
			System.out.println("no parameters here");
		}
		
		public ThisKeyword(int num1, int num2) {
			this.num1=num1;
			this.num2=num2;
		//maviler instance variable, bordolar local variable.
		}
		
		public void sum(int num1, int num2) {
			System.out.println("the sum of local variables="+(num1+num2));
			System.out.println("the sum of instance variables="+(this.num1+this.num2));
		}
	}
	//test sayfasi asagida
	 * 
	 ThisKeyword obj=new ThisKeyword(10, 20);
	 
		//diger sayfadaki constructor'a veriyor bu degerleri
		obj.sum(100, 200); //the sum of local variables=300 //the sum of instance variables=30
		
		//seklinde iki output cikartiyor. Ilk output zaten 100 ile 2oo'u 2 int'li method'un icine yerlestrip cikti veriyor.
		//Ikinci outputta ise daha oncden test sayfasinda yarattigimiz object'in icindeki rakamlari , parent sayfadaki constructor'in
		//icine yerlestiriyor. o constructor icindeki this.num'li verileri, local verilere esitlendiginden, this'li veriler
		//otomatikman 10 ve 20'li degerleri almis oluyor. Dolayisiyla "sum methodundaki" ikinci sysout this.num'li veriler oldugu
		//icin , output 30 oluyor.
	*/
	
	
	
	
	
	//------------------------This with Methods----------------------//
	
	//ThisWithMethos sayfasina gidilebilir.
	
	/*
	 public class ThisWithMethods {

	public void m1() {//bu m1 oldugu icin bu cikmiyor cunku bunu call etmedik.
		System.out.println("I am m1 method");
	}
	
	public void m2() {
		this.m1();//bu this method oldugu icin ilk bunu print ediyor
		System.out.println("I am m2 method");//sonra bunu print ediyor
	}
	
	public static void main(String[] args) {
		
		ThisWithMethods obj=new ThisWithMethods();
		obj.m2();
	}
}


	//ONEMLI!!!; Method'un icine This koydugumuzda:
	//1)This en onde olmalidir yoksa calismaz. 
	//Mesela sysout'in bir altina koydunmu "This"i calismaz. Constructor'larda da bu sekilde
	//2)This'i yazmayip direk methodun ismini yazarsakta, java "this" varmis gibi davranir.
	//Mesela;
	    //public void callingMethods() {
		//sayName(); //burda sayName'i this.sayName gibi algilar java.
	 */
	
	
	
	
	
	//------------------------This with Constructors----------------------//
	
	//ThiswithConstructor sayfasina gidilebilir run etmek icin
	//Method with this ile ayni yontem.
	
	
	
	
	
	
	//---------------------------------Super Keyword-------------------------------------------//
	
	//super. = variable and method // super() = constructor
	/*
	public class SuperKeyword {
		
		String name="John";
		
		public void sayName() {
			System.out.println("Parent name is "+name);
		}
	}

	class ChildOfSuperKeyword extends SuperKeyword{
		String name="Micheal";
		
		public void sayName() {
			//super keyword'u sana burda parent class'in ozelliklerini
			//kullandiriyor. Child sinifinda bile olsan geriye donup
			//parent classtan veriyi alip kullaniyor.
			System.out.println("Parent name is "+super.name);
			System.out.println("Child name is "+name);
		}
	*/
	//test sayfasi asagida
	/*
	 public static void main(String[] args) {

		ChildOfSuperKeyword obj=new ChildOfSuperKeyword();
		obj.sayName();
		//ilk ciktida super.name oldugu icin ilk parent classtaki name olan john'u kullaniyor.
	 */
	
	
	
	//---------------------Super Keyword Constructor---------------------------------//
	//SuperWithConstructor sayfasina gidilebilir run etmek icin
	
	/*
	 public class SuperWithConstructor {

	 SuperWithConstructor() {
		System.out.println("i am a parent class constructor");
	}
	
	 SuperWithConstructor(String str) {
		System.out.println("i am a parent class constructor with 1 parameter");
	}
}

class ChildOfSuperWithConstructor extends SuperWithConstructor {
	
	public ChildOfSuperWithConstructor() {
		//burda super'i kullaninca yukari cikip parent class'taki parameterinin eslestigi
		//constructor'i print etti.
		super("Hello");//superde this gibi ilk line'da olmali yoksa calismaz
		System.out.println("i am a child class constructor");
	}
}
//test class asagida
 	public static void main(String[] args) {
		
		System.out.println("---object of child class-----");
		ChildOfSuperWithConstructor obj = new ChildOfSuperWithConstructor();
	}
}
//burda ilk output "i am a parent class constructor with 1 parameter" cunku super'den dolayi. super'in icinde 1 string parameter var
//dolayisiyla otomatik parent class'a gitti(ayni this'teki gibi) oradaki 1 parameterli constructor'i calistirdi
//Eger super olmasaydi ilk output "i am a parent class constructor olacakti, Yani parent classtaki ilk constructor. Cunku biliyosunki
//constructorlarda child'in object'ini olustursan bile parent classtaki constructorin'da outputunu aliyor. Methodta sadece child classin 
//output'u cikar eger child class'in object'i olusturulduysa.
//ikinci outputta "i am a child class constructor" devamin sysout'in icindeki.
	 */
	
}
