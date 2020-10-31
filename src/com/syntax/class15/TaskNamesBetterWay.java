package com.syntax.class15;

import java.util.Scanner;

public class TaskNamesBetterWay {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String mom;
        String dad;
        String baby;
        String name=null;


        System.out.println("Mom's first name?");
        mom=scan.nextLine();
        System.out.println("Dad's first name?");
        dad=scan.nextLine();
        System.out.println("Boy or Girl?");
        baby=scan.next();

        if (baby.equalsIgnoreCase("boy")){
           name=dad.substring(0,dad.length()/2)+mom.substring(mom.length()/2);
        }else if (baby.equalsIgnoreCase("girl")) {
           name=mom.substring(0, mom.length() / 2) + dad.substring(dad.length() / 2);
        }else{
            name="No suggestions";
        }
        System.out.println(name);
    }
}
