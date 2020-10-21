package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a=10;
		
		a=20;
		
//		int student1=90;
//		int student2=97;
//		int student3=85;
//		int student4=90;
//		int student5=97;
//		int student6=85;
		
		int[] num= new int [5]; //[] --- array in order to store more than one value in the same variable
		num[0]=10;//elements
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		//to access elements from an array
		System.out.println(num[3]);
		
		System.out.println(num[1]+num[4]);
		
		//I would like to change 50 to 100
		
		num[4]=100;
		
		System.out.println(num[4]);
		
		System.out.println("--------------------------------------------------");
		
		//type of value must be the same as variable
		String[] array=new String[4];
		array[0]="Hello";
		array[1]="Hi";
		array[2]="Hey";
		array[3]="Yay";
		
		

	}

}
