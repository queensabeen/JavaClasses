package com.syntax.class15;

public class SubString {
    public static void main(String[] args) {
        String name="yes always will be a star";
        System.out.println(name.substring(5));//lways will be a star
        //will ignore everything before index 5

        System.out.println(name.substring(5,10));//lways
        //will only print from index 5 - 10 - before and after will be ignored.
        System.out.println(name.substring(5,10)+name.substring(15,21));//lways be a
        //will miss out the middle
    }
}
