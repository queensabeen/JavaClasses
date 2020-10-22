package com.syntax.class10;

public class TaskCars {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. 
		//Print all values from the array.

		String[] cars= {"VW", "Audi", "Toyota", "Honda", "BMW", "Tesla"};
		
		for(int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
		System.out.println();
		System.out.println("-------getting values from array using enhanced for loop-------------");
		
		/*
		 * for (: name of the array
		 */
		for (String car:cars) {
			System.out.print(car+" ");
		}
		System.out.println("-------getting values from array using enhanced for loop-------------");
		
		int[]numbers= {10, 10, 90, 600, 89};
		
		for (int num:numbers) {
			System.out.println(num);
		}
		
		boolean[]arrayOfBoolean= {true, true, false, true};
		
		for (boolean boo:arrayOfBoolean) {
			System.out.println(boo);
		}
		
	}
}
