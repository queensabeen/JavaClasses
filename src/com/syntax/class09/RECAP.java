package com.syntax.class09;

public class RECAP {

	public static void main(String[] args) {
		// when to use while vs for
		/*
		 * do while/while - when do not know how many times we want to repeat
		 * 				while - checks the condition first and then performs the action
		 * 				do while - performs the action first and then checks the condition
		 * 
		 * for - when we know how many times we want to repeat  in advance
		 * 
		 * KEYWORDS
		 * 
		 * break - skips/exits entire rest of the loop
		 * 
		 * 		boolean weekend=false;
		 * 			while(!weekend){
		 * 			System.out.println("I am working");
		 * 
		 * 				if (day>=6){
		 * 					System.out.println("I am not working!");
		 * 					break;
		 * 				}
		 * 			day++;
		 * 		}
		 * 
		 * 
		 * continue - skips/breaks current iteration of the loop
		 * 
		 * 		for (int i=1; i=<=5; i++){
		 * 			if (i==3 || i==4) {
		 * 				continue;
		 * 			}
		 * 		}
		 * 		System.out.println(i+" ");
		 * 	}
		 * 
		 * 
		 * 
		 * ---------------------------------------------NESTED LOOPS-------------------------------------------
		 * 
		 * for (int a=0; a<3; a++){   ---- outer loop
		 * 		System.out.println("Hello");
		 * 
		 * 		for (int y=0; y<3; y++){   ------- inner loop
		 * 			System.out.println("Bye");
		 * 	}
		 * }
		 * ------------------------------------------MORE EXAMPLES--------------------------------------------------
		 * 
		 * for (int b=10; b<=14; b++){
		 * 
		 * System.out.println(b);
		 * 
		 * for (int c=1; c<=4, c++) {
		 * 
		 * System.out.println(c+" "+j);
		 * }
		 * 
		 * }
		 * 
		 */

		System.out.println("------------------------print numbers from 10-99------------------------");
		
		for (int num1=1; num1<=9; num1++) {
			for (int num2=0; num2<=9; num2++) {
				System.out.println(num1+""+num2);
			}
		}
		
		System.out.println("------------------------print clock------------------------");
		
		for (int hours=0; hours<=24; hours++) {
			for (int mins=0; mins<=59; mins++) {
				if (hours<10 && mins<10) {
					System.out.println("0"+hours+":0"+mins);
				}else if (hours<10) {
					System.out.println("0"+hours+":"+mins);
				}else if (mins<10) {
					System.out.println(hours+":0"+mins);
				}else {
					System.out.println(hours+":"+mins);
				}
		}
	}
}
}