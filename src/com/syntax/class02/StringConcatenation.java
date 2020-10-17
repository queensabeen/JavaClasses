package com.syntax.class02;

public class StringConcatenation {

	public static void main(String[] args) {

		String name = "Saber";

			// I would like to say: My name is Saber

		System.out.println("My name is " + name);

		String lastName = "Sadiq";

			// I would like to print name and last name

		System.out.println(name + " " + lastName);

			// To add the space, add +" "

		String city = "New York";

			// Want to say Saber lives in New York

		System.out.println(name + " lives in " + city);

		char grade = 'B';
			// Saber is B student

		System.out.println(name + " is " + grade + " student.");

		int age = 21;
			// Saber is 21 years old.

		System.out.println(name + " is " + age + " years old.");
			/*
			 * to concatenate (attach) ANY value (char, int, String, double, etc) to a
			 * String, we use + (String concatenation operator)
			 */

		int date = 27;
		String month = "September";

			// say 27 September

		System.out.println(date + " " + month);

		String state = "CT";
		String anotherState = "CT ";
			// above Strings are not the same
			// state has 2 characters and anotherState has 3 characters.

		System.out.println(name + " is from " + anotherState + "and England.");

	}
}
