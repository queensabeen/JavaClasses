package com.syntax.class07;

public class Recap {

	public static void main(String[] args) {
		/*
		 * // switch (variable){
		 * 
		 * case value1: 
		 * 		code; 
		 * 		break; 
		 * case value2: 
		 * 		code; 
		 * 		break; 
		 * default; 
		 * 		code; }
		 * 
		 * switch does not work with boolean, double, long and float
		 * 
		 * every switch statement can be written using if condition
		 */

		String timeOfDay="Morning";
		String day="Saturday";
		
		switch(timeOfDay) {
		case "Morning":
			System.out.println("Good Morning");
			
			if (day.equals("Saturday")) {
				System.out.println(" Class!");
			}else if (day.equals("Monday")) {
				System.out.println(" Colleague");
			}
			break;
		case "Noon":
			System.out.println("Good Afternoon");
			
			switch (day) {
			case "Monday":
				System.out.println(" Colleague");
				break;
			case "Thursday":
				System.out.println(" Asghar");
				break;
			case "Saturday":
				System.out.println(" Class");
				break;
			
			}
			
			break;	
		case "Evening":
			System.out.println("Good Evening");
			break;
		case "Night":
			System.out.println("Good Night");
			break;	
		default:
			System.out.println("N/A");
		
		}
		
	}

}
