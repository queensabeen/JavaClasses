package com.syntax.class04;

public class Task2 {
	public static void main (String [] args) {
	
		boolean diploma=true;
		boolean degree=true;
		double gpa=4;
		
		if (diploma) {
			System.out.println("Congratulations");
	
		
		
		if (degree) {
			if (gpa>=3.5) {
				System.out.println("Your GPA makes you eligible for a scholarship");
			}

		}else {
			System.out.println("You should have studied harder");
		}
		}else {
			System.out.println("Please get a degree");
	}
}
}