package com.Class27;

public class Review_27 {

//---------------------------------Abstract Class-----------------------------//
	
	
	public abstract class AbstractClass {

		//implemented //Eger method'un logic'ini burda olusturuyorsak "implemented" oluyor.
		public void test() {
			System.out.println("I am non static test method");
		}
		
		//unimplemented 
		public abstract void hello(); 
		//buna abstract  diyor. Bunu kullandigimiz zaman class'in abstract yapilmasi gerekiyor
		//(Hata verdigi zaman, hataya cift tiklayip otomatik cikartiyoruz)
		//bunun amaci burda bir sysout yapmiyoruz. Sonraya birakiyoruz, child class'lara.
	}
	
	
	

//------------------------------This/Super Kullanimina Ornek----------------------//
//coding class: (test class asagida)
	
	public class UserClass {
			public String name; //parent class'ta iki variabla declare ediliyor
			public long mobileNumber;
			
			public UserClass(String name, long mobileNumber) { //Parent class'ta constructor olusturuluyor cunku test class'ta data'lar
				//child class'a veriliyor. Parent class'taki variablelari o datalara initilize edebilmemiz icin hem parent class'ta 
				//hemide child class'ta constructor olusturuluyor.
				this.name=name; //bu thisler ile child classtan parent class'a tasinmis datalari yukaridaki variablelara initilize ediyoruz.
				this.mobileNumber=mobileNumber;
			}
		}
		class UserInfo extends UserClass {
			
			public String address; //bu variable child classta oldugu icin bunu bu classtaki constructor'in icinde olusturcagimiz
			//this. ile initilize edebiliriz.
			
			public UserInfo(String name, long mobileNumber, String address) {
				super(name, mobileNumber);//super kullaniyoruz cunku test sinifindan verilen datalar su an icinde bulundugumuz
				//constructra veriliyor. Parent class'taki constructor'a tasimak icin "super" kullaniyoruz. 
				this.address=address;
			}
			
			public void userDetails() {
				System.out.println("User name is "+name+" and phone number is "+mobileNumber
						+" and addrees is "+address);
			}
		}


//test class
		/*
		public class UserTest {
			public static void main(String[] args) {
				
				UserInfo obj=new UserInfo("John Smith", 2015801111, "123 test st. test city");//Burada Child class'in constructor'ina data veriliyor.
				obj.userDetails();
			}
		}
		*/
		
		
		
		
		
//-------------------------Abstract Multiple Class'a Ornek--------------------------------------//
		
//coding saylasi;(test sayfasi asagida)
		public abstract class Phone {

			public void makeCall() {
				System.out.println("Phone can make a call");
			}
			
			public void sendText() {
				System.out.println("Phone can send a msg");//iki tane implemented method olusturduk
			}
			
			public abstract void unlockPhone();
			public abstract void viewPictures();//iki tanede unimplemented mthod olusturuyoruz
			
		}

		class iPhone extends Phone{//concrete class(diyoruz Parent classta implement edilmeyen methodlari implement ettigimiz class'a)

			@Override//sinifi olustururken cikan error'a cift tiklayinca otomatik implement ediyor. Tabi parent class abstarct yapildiysa.
			public void unlockPhone() {
				System.out.println("to unlock phone we can use faceID or fingerprint");
			}

			@Override
			public void viewPictures() {
				System.out.println("to view pics on iphone can go to images");
				
			}	
		}

//test sayfasi
		/*
		public class PhoneTest {

			public static void main(String[] args) {
				
				//Phone obj=new Phone(); //ONEMLI; cannot instantiate cuz phone class is an abstract class!!!
				Phone phone1 = new iPhone(); //Child class ile ortak instantiate etmeliyiz abstarct class'lari.
				phone1.makeCall();
				phone1.sendText();
				phone1.unlockPhone();
				phone1.viewPictures();
				
				
				Phone phone2 = new Samsung();
				phone2.makeCall();
				phone2.sendText();
				phone2.unlockPhone();
				phone2.viewPictures();
		*/
		

	}
