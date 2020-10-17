package com.syntax.class07;

public class WhileMoreExample {

	public static void main(String[] args) {
		
		String day= "Saturday";
		
		if (day.equals("Saturday")) {
			System.out.println("My favorite Java class");//print 1 time
		}

//		while (day.equals("Saturday")) {
//			System.out.println("My favorite Java class");//print infinitely
		//if you add day="Sunday"; it will stop printing infinitely
//		}
		
		System.out.println("-------------------------------------------");
		boolean isItBreakTime=false;
		
		if(isItBreakTime) {
			System.out.println("I will get tea");//print 1 time
		}
		
		while (isItBreakTime) {
			System.out.println("I will get tea");//print infinitely
			isItBreakTime=false;
		}
	}

}
