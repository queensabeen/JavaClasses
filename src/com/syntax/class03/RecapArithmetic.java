package com.syntax.class03;

public class RecapArithmetic {

	public static void main(String[] args) {
	
		int num1, num2;
		
		num1=100;
		num2=200;
		
		System.out.println(num1+num2);

		int result=num1-num2;		
		System.out.println(result);
		
		int what=10+10*10;//multiplication goes first. 
		System.out.println(what);
		
		int whatnumber=(10+10)*10; //parenthesis goes first.
		System.out.println(whatnumber);
		
		double d=12.99;
		double e=2.5;
		
		double div=d/e;
		System.out.println("Division of 2 double values "+div);
		
		int a=12;
		int b=5;
		System.out.println(a/b);//because int, the output will be a whole number without remainders
		
		int result1=a/b;
		System.out.println(result1);//use double for decimals
		
		int remain=a%b;
		System.out.println("Division of 2 int values = "+remain);//both same output
		System.out.println("Modulus/remainder = "+a%b);//both same output
		
		double doubleVariable=a/b;
		System.out.println(doubleVariable);
		
		System.out.println("Remainder = "+a%b);

	}

}
