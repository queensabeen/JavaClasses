package com.syntax.class19;

public class StudentTester {
    public static void main(String[] args) {
        Students student1=new Students("Sabeen", 90, 89, 98);
        student1.printGradeAverage();
        Students student2=new Students("Sadiq", 89,79,57);
        student2.printGradeAverage();
        Students student3=new Students("Iqbal", 68,98,68);
        student3.printGradeAverage();
        Students student4=new Students("Jane", 67,97,45);
        student4.printGradeAverage();
        Students student5=new Students("Zaynab",90,100,99);
        student5.printGradeAverage();
    }
}
