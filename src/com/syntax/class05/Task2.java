package com.syntax.class05;

import java.util.Scanner;

public class Task2 {
public static void main (String[]args) {
	
	/*Prompt user to enter persons height in inches
	 * person should be classified as:
	 * 				-short(under 60 inches)
	 * 				-medium(between 60-72 inches)
	 * 				-tall (over 72 inches)
	 */
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("What is your height in inches?");
	int height=scan.nextInt();
	
	if (height<=60) {
		System.out.println("short");
	}else if (height>61 && height<=72) {
		System.out.println("medium");
	}else {
		System.out.println("tall");
	}
	
	System.out.println("------------TASK 2----------------------");
	
	/*
	 * program that will print whether it is a weekend or weekday
	 * if any day from 1-5, it is a weekday
	 * 6-7, it is a weekend
	 * any other day, invalid day
	 */
	
	
	Scanner day=new Scanner (System.in);
	System.out.println("Enter day in numbers");
	
	int numday=day.nextInt();
	
	if (numday==1 || numday==2 || numday==3 || numday==4 || numday==5) {
		System.out.println("It is a weekday");
	}else if (numday==6 || numday==7) {
		System.out.println("It is the weekend");
	}else {
		System.out.println("Invalid day");
	}
	
	
}
}
