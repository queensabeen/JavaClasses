package com.syntax.class04;

import java.util.Scanner;
class Main {
  public static void main (String []args){
    
    Scanner day=new Scanner (System.in);
    System.out.println("Is it sunny outside?");
    boolean isSunny=true;
    
    if (isSunny){
      System.out.println("It is a sunny day, I should go somewhere!");
      System.out.println("What is the temperature outside?");
      int temp=day.nextInt();
      
      if (temp>=85){
        System.out.println("I am going to the beach!");
      }else if (temp<85) {
        System.out.println("I am going to the park!");
      }
    }else {
      System.out.println("I stay home and practive Java!");
    }
  
  
}
}