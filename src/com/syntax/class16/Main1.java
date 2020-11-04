package com.syntax.class16;

public class Main1 {
    public static void main(String[] args) {

        Task1EmailMethod task1=new Task1EmailMethod();
        String email=Task1EmailMethod.createEmail("Sabeen","Sadiq", "gmail");
        System.out.println(email);



    }
}
