package com.syntax.class06;

import java.util.Scanner;

public class LargestNumberHW {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest of three double values using if-else..if and
		 * logical operators provided by a user (numbers must be distinct)
		 */

		Scanner scan = new Scanner(System.in);
		double num1, num2, num3, max;

		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();

		//1st way
		
		if (!(num1==num2 && num2==num3)) {
			
			if (num1 > num2 && num1 > num3) {
				max = num1;
			} else if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
			System.out.println(max);
		
		}else {
			System.out.println("Numbers are equal");
		}
		
		if (num1 > num2 && num1 > num3) {
			max = num1;
		} else if (num2 > num3) {
			max = num2;
		} else {
			max = num3;
		}

		System.out.println(max);

		double biggest;
		
		System.out.println("-------------------Comparing 2 numbers using nested if---------------");
		
		//2nd way
		
		if (num1>num2) {//if number 1 is larger than number 2
			if (num1>num3) {
				biggest=num1;
			}else {
				biggest=num3;
			}
		}else {//number 2 is larger than number 1
			if (num2>num3) {
				biggest=num2;
			}else {
				biggest=num3;
			}
		}
		
		System.out.println("The largest number is "+biggest);
		
	}

}
