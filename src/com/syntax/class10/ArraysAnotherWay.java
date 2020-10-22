package com.syntax.class10;

public class ArraysAnotherWay {

	public static void main(String[] args) {
		
		String[] names= {"Mike", "burju", "Jack", "Danilo", "Bryan", "Evgeniya"};
		
		//String[] name;
		//name={"Sabeen"}; we can not do it in 2 steps

		System.out.println(names[3]);
		
		//how do I know how many elements I have in the array?
		
		int size=names.length;
		System.out.println("size of names array = "+size);//burju
		
		System.out.println(names[names.length-2]);
		
		int a=2;
		System.out.println(names[a]);
		
		a+=2;
		System.out.println(names[a]);
		
		
		for (int i=0; i<names.length; i++) {
			
			System.out.println(names[i]);
		}
		
		System.out.println("--------------------------------------------------------------");
		
		for (int i=0; i <= names.length-1; i++) {
			
			System.out.println(names[i]);
		}
		
	}
}
