package com.syntax.class08;

import java.util.Scanner;

public class TaskAskToApplyForCreditCard {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String response;
		
		do  {
			System.out.println("Would you like to apply for a credit card?");
			response=scan.next();
		}while (!response.equalsIgnoreCase("yes"));
		
		System.out.println("You have been selected");

	}

}
