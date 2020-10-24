package com.syntax.class11;

public class Creating2DArrays {

	public static void main(String[] args) {
		
		//creat 2D array of food:
		//american
		//italian
		//asian
		//afghani
		//indian
		
		String [][] food= {
				{"steak", "hot dog", "cheeseburger"},
				{"pizza", "pasta", "canoli"},
				{"sushi", "ramen", "fried rice"},
				{"kebab", "manto"},
				{"biryani", "curry", "CTM"}
				
		};

		for(String [] dishes:food) {
			for (String dish:dishes) {
				System.out.println(dish+"    ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------");
		
		for (int i=0; i<food.length; i++) {
			
			for (int j=0; j<food[i].length; j++) {
				
				System.out.println(food[i][j]+"      ");
			}
			System.out.println();
		}
		
		for (int i=0; i<3; i++) {
			System.out.println(i);
		}
		
	}
}
