package com.syntax.class09;

public class PrintingPatternsBestWay {

	public static void main(String[] args) {

		for (int r=1; r<=4; r++) {
			for (int c=1; c<=6; c++) {
				System.out.print("*");
			}System.out.println();
		}

		System.out.println("-----------------------------------------------------------------------------");
		
		for (int row=1; row<=6; row++) {
			for (int col=1; col<=12; col++) {
				System.out.print("*");
			}System.out.println();
		}
		
		System.out.println("-----------------------------------------------------------------------------");
		
		for (int row=1; row<=4; row++) {
			for (int col=1; col<2; col++) {
				System.out.print("12345");
			}System.out.println();
		}
		
		for (int row=1; row<=7; row++) {
			for (int col=1; col<=8; col++) {
				System.out.print(row);
			}System.out.println();
		}
		
		
		System.out.println("-----------------------------------------------------------------------------");
		
		
		for (int row=6; row>=1; row--) {
			for (int col=7; col>=1; col--) {
				System.out.print(col);
			}System.out.println();
		}
		
	}

}
