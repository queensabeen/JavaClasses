package com.syntax.class19;

public class Task1Test {
    public static void main(String[] args) {
        Task1 taskA = new Task1();
        taskA.age = 50;
        taskA.name = "Sabeen";
        System.out.println(taskA.name);

        Task1 taskB =
                new Task1(34,
                        "Iqbal");
        System.out.println(taskB.name);
    }
}
