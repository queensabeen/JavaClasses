package com.syntax.class19;

public class Task1 {

    //Write a program that will have a constructor:
    //one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of
    // the constructors 1 by 1.

    int age;
    int year;
    int month;
    int day;
    String name;

    Task1() {
        System.out.println("First statement. Default values : "+age + name);
    }

    Task1(int ageVal, String nameVal) {
        age=ageVal;
        name=nameVal;
        System.out.println("Second statement");
    }
}
