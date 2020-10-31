package com.syntax.class15;

public class ReplaceAll {
    public static void main(String[] args) {
        String mix="34539385Hello 56 World5745 #&%^^#$%";

        System.out.println(mix.replaceAll("[0-9]",""));//replaces all numbers from 0-9 with nothing
        System.out.println(mix.replaceAll("[a-z]",""));//will replace all lower case letters in that range
        System.out.println(mix.replaceAll("[a-z A-Z]",""));//will replace all letters in the range
        System.out.println(mix.replaceAll("[A-za-z0-9]",""));//will replace all letters and numbers in range

    }
}
