package com.syntax.class16;

public class Task2PrimeNumber {
    //Write a method to return whether given number is prime or not?

    boolean isPrime(int number){

        if(number<=1){
            return false;
        }
        boolean isPrime=true;
        for (int i=2; i<number/2; i++){ //starting from 2 because every number is divisible by 2 so we need to start checking from 2
            if (number%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
            }

}
