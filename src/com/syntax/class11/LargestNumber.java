package com.syntax.class11;

public class LargestNumber {

	public static void main(String[] args) {

		// find the largest number in the array

		int[] array = { 20, 40, -1, 58, 102, 0, 83, 56 };
		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("The largest number from the array is "+max);

	}

}
