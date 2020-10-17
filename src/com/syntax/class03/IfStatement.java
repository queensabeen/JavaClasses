package com.syntax.class03;

public class IfStatement {

	public static void main (String [] args) {
		
		int num1=1800;
		int num2=900;
		
		System.out.println("writing my first if statement");
		
		if(num1>num2) { //if condition will evaluate the parenthesis
			System.out.println("num1 is bigger than num2");
		}
		
		System.out.println("End of if statement");
		
		System.out.println("----------------------------------------------");
		
		int temp=60;
		
		if (temp>=60) {
			System.out.println("I am going to the beach");
		}else {
			System.out.println("I will stay home");
		}
		
		System.out.println("----------------------------------------------");
		
		double expectedHours=20;
		double actualHours=8;
		
		if (actualHours>expectedHours) {
			System.out.println("You will succeed");
		}else {
			System.out.println("The course will be too hard for you");
		}
	}
}
