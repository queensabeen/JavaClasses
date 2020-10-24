package com.syntax.class11;

public class TaskCars {

	public static void main(String[] args) {
//		Create 2D array of cars : american, german, korean, italian. And print all values from a 2D array

		String[][] cars = {

				{ "Ford", "Jeep", "Escalade" }, { "VW", "Audi", "BMW" }, { "Hyundai", "Kia", "Daewoo" },
				{ "Maserati", "Lambo", "Alfa" }

		};

		for (int i = 0; i < cars.length; i++) {

			for (int american = 0; american < cars[i].length; american++) {

				String car = cars[i][american];
				System.out.println(car + "    ");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("----------------------------Another way---------------------------");

		
		
		
		
		for (String[] carArray : cars) {
			for (String car : carArray) {
				System.out.println(car + "     ");
			}
			System.out.println();
		}

	}

}
