package com.syntax.class03;

public class RelationalOperators {

	public static void main (String [] args) {
		
		int a=10;
		int b=15;
		
		System.out.println(a>b);//false
		System.out.println(a<b);//true
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		
		int x=100;
		int y=90;
		
		boolean result=x>y; //the result can only be true or false		
		System.out.println(result);
		
		result=x==y;//false
		System.out.println(result);
		
		System.out.println(x==y);//comparing numbers with a boolean result
		System.out.println(x=y);//reassigning
		
		boolean result1=x==y;
		System.out.println(result1);//true
		
		byte num=10;
		byte num1=10;
		
		boolean boo=num>num;
		System.out.println(boo);//false
		
		boo=num>=num;
		System.out.println("The result of boo = "+boo);//true
		
		
		
		
		
	}
}
