package com.syntax.class10;

import java.util.Scanner;

public class ArraysFromScanner {

	public static void main(String[] args) {
		// Let's ask user how many names he would like to store and then store those names
		Scanner scan=new Scanner (System.in);
		String [] names;
		int size;
		
		System.out.println("How many names would you like to store?");
		size=scan.nextInt();
		
		names =new String[size];
		
		for (int i=0; i<size; i++) {
			System.out.println("Please enter name");
			names[i]=scan.next();
		}
		
		for (int i=0; i<names.length; i++) {
			System.out.print(names[i]+" ");
		}

	}

}
