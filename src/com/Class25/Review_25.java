package com.Class25;

public class Review_25 {
//Bu Review sayfasindaki cogu sey run edilemez. Kendi sayfalarina gidip run edebilirsin.
	
//-----------------Method Overriding'te Access Modifier Kurallari---------------//
//Parent classtaki methodlarin access modifier'i ile child classtaki accesss modifier'lar farkli olabilir ama!
//parent class'ta olusurdugumuz methodlarin access modf.'indan daha kucuk olamazlar. Ornek;
//parent classta public yaptik methodu ama child class'ta protected yapmaya calisiyoruz. Bu olmaz.
//Ornek (student class ile syntaxstudent class'ta mevcut)

	
//-----------------Method Overriding Output Bilgilendirmesi!!!---------------------//
	
	/*
	public class Payment {

		public void makePayment() { //overridden method
			System.out.println("we can make a payment with no fee");
		}
		
		public void closePayment() {
			System.out.println("all payments needs to be closed");
		}
		
		
	}

	class MasterCard extends Payment{
		public void makePayment() { //overriding method
			System.out.println("we can make a payment with MC and 2%fee");
		}
	}

	class Visa extends Payment{
		public void makePayment() { //overriding method
			System.out.println("we can make a payment with Visa and 1.5%fee");
		}
		
		public void annualFee() { 
			System.out.println("Visa card has annual fee");
		}
	}
	*/
	//Asagidaki Test class'i
	/*
	 public class PaymentTest {

	public static void main(String[] args) {
	
	//Burada normal parent class'in objectini olusturuyoruz
		Payment parent = new Payment() 
		parent.makePayment();
	
	//Burada child class'in objectini oluturyoruz.
		MasterCard mc = new MasterCard();
		mc.makePayment();
	
	//Yine diger child class'in objectini olusturuyoruz
		Visa visa = new Visa();
		visa.makePayment();
		visa.annualFee();
	
	//Olay burada basliyor. Parent class ile child class'in overriding objectini olusturuyoruz.
	//Bu tip parent lass ile child class ortak object olusturmalarda , classlarin sahip oldugu ortak methodlara gore
	//farkli sonuclar alabiliriz. Normalde bu ortak overriding objectlerde, methodlar call edildigi zaman
	//child class'in outputunu goruruz fakat call edilen method child classta yok sadece parent classta var ise
	//o zaman parent class'in outputunu verir bize java. Bu tum anlatilana "Run time polymorphism" deniyor.
	//ONEMLI!!!; methodlarin icerisine farkli parametreler koyarakta methodlari farklilastirip, output'u child classtan degilde
	//parent classtan alma gibi bir sonuc cikabilir.Tamamen call edilen methodun child class'ta olup olmamasiyla ilgili.
	//child classtaki methodu parametrelerle degistirip baska bir methoda donusturursek , o zaman yine parent classtakini run edicek.
	//(test class'da ornegini gorebilirsin)
	
		Payment pay=new MasterCard();//pay = reference variable, payment = type, new MasterCard(); = creating an Object
		pay.closePayment(); //bu method masterCard sinifinda olmadiigi icin parent class'in ciktisi alinir
		pay.makePayment();//overriden yapilan veri child'tan aliyor.
		
	//ONEMLI!!!; Overriding object'ni olusturuken ilk Parent class'in ismi yazilir her zaman , daha sonra o child class'a esitlenir
	//tam tersini yapmaya kalkarsak hata verir java. Dogru olan = 	"Payment pay1=new Visa();"
		Payment pay1=new Visa();
		pay1.closePayment();//parent class'tan gelcek cunku child class'ta yok
		pay1.makePayment();//child class'tan gelcek cunku ortak veri
		//pay1.annualFee(); //undefined cunku bir ust sinifta tanimlanmamis
		
	}

}
	 */
	
	
	
	
	
	
	
	
	
//---------------------- Method Hiding --------------------//
//Method overridiing yaparken, static veri tipi kullanilarak, parent class'in outputunu almaya denir.
//Yani child class'in outputuun cikmasi gerekirken, parent class'in kini aliyoruz. Buna Method Hiding deniyor.
	/*
	public class Animal {

		public static void whoAmI() {
			System.out.println("I am an animal");
		}
	}

	class Puppy extends Animal {
		//Asagideki iki satiri comment ettik cunku "we can not override static method with instance"
		//Eger method overriding yapicak isek bunlarin hepsi static olacak yada instance olacak.
		
		//public void whoAmI() {
		//	System.out.println();}
			
	}
	class Monkey extends Animal{
		public static void whoAmI() {
			System.out.println("I am a Monkey");
		}
	}
	*/
	//Simdi test sayfasina geciyoruz
	/*
	 Animal obj=new Monkey();
		obj.whoAmI();//I am an animal //child class'in output'ini vermedi
		//cunku static method is not overriding!!!!!
		//O yuzden parent class'in outputunu alir 
	 */
	
	
	
	
	//---------------Constructor Overriding------------------//
	//we can NOT override a constructor. We only able to overload it.
	//Cunku constructor zaten class isminin tekrarlanmasiyla yapilabilen bisey daolayisiyla 
	//farli siniflarda farkli sinif isimleri oldugundan dolayi, isimlerin tekrarlanmasi gibi bir ihtimalde kalmiyor.
	/*
	public class Parent {
			
			Parent () {
				System.out.println("i am a parent constructor");
			}
		}
			
			class Child extends Parent{
		//we can not override a constructor. Dolayisiyla asagidaki iki line'i comment ettik.
			
				//Parent () {
					//System.out.println("i am a child constructor");}
					
				Child () {
					System.out.println("i am a child constructor");
				}}
		*/		
			
		
	
	
	//-------------------------Final Keyword-----------------------------------//
	/*
	//1.Final Variable
	
			final String str="Hello"; //it means u can not change this variable anymore
			//str="John"; / compiler complaning 
		}
		
	//2.Final Methods

		public final void hello() {
			System.out.println("Hello from Parent class");
		}	
	}
	//bu class'i yarattik cunku "final method override yapiliyormu diye
	class ChildOfFinal extends FinalKeyword{
		//gordukkki hata  veriyor. Eger commentten cikarsan hata vericek. Final Method override yapilamiyor.
		//public final void hello() {
		//System.out.println("Hello from Parent class");}
		
		*/
	
	
	
	
	//----------------------Casting-------------------------------------------//
	/*
	public class Casting {

		public static void main(String[] args) {
			
			//Implicit(Automatic casting)casting or Widening
			//10 yazmamiza ragmen output'u double a uygun cikariyor. Buna implicit casting deniyor
			//cunku double int a gore daha buyuk data type dolayisiyla kendi donusebiliyor
			double a=10;
			System.out.println(a);//10.0 //compiler takes care of conversion
			
			
			//Explicit casting or Manual Casting or Narrowing
			//burda buyuk data type i kucuk data type'in icine kendimiz yerlestiriyoruz
			double b=10.0;
			int c=(int)b; //Burda normalde int c=b; diyip c'nin outputunu alcaktik ama hata veriyor. Cunku double'i int icinesokamiyor.
			//Dolayisiyla yukaridaki gibi yazip "manual casting" yapiyoruz.
			System.out.println(c);
	
	
			//Up Casting/Downn Casting
			
			//UpCasting (buyukten kucuge otomatik ceviriyo biraz onceki gibi
			Payment pay = new MasterCard();
		
			//MasterCard mc = new Payment(); //compiler not allow you cunku kucukten buyuge.
			//dolayisiyla biz kendimiz cevirmek istiyosak buna "DownCasting" deniyor
			//MasterCard mc =(MasterCard)new Payment();
	
	*/
}
