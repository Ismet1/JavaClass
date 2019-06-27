package com.Class27;

public abstract class Phone {

	public void makeCall() {
		System.out.println("Phone can make a call");
	}
	
	public void sendText() {
		System.out.println("Phone can send a msg");
	}
	
	public abstract void unlockPhone();
	public abstract void viewPictures();
	
}

class iPhone extends Phone{//concrete class //inherited from a abstract class
//class or implemented by interface and providing implementation of all

//unimplemented methods
	@Override
	public void unlockPhone() {
		System.out.println("to unlock phone we can use faceID or fingerprint");
		// Eger parent classta implementation yapilmadiysa, child classta bunlari yapmak zorundasin
		//yoksa yeni extend class olusturamiyorsun. java hata veriyor.
		
	}

	@Override
	public void viewPictures() {
		System.out.println("to view pics on iphone can go to images");
		
	}	
}

class Samsung extends Phone{

	@Override
	public void unlockPhone() {
		System.out.println("to unlock samsung we need to enter password");
		
	}

	@Override
	public void viewPictures() {
		System.out.println("to view pics on samsung we need to go to gallery");
		
	}
	
}