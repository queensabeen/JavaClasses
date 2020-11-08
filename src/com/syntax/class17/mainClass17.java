package com.syntax.class17;

import com.sun.org.apache.xpath.internal.operations.Variable;
import com.syntax.class18.Employee;

public class mainClass17 {
    public static void main(String[] args) {

        Variables variables = new Variables();
        variables.varsDemo();
        variables.varsDemo1();

        System.out.println("-------------------------------");

        Student sabeen = new Student();
        sabeen.name = "Sabeen";
        sabeen.age = 31;
        sabeen.marks = 90;
        sabeen.collegeName = "Syntax";
        Student.numberOfStudentsEnrolled++;
        sabeen.StudentsRegistered();
        sabeen.printInfo();

        Student danilo = new Student();
        danilo.name = "Danilo";
        danilo.age = 31;
        danilo.marks = 90;
        Student.numberOfStudentsEnrolled++;
        danilo.StudentsRegistered();




    }
}
