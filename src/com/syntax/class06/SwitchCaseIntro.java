package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseIntro {

	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);	
		System.out.println("Please enter a day number 1-7");
		
		int day=scan.nextInt();
		
		if (day==1) {
			System.out.println("Today is Monday, we have no class");
		} else if (day==2) {
			System.out.println("Today is Tuesday, we have Manual class");
		}else if (day==3) {
			System.out.println("Today is Wednesday, we have Manual class");
		}else if (day==4) {
			System.out.println("Today is Thursday, we have review class");
		}else if (day==5) {
			System.out.println("Today is Friday. We have no class but I have class tomorrow");
		}else if (day==6) {
			System.out.println("Today is Saturday, we have Java class");
		}else if (day==7) {
			System.out.println("Today is Sunday, we have Java class");
		}else {//any other number would not be a day of the week.
			System.out.println("This is an invalid day");
		}

		System.out.println("-------------------------SAME EXAMPLE USING SWITCH CASE---------------------------");
		String today;//String type
		
		switch (day){//int type //data type of variable must match with data type of cases
		
		case 1://int type
			today="Monday";//String type
			break;//stops from checking code after this
		case 2:
			today="Tuesday";
			break;
		case 3:
			today="Wednesday";
			break;
		case 4:
			today="Thursday";
			break;
		case 5:
			today="Friday";
			break;
		case 6:
			today="Saturday";
			break;
		case 7:
			today="Sunday";
			break;
		default://does not need break, because program knows it is a last statement in the switch block
			today="Invalid Day";
			
		
		}
		
		
	}

}
