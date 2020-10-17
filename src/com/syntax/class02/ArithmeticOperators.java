package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String [] args) {
		
			//Arithmetic Operators: +, -, *, /, %, =
		int num1, num2;
		
		num1=10;
		num2=12;
		
		System.out.println(num1+num2);
			//numeric values add up during concatenation
		System.out.println(num1-num2);
		
		double num3=10.99;
		double num4=2.99;
		
		double mult=num3*num4;
		System.out.println(mult);
		
		double div=num3/num4;
		System.out.println(div);//3.6755852842809364
		
		System.out.println("The result of division of 2 double values = "+div);
		
		float f=10.99f;
		float f1=2.99f;
		
		System.out.println(f/f1);//3.6755853
		
			//float will round to 5-6 decimals
			//double will round to 14-15 decimals
		
		System.out.println("The result of division of 2 float values = "+f/f1);
		
		
		
	}
}

