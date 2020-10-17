package com.syntax.class03;

public class PrimitiveCasting {

	public static void main (String [] args ) {
		
		//casting - trying to change one type to another type
		double d=12/7;//widening
		System.out.println(d);
		
		double e=9;//widening
		System.out.println(e);
		
		//int i=9.99; error because value is double
		
		int i=(int) 9.99;//narrowing
		System.out.println(i);
		
		byte b=(byte)130;//narrowing
		System.out.println(b);
		
		
	}
}
