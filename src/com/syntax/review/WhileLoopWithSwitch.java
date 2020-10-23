package com.syntax.review;

import java.util.Scanner;

public class WhileLoopWithSwitch {

	public static void main(String[] args) {
		double num1;
		double num2;
		char operation;
		double results = 0;
		boolean continueLoop = true;

		while (continueLoop) {
			System.out.println("Please enter two numbers");
			Scanner scan = new Scanner(System.in);

			num1 = scan.nextDouble();
			num2 = scan.nextDouble();
			System.out.println("Please enter the operation +, -, *, /");
			operation = scan.next().charAt(0);
			if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
				System.out.println("Please enter valid operation");
				continue;
				
			}

			switch (operation) {
			case '+':
				results = num1 + num2;
				break;
			case '-':
				break;
			case '*':
				results = num1 * num2;
				break;
			case '/':
				results = num1 / num2;
				break;
			default:
				results = 0;
			}

			System.out.println("Results are " + results);
			System.out.println("Enter yes for more operations, no to terminate the program");

			if ("No".equalsIgnoreCase(scan.next())) {
				continueLoop = false;//or you can use break;
			}
		}
	}
}
