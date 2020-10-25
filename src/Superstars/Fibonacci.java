package Superstars;

public class Fibonacci {

	public static void main(String[] args) {
		//Write a Java Program to print the first 10 numbers of Fibonacci series
		
		int a=0, b=1;
		
		for (int i=1; i<=10; i++) {
			System.out.println(a+" ");

			int c=a+b;
			a=b;
			b=c;
		}
	}

}
