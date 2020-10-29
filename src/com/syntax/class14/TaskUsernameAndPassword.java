package com.syntax.class14;

public class TaskUsernameAndPassword {
    public static void main(String[] args) {
        String username="Sabeen";
        String password="pass123456";
        String matching="pass123456";
        String message;

        if (username.equalsIgnoreCase(null)||password.equalsIgnoreCase(null)){
            message="Username and Password can not be empty";
        }else if (password.length()<8){
            message="Password is too short";
        }else if (password.endsWith(username)){
            message="password cannot contain username";
        }else if (!(password.equalsIgnoreCase(matching))){
            message="Passwords do not match";
        }else{
            message="Your username and password has been created";
        }
        System.out.println(message);
    }
}
