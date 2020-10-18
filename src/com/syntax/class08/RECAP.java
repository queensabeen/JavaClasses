package com.syntax.class08;

import java.util.Scanner;

public class RECAP {

	public static void main(String[] args) {
	
	//	int a=1;
		
	//	while (a<=5) {
	//		code;
	//		a++; 2,3,4,5,6
	//	}
		
		/*
		 * ask user to pay for water
		 * water price is 5
		 * once user enter money, then we need to tell user if we need more or less money
		 * once user gives us exact 5, then say enjoy your water!
		 */
		
		Scanner input;
		int money;
		int waterPrice=5;
		
		input=new Scanner(System.in);
		System.out.println("Please pay for your water!");
		money=input.nextInt();
		
		while (money!=waterPrice) {
			if (money>waterPrice) {
				System.out.println("Too much money, enter less");
			}else {
				System.out.println("Please add more money");
			}
			money=input.nextInt();
		}
		
		System.out.println("Enjoy your water");

	}
}
