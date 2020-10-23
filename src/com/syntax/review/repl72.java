package com.syntax.review;

public class repl72 {

	public static void main(String[] args) {
		
		System.out.println("$$$$");
		System.out.println("$  $");
		System.out.println("$  $");
		System.out.println("$$$$");
		
		System.out.println("------------Need to print the above pattern-------------");
		
		for (int i=1; i<=4; i++) {
			
			for (int j=1; j<=4; j++) {
				if (i==1 || i==4 || j==1 || j==4) {
					System.out.print("$");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
