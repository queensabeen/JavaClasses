package com.syntax.review;

public class ForLoops {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Sum until " + i + " " + (sum = sum + 1));
		}

		System.out.println("--------------reverse order------------");
		for (int i = 10; i > 0; i--) {
			System.out.println("Sum until " + i + " " + (sum = sum + 1));
		}
	}

}
