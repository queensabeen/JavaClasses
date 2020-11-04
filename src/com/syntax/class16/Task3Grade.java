package com.syntax.class16;

public class Task3Grade {
    char getGrade (int marks){
        char grade;
        if (marks>=90 && marks<100){
            grade='A';
        }else if (marks>=80 && marks<90){
            grade='B';
        }else if (marks>=70 && marks<80){
            grade='C';
        }else if (marks>=50 && marks<70){
            grade='D';
        }else {
            grade='F';
        }
        return grade;
    }

    public static void main(String[] args) {
        Task3Grade task3=new Task3Grade();
        System.out.println(" task3.getGrade(90) "+ task3.getGrade(90));
        System.out.println(" task3.getGrade(101) "+ task3.getGrade(101));
    }
}
