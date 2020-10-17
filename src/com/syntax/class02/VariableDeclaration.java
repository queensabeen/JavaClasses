package com.syntax.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		//1 way to create a variable
		
			//create variable = assigning value
			//declare a variable = initializing
				double $num=12.99;
		
		//2 way to create a variable
			//declare a variable
			//initialize or assign value
			
				int myBox;//we declare variable only once 
		
				myBox=135; //assigning value
			System.out.println(myBox);
		
				myBox=155; //value can be reassigned
			System.out.println(myBox);
		
		//3 way to create a variable
				int num1, num2, num3; //3 values can be declared in one type
				num1=10;
				num2=20;
				num3=30;
				
			System.out.println(num1);		
		
			char char1='C';
			char char2='D';
			
			char char3=char1;
			System.out.println(char3); //Right to the left
		
	}

}
