package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		
		
		for (int i=1; i<=3; i++) {
			for (int y=1; y<=3; y++) {
				System.out.println("inner loop");
			}
			System.out.println("outer loop");
		}

	}

}
