package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		// continue - skips 1 iteration
		//I want to print numbers 1-5 except 3
		
		for (int i=1; i<=5; i++) {
			
			if (i==3) {
				continue;//skips the condition and carries on
			}
			
			System.out.println(i);
		}

		System.out.println("End of the loop");
		
		
		//I want to print numbers 1-10 except 3 and 7
		
		for (int a=1; a<=10; a++) {
			if (a==3 || a==7) {
				continue;
			}
					
				System.out.println(a);
		}
		
	}

}
