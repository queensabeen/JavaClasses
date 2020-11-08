package com.syntax.class20;

public class Person {

    String name;
    String address;
    int age;
    String id;
    String phone;
    String SSN;
    char gender;
    char maritalStatus;
    double height;
    double weight;
    int numberOfKids;
    double salary;
    String education;

    Person(String name, int age, String phone, double salary){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.salary=salary;
        this.weight=60;
        this.height=5.4;
        System.out.println("I am the first constructor and only have 4 fields as mandatory");


    }

    Person(String name, int age, String phone, double salary, char maritalStatus, int numberOfKids){

        this(name, age, phone, salary);
        this.maritalStatus=maritalStatus;
        this.numberOfKids=numberOfKids;
        System.out.println("I am the second constructor and only have 6 fields as mandatory");
    }

    Person(String name, int age, String phone, double salary, char maritalStatus, int numberOfKids, String education){

        this(name, age, phone, salary, maritalStatus, numberOfKids);
        this.education=education;
        System.out.println("I am the third constructor and only have 7 fields as mandatory");
    }

    Person(String name, int age, String phone, double salary, char maritalStatus, int numberOfKids, String education, double height, double weight){

        this(name, age, phone, salary, maritalStatus, numberOfKids, education);
        this.height=height;
        this.weight=weight;
        System.out.println("I am the fourth constructor and only have 9 fields as mandatory");
    }

    public static void main(String[] args) {
        Person person=new Person("Sabeen", 31, "1234567", 0, 'M', 0, "SDET", 5.7, 68);

        Person person2=new Person("Sabeen", 31, "1234567", 0, 'M', 0, "SDET");

    }
}
