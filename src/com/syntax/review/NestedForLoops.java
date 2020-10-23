package com.syntax.review;

public class NestedForLoops {

	public static void main(String[] args) {
		
		for (int i = 0; i < 2; i++) {
			System.out.println("I am the outer for loop");
			for (int j = 0; j < 2; j++) {
				System.out.println("I am the first inner for loop");
				for (int k = 0; k < 2; k++) {
					System.out.println("I am the second inner for loop");
				}
			}
		}

	}

}
