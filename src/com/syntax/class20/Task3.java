package com.syntax.class20;

public class Task3 {
    //Write a program  that will have 4 different access levels of constructors and create 3 objects of this class:
    // 1 - inside same class;
    // 2 - from outside the class;
    // 3 - from different class inside different package and observe result.

    String name;
    int age;
    double salary;

    public Task3(String name){ // can only make objects of class within the same class due to private modifier
        this.name=name;//or name=nameVal
        System.out.println("Private constructor is called");
    }

    Task3(int age){ // no modifier so default will be applied
        this.age=age;
        System.out.println("default constructor is called");
    }

    public Task3(double salary){ //
        this.salary=salary;
        System.out.println("public constructor is called");
    }

    public static void main(String[] args) {
        //Task3 task3=new Task3();//must create default constructor
        Task3 task1=new Task3("name");
        System.out.println(task1.name);
        System.out.println(task1.age);
        System.out.println(task1.salary);

        Task3 task2=new Task3("12");
        System.out.println(task2.name);
        System.out.println(task2.age);
        System.out.println(task2.salary);

        Task3 task3=new Task3("1000.00");
        System.out.println(task3.name);
        System.out.println(task3.age);
        System.out.println(task3.salary);

    }
}
