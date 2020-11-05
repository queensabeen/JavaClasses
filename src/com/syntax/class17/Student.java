package com.syntax.class17;

public class Student {

    String name;
    int age;
    double marks;
    String collegeName;
    static int numberOfStudentsEnrolled;

    public void printInfo() {
        System.out.println("Name " + name + " Age " + age + " Marks " + marks);
    }

    public void printMarks() {
        System.out.println("Marks " + marks);
    }

    public void StudentsRegistered() {
        System.out.println("Total number of students enrolled " + numberOfStudentsEnrolled);
    }
}
