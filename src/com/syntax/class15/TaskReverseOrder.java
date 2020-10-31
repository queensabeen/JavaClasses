package com.syntax.class15;

import java.util.Scanner;

public class TaskReverseOrder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word;
        System.out.println("Enter word");
       word=scan.next();

       for (int i=word.length()-1; i>=0; i--){
           System.out.print(word.charAt(i));
       }

    }
}
