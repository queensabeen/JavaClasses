package com.syntax.class08;

import java.util.Scanner;

public class TaskInputFromUserChange {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		String item;
		double priceItem;
		double moneyIn;
		
		System.out.println("Please enter item");
		item=scan.nextLine();
		
		System.out.println("Please enter price of item");
		priceItem=scan.nextDouble();
		
		System.out.println("Please enter money");
		moneyIn=scan.nextDouble();
		
		while (moneyIn!=priceItem) {
			if (moneyIn>priceItem) {
				System.out.println("Your change is $"+(moneyIn-priceItem));
				moneyIn=scan.nextDouble();
				break;
			}else if (moneyIn<priceItem) {
				System.out.println("Please enter $"+(priceItem-moneyIn));
				moneyIn=scan.nextDouble();
			}
			
		}
		System.out.println("Thank you for shopping!");
		
		

	}

}
