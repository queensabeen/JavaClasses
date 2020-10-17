package com.syntax.class06;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * Homework: Using scanner class create calculator
		 * Allow user to enter 2 numbers and operator (+,-,*,/)
		 * Based on operator, provide the result to user
		 */
		
		Scanner scan=new Scanner (System.in) ;
		
		int num1;
		int num2;
		char operation;
		int results=0;
		
		System.out.println("Please enter 2 numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		System.out.println("Please enter the operation +, -, /, *.");
		operation=scan.next().charAt(0);
		
		if (operation=='+') {
			results=num1+num2;
		}else if (operation=='-') {
			results=num1-num2;
		}else if (operation=='*') {
			results=num1*num2;
		}else if (operation=='/') {
			results=num1/num2;
		}else {
			System.out.println("Invalid operation");
		}
		System.out.println(results);
		
		
		System.out.println("-------------Switch case---------------");
		
		switch (operation) {
		case '+':
			results=num1+num2;
			break;
			
		case '-':
			results=num1-num2;
			break;
			
		case '*':
			results=num1*num2;
			break;
			
		case '/':
			results=num1/num2;
			break;
			default:
				System.out.println("Invalid operation");
				break;
		}
		System.out.println(results);

	}

}
