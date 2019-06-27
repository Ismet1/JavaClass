package com.Class25;

public class SyntaxStudent extends Student {
	
	
	//return type must be same between child and parent class
	//we can not do void here and boolean back in student class for same method
	//public boolean study(){we can not do this cuz in student class different
	public void study() {
		System.out.println("syntax students must study HARD");
	}
	
	protected void doHomework() {
		System.out.println("syntax students must do REPL");
	}
	
	
	void attendClasses() {
		System.out.println("syntax students must attend ALL classes and take notes");
	}
	
	private void doResearch() {
		System.out.println("syntax students must make google");
	}
	
}
