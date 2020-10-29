package com.syntax.class14;

public class isEmptyMethod {
    public static void main(String[] args) {
        String name="Mujtaba";//false
        System.out.println(name.isEmpty());//converts String to boolean. True if length is 0 otherwise, false
        name="";//true
        System.out.println(name.isEmpty());
    }
}
