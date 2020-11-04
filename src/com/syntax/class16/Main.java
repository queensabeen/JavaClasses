package com.syntax.class16;

public class Main {
    public static void main(String[] args) {
        //able to access methods from VoidMethod class
        VoidMethod voidMethods = new VoidMethod();
        voidMethods.print();
        //System.out.println("Hi Everyone");
        //this will be copied from the VoidMethod class

        VoidMethod.print("Aladdin");


    }

}
