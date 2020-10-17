package com.syntax.class02;

public class ArithmeticPractice {

	public static void main (String [] args) {
		double num1=3.5;
		double num2=5.3;
		
		double mult=num1*num2;
		double div=num1/num2;
		double sub=num1-num2;
		double add=num1+num2;
		
		System.out.println("The multiplication of 2 numbers "+num1+" and "+num2+" is equal to "+mult);
		System.out.println("The division of 2 numbers "+num1+" and "+num2+" is equal to "+div);
		System.out.println("The subtraction of 2 numbers "+num1+" and "+num2+" is equal to "+sub);
		System.out.println("The addition of 2 numbers "+num1+" and "+num2+" is equal to "+add);
		
		double val=3.9;
		double squared=val*val;
		
		System.out.println("The square of the "+val+" is "+squared);
		
		double width=5;
		double height=8;
		
		double per=(width*2)+(height*2);
		double area=width*height;
		
		System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+per+" and the area is "+area);
		
	}
}
