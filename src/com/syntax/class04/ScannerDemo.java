package com.syntax.class04;

//shortcut to import=Ctrl+Shift+o
import java.util.Scanner;

public class ScannerDemo {
	public static void main (String[]args) {
	
		int num=80;
		String str="I am a String";
		
		Scanner scan=new Scanner(System.in);//enables input to the console
		//I am adding a message to the user
		System.out.println("Please enter any text");
		
		String value=scan.nextLine();//waits for your input and once you provide input, hit Enter		
		System.out.println("I captured value = "+value);
		
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		System.out.println("Nice to meet you, "+name);
	
	}
}
