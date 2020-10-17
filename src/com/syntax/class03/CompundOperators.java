package com.syntax.class03;

public class CompundOperators {

	public static void main(String[] args) {
		
		int num=100;
		num=num+10; 
		System.out.println(num);
		
		num=num+200;
		System.out.println(num);
		
		//Compound Operators
		
		int myNumber=100;
		myNumber+=10;//add 10 and reassign back
		System.out.println(myNumber);
		
		myNumber+=200;//310
		System.out.println(myNumber);
		
		myNumber-=100;//210
		System.out.println(myNumber);
		
		myNumber/=10;//21
		System.out.println(myNumber);
		
		myNumber*=1000;//21000
		System.out.println(myNumber);
		
		myNumber%=100;//0
		System.out.println(myNumber);
		
		
		
	}
}
