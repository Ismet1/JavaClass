package pack1;

public class Human {
//Application class ile connection	
static String eyeColour = "Brown"; //static koydugumuz zaman variable basina , diger class'ta kullanamiyoruz.
int height = 6;
int weight = 180;
String gender = "F";

String programmingLanguage = "Java";

void speak() {
	
	String language = "English"; //Local variable cunku method'un icinde
	System.out.println("Humans can speak" + language);
}

void coding() {
	System.out.println("Syntax students can code"); //+ language 'i burda kullanamayiz, cunku local variable.
}



}
