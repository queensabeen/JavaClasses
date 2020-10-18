package com.syntax.class08;

public class TaskDivisibleBy3 {

	public static void main(String[] args) {
		
		for (int a=1; a<=50; a++) {
			if (a%3==0) {
				continue;
			}
			System.out.println(a);
		}
		
	}

}
