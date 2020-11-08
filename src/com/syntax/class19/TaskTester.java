package com.syntax.class19;

public class TaskTester {

    //TaskAcceptArray TaskAccept=new TaskAcceptArray();//instance method becuase it is not in a method

    public static void main(String[] args) {
        TaskAcceptArray TaskAccept=new TaskAcceptArray();
        double[] arr={10.2,3,45};

        System.out.println(TaskAccept.sumArray(arr));
    }

}
