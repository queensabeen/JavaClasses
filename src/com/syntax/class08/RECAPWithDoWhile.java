package com.syntax.class08;

import java.util.Scanner;

public class RECAPWithDoWhile {

	public static void main(String[] args) {
		
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
			
			
			do {
				
				money=input.nextInt();
				if (money>waterPrice) {
					System.out.println("Too much money, enter less");
				}else if (money<waterPrice) {
					System.out.println("Please add more money");
				}
				//money=input.nextInt();
				
			}while (money!=waterPrice);
			
			System.out.println("Enjoy your water");
	}

}
