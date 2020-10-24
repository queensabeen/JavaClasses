package com.syntax.class11;

public class AccessingAllValuesFrom2DArrays {

	public static void main(String[] args) {

//		new char[how many rows ^v][how many columns <>]
		char[][] $array = new char[3][4]; // can do _ instead of $

		// add values to the first row
		$array[0][0] = 'A';
		$array[0][1] = 'B';
		$array[0][2] = 'C';
		$array[0][3] = 'D';

		// 2nd row
		$array[1][0] = 'W';
		$array[1][1] = 'X';
		$array[1][2] = 'Y';
		$array[1][3] = 'Z';

		// 3rd row

		$array[2][0] = 'Q';
		$array[2][1] = 'W';
		$array[2][2] = 'B';
		$array[2][3] = 'R';

		System.out.println($array.length);

		for (int row = 0; row < $array.length; row++) {// loops through rows
			for (int col = 0; col < $array[row].length; col++) {
				System.out.print($array[row][col]+" ");
			}
			System.out.println();

		}
		
		System.out.println("---------------------------------------------------------------");
		
		int[][] array= {
				
				{10, 20, 30},
				{49, 50, 20},
				{49, 69,39}
								};
		
		for(int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}System.out.println();
			
		}

	}

}
