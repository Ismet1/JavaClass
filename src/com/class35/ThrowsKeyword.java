package com.class35;

public class ThrowsKeyword {

	public static String name;
	
	//Main method yoksa execution da yok. class ilk main method'a bakar run etmek icin.
	
	public static void main(String[] args)  {
		
		sleepMode();//ilk bunu call edince, try'li method'a gidiyor, oradan allstudentsSleeping methoduna
		//oradanda studentsleeping methoduna gonderiyor. orada execution'i yapiyor.
		
	}

	public static void studentSleeping() throws InterruptedException {
		System.out.println("student "+name+" is sleeping");
		Thread.sleep(3000);
		System.out.println("give some coffee..");
	}
	
	public static void allStudentsSleeping() throws InterruptedException {//bu satirda cikan kucuk kirmizi hata ustteki thread.sleep e ait aslinda
		studentSleeping();//throws etmedikce burda diger methodu call edemezsin cunku throw sadece ait oldugu methoda ait
	}
	
	public static void sleepMode() {//burda en son try block yapip, bir dahakine hata cikmasini onluyoruz.
		try {
			allStudentsSleeping();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
