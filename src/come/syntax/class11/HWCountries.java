package come.syntax.class11;

public class HWCountries {

	public static void main(String[] args) {
		// Create an array of countries. 
		//While retrieving all values from an array print capital for each country. (use 2 different loops).
		
		String[] countries = {"USA", "England", "Canada"};
		String[] capitals = {"Washington DC", "London", "Ottowa"};
		
		for (int i = 0; i<countries.length; i++) {
			System.out.println("The capital of "+ countries[i] +" is "+capitals[i]);
		}
		
		System.out.println("---------------------------------------------");
		
		String capital;
		for (String country:countries) {//country holds one value, countries holds the array
			
			switch (country) {
			
			case "USA":
				capital="Washington DC";
				break;
			case "England":
				capital="London";
				break;
			case "Canada":
				capital="Ottawa";
				break;
				default:
					capital="I do not know the capital";
			
			}
			System.out.println("Capital of "+country+" is "+capital);
		}

	}

}
