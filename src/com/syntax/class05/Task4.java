package com.syntax.class05;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. 
		 * Based on the month define the season. 
		 * Example: if user is born in June, July or August → season=”Summer”. 
		 * At the end of the program we should see output as “You were born______”.
		 */

		Scanner season = new Scanner(System.in);
		System.out.println("Please enter your birth month");

		String month = season.next();

		if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			System.out.println("Summer");
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			System.out.println("Fall");
		} else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")
				|| month.equalsIgnoreCase("February")) {
			System.out.println("Winter");
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
				|| month.equalsIgnoreCase("May")) {
			System.out.println("Spring");
		}
		System.out.println("You were born in " + month);

	}

}
