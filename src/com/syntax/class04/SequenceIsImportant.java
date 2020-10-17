package com.syntax.class04;

public class SequenceIsImportant {
	public static void main(String[] args) {
		
		//debug your code and analyze what is the issue!
		//do not make the mistake of putting the order incorrect
		
		boolean assign=true;
		int score=50;
		
		if (assign) {
					
			if (score>90) {
				System.out.println("Great job");
			}else if(score>70) {
				System.out.println("Study more");
			}else if(score>80) {
				System.out.println("Good job");
			}else {
				System.out.println("Good job for trying, but you must study more");
			}
			
			
		}else {
			System.out.println("Please complete the assignment");
		
		
	}
	}
}
