package com.syntax.class04;

public class NestedIf {
	public static void main (String [] args) {
		
		/*
		 * variable for allergy - yes or no
		 * 
		 * if allergy is yes-->
		 * 							will check if pet allergy
		 * 										if peanut allergy
		 * 										if pollen allergy
		 * if no allergy, you are lucky!
		 */
		
		boolean allergy=true;		
		boolean petAllergy=true;		
		boolean peanutAllergy=true;		
		boolean pollenAllergy=false;
		
		if (allergy) {
			System.out.println("Let's do further check");
			
			if (petAllergy) {
				System.out.println("Please no home pets");
			}else {
				System.out.println("That is good, you do not have pet allergies");
			}
				
				
			}else {
				System.out.println("You are lucky!");
			}
			
			
			System.out.println("---------------EXAMPLE 2-------------------");
			
		/*
		 * if today is Friday, we will watch a movie but would like to check the date
		 * 			if date is 13th, I will watch a scary movie
		 * 			if not 13th, I will watch any movie
		 * if no Friday, then I will study
		 * 
		 */
			
		boolean isFriday=true;
		int date=4;
		
		if (isFriday) {
			System.out.println("Today is Friday so I will watch a movie.");
			
			if (date==13) {
				System.out.println("Today I will watch a scary movie.");
			}else {
				System.out.println("I will watch any movie");
			}
		}else {
			System.out.println("Today is not Friday, I will study.");
		}
		
		System.out.println("-------EXAMPLE 3------------------------------");
		
		/*
		 * check if assignment is completed
		 * if assignment is completed:
		 * 					-if score >90 --> great job
		 * 					-if score >80 --> good job
		 * 					-if score >70 --> study more
		 */
		
		boolean assign=true;
		int score=50;
		
		if (assign) {
					
			if (score>90) {
				System.out.println("Great job");
			}else if(score>80) {
				System.out.println("Good job");
			}else if(score>70) {
				System.out.println("Study more");
			}else {
				System.out.println("Good job for trying, but you must study more");
			}
			
			
		}else {
			System.out.println("Please complete the assignment");
		}
		
		
	}
}
