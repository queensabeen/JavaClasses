package com.syntax.class13;

public class smartphone {
    String make;
    String color;
    int megapixels;
    String contacts;
    String text;


    void game(){
        System.out.println("opens game app");
    }

    void call(String contacts){
        System.out.println("calling "+contacts);
    }
    void text(){
        System.out.println("sends text "+text);
    }
}
