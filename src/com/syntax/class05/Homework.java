package com.syntax.class05;

import java.util.Scanner;

public class Homework {
public static void main (String[]args) {
	/*
	 * Create a Java program that will ask user if user has a credit card or not if
	 * user does not have a credit card, then offer them one if used does have one,
	 * as what is the balance on the card if balance on the card is larger than 1000
	 * tell them to pay off immediately otherise tell them they can spend more
	 */
	
	Scanner scan;
	String answer;
	double balance;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter if you have a credit card (true/false)");
	
	answer=scan.next();
	
	if (answer.equalsIgnoreCase("yes")) {
		System.out.println("What is the balance on your card?");
		balance=scan.nextDouble();
		if (balance>1000) {
			System.out.println("Please pay your balance");
		}else {
			System.out.println("You can spend more!!");
		}
	}else {
		System.out.println("Would you like to open a credit card?");
	}
	
}
}
