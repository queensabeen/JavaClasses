package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo2 {
	public static void main (String []args) {
	
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter boolean value for rain");
		
		boolean rain=input.nextBoolean();//waiting for your input and hit Enter once done
		
		if (rain) {
		System.out.println("Please take an umbrella");
		
	}else {
		System.out.println("It is nice weather, go for a walk");
	}
		
		System.out.println("--------------INTEGAR VALAUE-----------");
		System.out.println("Please enter your name");
		
		String name=input.next();
		
		
		System.out.println("Please enter your age");
		
		int age=input.nextInt();
		
		System.out.println("Your name is "+name+" and you are "+age+" years old");
}
}
