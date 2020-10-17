package com.syntax.class03;

public class TemperatureCheck {

	public static void main (String [] args) {
		
		int temp=32;
		int actemp=22;
		
		if (actemp<temp) {
			System.out.println("Water will freeze if temperature "+actemp);
			
		}else {
			System.out.println("Water will not freeze with temperate "+temp);
		}
		
	}
}
