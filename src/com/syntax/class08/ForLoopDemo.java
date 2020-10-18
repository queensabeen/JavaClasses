package com.syntax.class08;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		//for loop used when you know how many times you want to repeat
		
		/*
		 * FOR SYNTAX
		 * 
		 * for (intialization; condition; increment/decrement){
		 * 		code;
		 * }
		 */
		
		for (int i=1; i<=5; i++) {
			System.out.println("Good Morning");
		}

		//I want to print number 1-100
		
		/*
		 * FOR SYNTAX
		 * 
		 * for (start point; end point; increment/decrement) {
		 * 		code;
		 * }
		 */
		
		for (int i=1; i<=100; i++) {
			System.out.println(i);
		}
		
		//Print numbers 10-0
		
		for (int i=10; i>=0; i--) {
			System.out.println(i);
		}
		
	}
}
