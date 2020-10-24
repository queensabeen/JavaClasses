package come.syntax.class11;

public class HWAnimals {

	public static void main(String[] args) {
		//Create an array of animals and store 6 elements into it. 
		//Using 2 different loops print all elements from the array.

		String[] animals= {"Lions", "Tiger", "Bear", "Gorilla", "Cheetah", "Monkey"};
		
		for (int i=1; i<animals.length; i++) {
			System.out.print(animals[i]+" ");
		}
		
		System.out.println();
		System.out.println("-------------------------------------------");
		
		for (String anml_name :animals) {
			System.out.print(anml_name + " ");
		}
		
	}

}
