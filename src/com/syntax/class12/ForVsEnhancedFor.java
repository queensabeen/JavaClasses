package com.syntax.class12;

public class ForVsEnhancedFor {

	public static void main(String[] args) {
		
		int[] num= {10, 20, 30, 1};
		
		for (int i=num.length-1; i>=0; i--) {//num.length=4 because there are 4 elements
			System.out.print(num[i]+" ");
		}
		//we cannot loop backward using enhanced for loop
		//it starts from the beginning of the loop
	}

}
