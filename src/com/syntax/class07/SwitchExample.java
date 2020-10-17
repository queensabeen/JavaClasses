package com.syntax.class07;

public class SwitchExample {

	public static void main(String[] args) {
		
		String month = "January";
		
		
		//if month is December to February ==> winter
		//if month is March to May ==> spring
		
		switch (month) {
		

		case "December":
		case "January":
		case "February":
			System.out.println("Winter");
			break;
			
		case "March":
		case "April":
		case "May":
			System.out.println("Spring");
			break;
			
		
		}

	}

}
