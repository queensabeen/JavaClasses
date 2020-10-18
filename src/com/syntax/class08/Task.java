package com.syntax.class08;

public class Task {

	public static void main(String[] args) {
		System.out.println("Print even numbers from 20-1 (2 ways)");
		
		for (int i=20; i>=1; i-=2) {
		System.out.print(i+" ");
		}
		
		for (int i=20; i>=1; i--) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println ("Print odd numbers from 20-50 (2 ways)");
		
		for (int odd=21; odd<=50; odd+=2) {
			System.out.print(odd+" ");
		}
		
		for (int odd=20; odd>=1; odd--) {
			if (odd%2==1) {
				System.out.print(odd+" ");
			}
	}

}
}
