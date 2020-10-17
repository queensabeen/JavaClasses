package com.syntax.class04;

public class Task3 {
	public static void main (String []args) {
	
		int rate=3;
		int mtg=300000;
		
		if (rate < 4.5) {

			if (mtg > 200000) {
				System.out.println("I will take a loan");
			} else {
				System.out.println("I will pay cash");
			}

		} else {
			System.out.println("I will not buy a house");
		}
		
	}
}
