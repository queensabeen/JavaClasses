package com.syntax.class16;

import java.util.Scanner;

public class TaskMethod {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.
    //Create a method that will take a number and prints whether the number is even or odd.
    //Create a method that will print whether given String is palindrome or not.
    //Create a method that will say Hello in different language based on the country that will passed when method is executed.

    public static void main(String[] args) {
        TaskParameters task=new TaskParameters();
        task.task1(5,10);
        //Create a method that will take a number and prints whether the number is even or odd.

        task.task2(9);


        //Create a method that will print whether given String is palindrome or not.

        task.isStringPalindrome("aba");
        task.isStringPalindrome("abua");
        task.isStringPalindrome("abertreba");


        //Create a method that will say Hello in different language based on the country that will passed when method is executed.

        task.task4("USA");

//        Scanner scan=new Scanner(System.in);
//        System.out.println("Please enter country");
//        task.task4(scan.next());

    }
}
