package com.syntax.class15;

public class TaskCombination {
    public static void main(String[] args) {
        //Create a String that should be combination of letters, numbers and special characters.
        //Find out how many alpha characters are there in the String

        String str="dfbsv SDGDFGN 6574 #&#%%";
        System.out.println(str.replaceAll("[^0-9]", ""));
        System.out.println(str.replaceAll("[^0-9]", "").length());
    }
}
