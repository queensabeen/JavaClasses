package com.syntax.class20;

public class Student {
    // Write a Student class that has instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given student using displayInfo method.

    String name;
    String address;
    Student (String name, String address){
        this.name=name;
        this.address=address;
    }

    void displayInfo(){
        System.out.println("name "+name);
        System.out.println("address "+address);
    }

    public static void main(String[] args) {
        Student studenta=new Student("Sabeen", "123 Scotland Rd");
        Student studentb=new Student("Iqbal", "13 Rutland Rd");
    }

}
