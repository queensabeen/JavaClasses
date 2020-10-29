package com.syntax.class14;

public class Laptop {

    //class of a laptop
    String make;
    String model;
    int storage;
    int RAM;
    String color;
    String processor;
    String GPU;

    //objects of the laptop
    //void means the function will not return a type
    void movie(){
        System.out.println("Playing movies ");
    }

    void browseInternet(){
        System.out.println("Browsing internet");
    }
    //asking the user to take action - video call a contact
    void makeVideoCall(String contact){
        System.out.println("Video calling to "+contact);
    }
    //laptop should return something
    public String getModel() {
        return model;
    }

    int RAM(){
        return RAM*2;
    }

    int upgradeRAM(int newRAMUnit){
        return newRAMUnit*RAM;
    }
}
