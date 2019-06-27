package com.class36;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuffer sb = new StringBuffer("Hello");//StringBuffer is a class so we create like this.
		//sadece String sb =new String seklinde String(2.yolu) olusturma yoluna gitseydik asagidaki functionlari kullanamazdik.
		sb.deleteCharAt(3);
		
		System.out.println(sb);
		System.out.println("-----------------------------");
		
		String str="Good morning";
		str.concat(" John");
		
		System.out.println(str);//Good morning //john'u eklemicek cunku usttekiyle ayni reason. Buffer yapman lazim.
		
		System.out.println("---------buffer----------");
		
		StringBuffer sb1=new StringBuffer("Hello");
		sb1.append(" John");//append ile ekledik
		
		System.out.println(sb1);//Hello John
		
		
		
	}

}
