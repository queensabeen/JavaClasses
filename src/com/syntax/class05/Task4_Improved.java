package com.syntax.class05;

import java.util.Scanner;

public class Task4_Improved {

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

		String birth=null;//initialize 
		
		if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			birth="Summer";
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			birth="Fall";
		} else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
			birth="Winter";
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			birth="Spring";
		} /*
			 * else { birth="invalid"; }
			 */
		
		System.out.println("You were born in " + birth);

	}

}
