package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumberTask {

	public static void main(String[] args) {
		
		System.out.println("--------------------------When do to use Do While-----------------------------");
		
		//play lottery where we need to enter numbers from 1-20
		//lucky number is 7
		//keep asking a user to enter a number until they enter the lucky number
		
		Scanner scan;
		int numberFromUser;
		
		int luckyNumber=7;
		
		scan=new Scanner (System.in);
		
	do {
		System.out.println("Please enter any number from 1 - 100");
		numberFromUser=scan.nextInt();
	}while (numberFromUser!=luckyNumber);//loop will continue until a false condition
	
		System.out.println("You guessed the correct number");

	}

}
