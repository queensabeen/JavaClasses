package com.syntax.class10;

public class ArraysIntro {

	public static void main(String[] args) {
		/*
		 * Arrays in Java - able to store more than one value in the same variable
		 * 				  - containers that store data/values of the same type
		 */
		
		/*
		 * I have 5 students in the class and I need to calculate their average score;
		 * 
		 */
		
		int[] grades=new int[5];
		grades[0]=98;
		grades[1]=80;
		grades[2]=89;
		grades[3]=67;
		grades[4]=77;
		
		int average=(grades[0]+ grades[1]+ grades[2]+ grades[3]+ grades[4])/5;
		
		System.out.println("Average score of my student = "+average);
		
	}

}
