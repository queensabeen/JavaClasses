package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and final scores)
		 * determine the grade based on the following rules: 
		 * if the average score >=90 → grade=A 
		 * if the average score >= 70 and <90 → grade=B 
		 * if the average score>=50 and <70 → grade=C 
		 * if the average score<50 → grade=F
		 */
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your quiz score");
		int quiz = scan.nextInt();
		
		System.out.println("Please enter your mid term score");
		int midTerm = scan.nextInt();
		
		System.out.println("Please enter your Final score");
		int finalScore = scan.nextInt();
		
		int avg=((quiz+midTerm+finalScore)/3);

		if (avg >= 90) {
			System.out.println("Grade A");
		} else if (avg >= 70 && avg < 90) {
			System.out.println("Grade B");
		} else if (avg >= 50 && avg < 70) {
			System.out.println("Grade C");
		} else if (avg >=40 && avg < 50) {
			System.out.println("Grade D");
		}else {
			System.out.println("Grade F");
		}
		
		//If Grade is A or B, you are a good student


		

	}

}
