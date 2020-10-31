package com.syntax.class15;

import java.util.Scanner;

public class TaskOddCharacters {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        String name;
        System.out.println("Enter name");
        name=scan.nextLine();

        if (!name.isEmpty()){
            if (name.length()%2!=0 && name.length()>=3){
                System.out.println(name.charAt(name.length()/2));
            }else{
                System.out.println("even characters");
            }
        }else{
            System.out.println("empty");
        }
    }
}
