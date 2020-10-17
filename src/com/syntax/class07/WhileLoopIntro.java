package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		int time=15;
		
		if (time > 12) {//condition is true
			System.out.println("good day");//code executes 1 time
			
		}

		System.out.println("-----------------WHILE LOOP----------------");
		
		/*
		 * while (time > 12) { 
		 * System.out.println("good day");//infinite loop 
		 * time--; 
		 * }
		 */
		
		while (time > 12) {
			System.out.println("good day");//prints 3
			time--;
		}
		
		/*
		 * while (time > 12) { 
		 * System.out.println("good day");// will keep printing
		 * time++; 
		 * }
		 */
		
		//I want to print numbers 1-50
		System.out.println("----------------PRINTING NUMBERS 1-50-------------------");
		
		int num=1;
		
		while (num<51) {//while (num<=50)
			System.out.println(num);
			num++;
		}
		
		//I want to print numbers 10-60
		System.out.println("----------------PRINTING NUMBERS 10-60-------------------");
		
		int a=10;
				
		while (a<=60) {
			System.out.println(a);
			a++;
		}
		
		
		//I want to print numbers 100-60
		System.out.println("----------------PRINTING NUMBERS 100-60-------------------");
		
		int b=100;
		
		while (b>=60) {
			System.out.print(b+" ");
			b--;
		}
		
		//I want to print numbers 10-30 only even numbers
				System.out.println("----------------PRINTING NUMBERS 10-30 only even numbers-------------------");
		
		int even=10;
		
		while (even<=30) {
			if(even%2==0) {
				System.out.print(even+" ");	
			}
			
			even++;
		}
				
		System.out.println("-----------------------Another way--------------------------");
		
		int even2=10;
		
		while (even2<=30) {
			System.out.print(even2+" ");
			even2++;//if we keep increment here, we will get infinite loop
		}
		//c++;
		
		//I want to print numbers 100-1 only odd numbers
		System.out.println("----------------PRINTING NUMBERS 100-1 only odd numbers-------------------");
		
		int odd=100;
		
		while (odd>=1) {
			if (odd%2==1) {
				System.out.print(odd+" ");
			}
			odd--;
		}
		
		System.out.println("----------Another way------------");
		
		int odd2=99;
		
		while (odd2>0) {
		
				System.out.print(odd2+" ");
				odd2-=2;
			
		}
		
	}

}
