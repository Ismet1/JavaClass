package com.Class31;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 =new Student("John", 101);
		Student student2 =new Student("James", 102);
		Student student3 =new Student("Anna", 103);
		Student student4 =new Student("Katy", 104);
		//Ayni sinif icin yukaridaki gibi 4 farkli object olusturup, contructordaki variable'lara
		//4 farkli data tanimi yapabiliriz.
		
		ArrayList<Student>alist =new ArrayList<>();//yukarida olusturdugumuz  objectlerden arraylist yaptik burda
		alist.add(student1);
		alist.add(student2);
		alist.add(student3);
		alist.add(student4);
		
		
		for(Student student: alist) {
			student.printStudentDetails();//tum bilgileri print eder isim+numara
			System.out.println(student.name);//john, james, anna, katy
		}
		
		Iterator<Student> it=alist.iterator();
		while(it.hasNext()) {
			Student obj=it.next();
			obj.printStudentDetails();
		}
	}
	

}
