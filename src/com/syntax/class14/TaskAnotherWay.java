package com.syntax.class14;

import java.util.Scanner;

public class TaskAnotherWay {
    public static void main(String[] args) {
        String username;
        String password;
        String matching;
        String message;

        Scanner scan=new Scanner (System.in);
        System.out.println("Please enter username");
        username=scan.nextLine();
        System.out.println("Please enter password");
        password=scan.nextLine();
        System.out.println("Please confirm password");
        matching=scan.nextLine();

        if (username.isEmpty() || password.isEmpty()){
            message="Username and Password can not be empty";
        }else {
            if (password.length()<8){
                System.out.println("Password is too short");
            }else{
                if (password.contains(username)){
                    System.out.println("Password cannot contain username");
                }else{
                    if(!(password.equals(matching))){
                        System.out.println("Passwords do not match");
                    }else{
                        System.out.println("Your username and password has been created");
                    }
                }
            }
        }
    }
}
