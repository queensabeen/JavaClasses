package Superstars;

import java.util.Arrays;

public class MaxAndMinArray {

	public static void main(String[] args) {
		// max and minimum number from array

		int[] myArray = { 66, 45, 65, 32, 876, 900 };

		int max = myArray[0];
		int min = myArray[0];

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > max) {
				max = myArray[i];
			}
			if (myArray[i] < min) {
				min = myArray[i];
			}
		}
		System.out.println("the largest number in array is :" + max);
		System.out.println("the smallest number in array is :" + min);
		
		Arrays.sort(myArray);
		System.out.println("Min number "+myArray[0]);
		System.out.println("Max number "+myArray[myArray.length-1]);

	}

}
