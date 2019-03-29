package com.class5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter quiz score: ");
        int quiz = scanner.nextInt();
        System.out.println("Please enter mid term score: ");
        int midTerm = scanner.nextInt();
        System.out.println("Please enter final score: ");
        int finalGrade = scanner.nextInt();
        double average = (quiz+midTerm+finalGrade)/3;
        
        if(average >= 90) {
            System.out.println("Your Grade is A");
        } else if(average >= 70 && average < 90) {
            System.out.println("Your Grade is B");
        } else if(average >= 50 && average < 70) {
            System.out.println("Your Grade is C");
        } else if (average <50) {
            System.out.println("Your Grade is F");
        }
	}

}
