package com.syntax.class18;

import java.lang.reflect.Array;

public class TaskAcceptArray {
    /*Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.*/
    public static void main(String[] args) {

        int[] array = {3, 7, 5, 2, 8};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}

