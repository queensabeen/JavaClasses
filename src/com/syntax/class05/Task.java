package com.syntax.class05;

import java.util.Scanner;

public class Task {
public static void main (String[]args) {
	/*
	 * ask user to enter numbers of worked years and annual salary 
	 * if user worked for more or equals to 5 years, then they are eligible for a bonus 
	 * otherwise he is not 
	 * once user is eligible and salary is larger than 50000, then bonus=5000 
	 * otherwise bonus = 3000
	 */
	Scanner scan;
	int salary;
	int time;
	
	scan=new Scanner (System.in);
	
	System.out.println("How many years have you worked?");
	time=scan.nextInt();
	
	System.out.println("What is your annual salary?");
	salary=scan.nextInt();
	
	if (time>=5) {
		if (salary>50000) {
			System.out.println("You are eligble for 5000 bonus");
		}else {
			System.out.println("You are eligible for 3000 bonus");
		}
	}else {
		System.out.println("You are not eligible for a bonus");
	}
	
	
}
}
