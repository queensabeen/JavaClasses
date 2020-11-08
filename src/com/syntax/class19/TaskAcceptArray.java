package com.syntax.class19;

import java.lang.reflect.Array;

public class TaskAcceptArray {
    /*Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visible only within same package and accessible by creating an instance of the class.*/


    //need to create instance class
    double sumArray(double []array){

        double sum=0;
        for (int i=0; i<array.length; i++){
            sum=sum+array[i];
        }
        return sum;
    }

    /*

    void main(String[] args) {

        int[] array = {3, 7, 5, 2, 8};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);*/

    }


