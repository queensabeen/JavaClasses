package com.syntax.class15;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Hello");
        stringBuilder.append("world");
        System.out.println(stringBuilder);

        System.out.println();

        String string="Hello";
        string.concat("world");
        System.out.println(string);

    }
}
