package com.syntax.class19;

import com.syntax.class18.Employee;

public class EmployeeTester {
    public static void main(String[] args) {
        Employees employee1=new Employees();
        employee1.age=200;
        employee1.name="Sabeen";
        employee1.grade='M';
        System.out.println(employee1.age);

        System.out.println("-----------another way------------");

        Employees employee2=
                new Employees(5,
                        "Iqbal",
                        'A');
        System.out.println(employee2.age);
    }
}
