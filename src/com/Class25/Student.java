package com.Class25;

public class Student {
//syntax student sinifiyla eslesiyor
	
	public void study() {
		System.out.println("students must study");
	}
	
	//Overriding restrictive rule for access modifiers.
	//buda default olamaz ama public olabilir. eslestigi siniftaki accesss modifierstan
	//daha kucuk olamaz.
	protected void doHomework() {
		System.out.println("students must do homework");
	}
	
	//syntax sinifiyla syntaxstudent sinifindaki accesss modifiers ayni olmali
	//yada kendisinden bir buyugu olmali. yani asaagidaki default, protected olabilir
	//ama private olamaz
	void attendClasses(int a) {
		System.out.println("students must attend classes");
	}
	
	private void doResearch() {
		System.out.println("students must do research");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		

	}

}
