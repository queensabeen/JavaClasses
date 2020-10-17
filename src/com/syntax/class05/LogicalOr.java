package com.syntax.class05;
import java.util.Scanner;

public class LogicalOr {
public static void main (String[]args) {
	
	String day="Saturday";
	
	if (day.equals("Saturday")||day.equals("Sunday")) {
		System.out.println("Today I have Java class");
	}
	System.out.println("The End");
	
	System.out.println("---------------------Another example---------------------");
	
	/*
	 * if day is 1 or 5 = I am off from Syntax
	 * if day is 2 or 3 = GIT class
	 * if day is 4 = review class
	 * if day is 6 or 7 = Java class
	 * everything else = invalid day
	 */
	
	Scanner scan=new Scanner (System.in);
	System.out.println("Please enter todays day using numbers only from 1-7");
	
	int today=scan.nextInt();
	
	if (today==1 || today==5) {
		System.out.println("I am off from Syntax");
	}else if (today==2 || today==3) {
		System.out.println("I have GIT class");
	}else if (today==4) {
		System.out.println("I have a review class");
	}else if (today==6 || today==7) {
		System.out.println("I have Java class today");
	}else {
		System.out.println("That is an invalid day. Please enter day from 1-7");
	}
	
	
}
}
