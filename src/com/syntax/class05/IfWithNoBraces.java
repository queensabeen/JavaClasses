package com.syntax.class05;

public class IfWithNoBraces {
	public static void main(String[] args) {

		boolean isSaturday = false;

		if (isSaturday)
			System.out.println("Today is a Java class");
			System.out.println("Tomorrow I will have a Java class");		
		//without curly braces, Java will only print one line

		System.out.println("I am a code outside of if statement");

	}
}
