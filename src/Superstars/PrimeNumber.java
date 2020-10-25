package Superstars;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=1;
		boolean isPrime=false;
		
		if (num>1) {
		for (int i=2; i<num; i++) {
			//condition for non prime number
			if(num%i==0) {
				isPrime=true;
				break;
			}
		}
		}else {
			isPrime=true;
		}
		
		if(!isPrime) {
			System.out.println(num+" is Prime");
		}else {
			System.out.println(num+" is not Prime");
		}
		
	
	}
}
