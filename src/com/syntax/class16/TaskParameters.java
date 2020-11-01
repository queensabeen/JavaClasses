package com.syntax.class16;

public class TaskParameters {

    //Create a method that will take 2 parameters as a numbers and prints which number is larger.
   public void task1(double num1, double num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is larger than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is larger than " + num1);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }
    //Create a method that will take a number and prints whether the number is even or odd.

    public void task2(int num1) {
        if (num1 % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }


    //Create a method that will print whether given String is palindrome or not.
    //when the characters on either side of the middle character is the same - saShSas
    public void isStringPalindrome (String string){
        int i=0;
        int j=string.length()-1;
        while(i<j){//start to middle and end to middle

            if (string.charAt(i)!=string.charAt(j)){
                System.out.println("String is not a palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("String is a palindrome");
    }


    //Create a method that will say Hello in different language based on the country that will passed when method is executed.

    static void task4 (String hello){
        String message;

        switch (hello){
            case"USA":
                System.out.println("Hello");
                break;
            case "China":
                System.out.println("Ni hao");
                break;
            case "Turkey":
                System.out.println("Merhaba");
                break;
            default:
                System.out.println("Not recognized");
        }

//        if (hello.equalsIgnoreCase("Pakistan")){
//            message="Salaam";
//        }else if (hello.equalsIgnoreCase("England")){
//            message="Hiya";
//        }else if (hello.equalsIgnoreCase("Spain")){
//            message="Hola";
//        }else{
//            message="I do not know how to say hello in this language";
//        }
//        System.out.println(message);
    }

    }
