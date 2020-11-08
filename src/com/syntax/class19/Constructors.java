package com.syntax.class19;

public class Constructors {

    static int number;
    static String name;
    static char character;

    Constructors(){
        System.out.println("I will be called everytime an object of this class is created");
    }
    static void print() {
        System.out.println("Number " + number + " name " + name + " character " + character);
    }

    public static void main(String[] args) {
        Constructors constructors = new Constructors();
        //Constructors --> name of class
        //constructors --> name of the variable
        //= --> assignment
        //new --> we want an object
        //Constructors() --> initialize fields
    }
}
