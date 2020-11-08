package com.syntax.class19;

public class Employees {
    int age;
    String name;
    char grade;
    Employees(){
        System.out.println("Called every time");
    }
    Employees(int ageValue, String nameValue, char characterValue){
        System.out.println("initializing");

        if (ageValue > 60 || ageValue<18){
            System.out.println("you should wait to retire or grow up");
        }else{
            age=ageValue;
            name=nameValue;
            grade=characterValue;
        }
    }
    void print(){
        System.out.println("Number " + age + " name " + name + " character " + grade);
    }
}
