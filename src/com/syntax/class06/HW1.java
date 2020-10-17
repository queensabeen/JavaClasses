package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		/*
		 * You are working in sales and have to calculate commission for the employees;
		 * You need to ask user a sales amount and based on the amount you need to define their commission
		 * if user sold products for more than $10 but less than 100 --> commission is 10%
		 * if sales is more than 100 but less then 200 --> commission is 20%
		 * if sales is more than 200 but less then 500 --> commission is 30%
		 * if sales is more than 500 --> commission is 50%
		 * You program should print How much in commission user will get
		 */
		
		Scanner scan=new Scanner (System.in);
		int comm;
		
		
		System.out.println("How much did you make in sales?");
		int sold=scan.nextInt();
		
		if (sold>10 && sold<100) {
			comm=(sold*10)/100;
		}else if (sold>100 && sold<200) {
			comm=(sold*10)/100;
		}else if (sold>200 && sold<500) {
			comm=(sold*10)/100;
		}else {
			comm=(sold*10)/100;
		}
		
		System.out.println("Your commission is $"+comm+"!");
	}

}
