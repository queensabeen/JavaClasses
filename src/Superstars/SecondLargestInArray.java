package Superstars;

import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// Find the second largest number in the array

		int[] num1 = { 1, 5, 10, 3, 6 };
		int length = num1.length;
		Arrays.sort(num1);// {1,3,5,6,10}
		System.out.println("Second highest number is " + num1[length - 2]);

		// Find the second largest number in the array without using sort function

		int[] myArray = { 967, 66, 45, 65, 965, 32, 965, 876, 900 };
		int max = myArray[0];
		int secondmax = 0;
		
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > max) {
				secondmax = max;
				max = myArray[i];
				
			} else if (myArray[i] > secondmax && myArray[i]!=max) {
				secondmax = myArray[i];

			}

		}

		System.out.println("the largest number in array is :" + max);
		System.out.println("the 2nd largest number is :" + secondmax);

	}

}
