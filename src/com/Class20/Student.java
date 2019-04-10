package com.Class20;

public class Student {

	public static void main(String[] args) {
		/*
		 * Create class student that will have a method getGrade
		 * your method should accept the score of a student and return a grade
		 * score > 90 - A , score > 80 - B, score > 70 - C, score > 50 - D, anything else - F
		 */

		 Student person= new Student();
	        
	        System.out.println(person.grade(92));

	    }

	    String grade(int score) {
	        String letterGrade="";
	        if(score>90) {
	            letterGrade="Grade is A";
	        }else if(score>80) {
	            letterGrade="Grade is B";
	        }else if(score>70) {
	            letterGrade="Grade is C";
	        }else if(score>50) {
	            letterGrade="Grade is D";
	        }else {
	            letterGrade="E";
	        }
	        return letterGrade;
	    }
}