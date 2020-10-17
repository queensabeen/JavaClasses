package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {
public static void main (String[]args) {
	/*
	 * I kneed to define whether number that is entered from user
	 * small number is a number between 1-10
	 * medium number is a number between 11-100
	 * large number is a number between 101-1001
	 */
	
	Scanner input;
	int number;
	
	input=new Scanner(System.in);
	System.out.println("Please enter any number");
	number=input.nextInt();
	
	if (number>0 && number<=10) {
		System.out.println("you entered a small number");
	}else if (number>10 && number<=100) {
		System.out.println("you entered a medium number");
	}else if (number>101 && number<1000) {
		System.out.println("You entered a large number");
	}
	
}
}
