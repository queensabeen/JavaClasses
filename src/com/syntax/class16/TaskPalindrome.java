package com.syntax.class16;

public class TaskPalindrome {
    public static void main(String[] args) {
        String str="Anna";
        String reverse="";
        for (int i=str.length() - 1; i>= 0; i--){
            System.out.println(i);
            System.out.println(str.charAt(i));
            reverse=reverse+ str.charAt(i);
            System.out.println(reverse);
        }
        System.out.println(reverse);
        System.out.println("Is "+str+" palindrome? "+reverse.equalsIgnoreCase(str));

        System.out.println("--------------------------------");

        StringBuilder stringbuilder=new StringBuilder("Anna");
        System.out.println(stringbuilder.reverse());
    }
}
