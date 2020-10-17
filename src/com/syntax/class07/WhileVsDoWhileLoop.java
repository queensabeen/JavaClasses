package com.syntax.class07;

public class WhileVsDoWhileLoop {

	public static void main(String[] args) {
		
		
		System.out.println("--------------WHILE LOOP---------------");
		
		int a=20;
		
		//first we check the condition
		while(a<15) {
			System.out.println("Hello");
			a++;
		}
		
		System.out.println("-----------------DO WHILE LOOP-------------------");
		
		int b=20;
		
		//first do something
		do {
			System.out.println("Hi");
			b++;
			//and then check condition
		}while (b<15);
		
		}

	}


