package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {

		/*
		 * Lets ask a tester on which browser they would like to execute a program
		 */
		
		Scanner scan;
		String browser;
		String message;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter the browser");
		browser=scan.nextLine();
		
		//any time there are multiple choices, use switch
		
		switch(browser.toLowerCase()) {
		
		case "safari":
			message="Your code will be executed on Safari browser";
			break;
		case "chrome":
			message="Your code will be executed on Chrome browser";
			break;
		case "firefox":
			message="Your code will be executed on firefox browser";
			break;
		default:
			message="Entered browser is not supported";		
		}
		System.out.println(message);
		
		//Switch case cannot use relational or logival operators
		//switch cannot work with double, float, long, boolean
		
		/*float f=10.99f;
		 * boolean b=true;

		switch (f) {//Cannot switch on a value of type long
		*/
		
		
		
		}
		
	}
