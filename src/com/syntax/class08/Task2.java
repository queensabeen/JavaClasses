package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Calculate sum of even and odd numbers from range 1-50

		int even = 0;
		int odd = 0;

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
		}
		System.out.println("Odd results " + odd);
		System.out.println("Even results " + even);

		// I want to create a multiplication table 10

		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter which number you want multiplication for");
		
		int num1 = scan.nextInt();//whichever number you want the multiplication for
		int mult;
		
		for (int a=1; a<=10; a++) {
			
			mult=num1*a;
			System.out.println(num1+" x "+a+" = "+mult);
			
		}

	}

}
