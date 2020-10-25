package Superstars;

public class CountriesArray {

	public static void main(String[] args) {
//		Create an array of countries: north america countries, south america countries, europe countries, asian countries, african countries. 
//		Then print all values from that array using 2 different loops and calculate how many total countries been stored.
		
		int sum=0;
		String [][] countries = {
				{"USA", "Canada"},
				{"Brazil", "Peru"},
				{"Germany", "Italy"},
				{"Pakistan", "Japan"},
				{"Egypt", "Morocco"}
		};
		
		
		for (String[] countryA:countries) {
			for (String print:countryA) {
				System.out.println("Second way to print "+print);
				sum++;
			}System.out.println();
			
		}System.out.println("Amount of countries in array ="+sum);
		
				System.out.println("------SECOND WAY---------");
		
		for (int i=0; i<countries.length; i++) {
			for (int country=0; country<countries[i].length; country++) {
				String output=countries[i][country];
				System.out.println("First way to print "+output);
				
				sum=countries.length*countries[i].length;
				
			}System.out.println();
		}System.out.println("Amount of countries in array ="+sum);


	
		
	}

}
