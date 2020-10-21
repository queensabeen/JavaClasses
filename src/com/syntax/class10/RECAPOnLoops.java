package com.syntax.class10;

public class RECAPOnLoops {

	public static void main(String[] args) {
		
	//nested loops - loop inside another loop
		
		boolean condition=true;
		
		  while (condition){
		  		System.out.println("I am while loop");
		  
		  			for (int i=1; i<8; i++){
		  				System.out.println("I am for loop");
		  		}
		  	}
		 
		  System.out.println("-----------------------------------------------------------------------");
		  
		  for (int i=1; i<=3; i++) {
			  System.out.println("I am for loop");
			  
			  while (condition) {
				  System.out.println("I am while loop");
			  }
		  }
		

	}
}
