package com.syntax.class08;

public class ForLoopInsideAndOut {

	public static void main(String[] args) {

		int a;
		
		for (a=1; a<6; a++) {
			System.out.println("Value inside for loop "+a);
		}
		System.out.println("Value outside for loop "+a);

		System.out.println("-----------------------------------------------------------------------");
		
		int result=1;
		
		for (int i=10; i>=1; i-=2) {
			result*=i;
		}
		System.out.println(result);
	}

}
