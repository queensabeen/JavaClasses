package com.syntax.class18;

import java.util.Set;

public class Student {
   /* Create a Class called Students
    Create three  variables  studentName , studentID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students*/

    String studentName;
    String studentID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Student student1=new Student();
        student1.studentName="Sabeen";
        student1.studentID="12345";
        Student.numberOfStudents++;

        System.out.println(student1.studentName);
        System.out.println(student1.studentID);
        System.out.println(numberOfStudents);
        System.out.println();


        Student student2=new Student();
        student2.studentName="Davit";
        student2.studentID="123345345";
        Student.numberOfStudents++;

        System.out.println(student2.studentName);
        System.out.println(student2.studentID);
        System.out.println(numberOfStudents);
        System.out.println();


        Student student3=new Student();
        student3.studentName="John";
        student3.studentID="346245";
        Student.numberOfStudents++;

        System.out.println(student3.studentName);
        System.out.println(student3.studentID);
        System.out.println(numberOfStudents);
        System.out.println();

    }
}
