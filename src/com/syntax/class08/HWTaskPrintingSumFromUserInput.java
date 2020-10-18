package com.syntax.class08;

import java.util.Scanner;

public class HWTaskPrintingSumFromUserInput {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter 2 values");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		int even=0;
		int odd=0;
		
		for (int a=num1; a<=num2; a++) {
			if (a%2==0) {
				even+=a;
			}else {
				odd+=a;
			}
		}
		System.out.println("Even results "+even);
		System.out.println("Odd results "+odd);

	}

}
