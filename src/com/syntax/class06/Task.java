package com.syntax.class06;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		/*
		 * we are thinking of going shopping
		 * first we check if store has sales
		 * 					if no sale, no shopping
		 * 					if sale, we go shopping
		 * 								ask for the price
		 * 											if price is between 10 and 50, we give 10% off
		 * 											if price is between 50 and 100, we give 20% off
		 * 											if price is between 100 and 500, we give 40% off
		 * 											if price is >500, we give 50% off
		 * 
		 * your program should calculate final price that you will pay after discount
		 * 
		 */											
		
		Scanner scan=new Scanner (System.in);
		boolean sale=true;
		double price;
		double dis;
		double finalP;
		
		if (!sale) {
			System.out.println("I will not go shopping");
		}else {
			System.out.println("I will go shopping");
		}
		
		System.out.println("What is the price of the item?");
		price=scan.nextDouble();
		
		if (price>=10 && price<50) {
			dis=(price*10)/100;
		}else if (price>=50 && price<100) {
			dis=(price*20)/100;
		}else if (price>=100 && price<500) {
			dis=(price*40)/100;
		}else if (price>=500){
			dis=(price*50)/100;
		}else {
			dis=0;
		}
		
		finalP=price-dis;
		System.out.println("Your product price is $"+price+" and your discount will be $"+dis+" . Your total will be $"+finalP);
	}
}
