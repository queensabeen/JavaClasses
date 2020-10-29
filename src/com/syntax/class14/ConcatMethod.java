package com.syntax.class14;

public class ConcatMethod {
    public static void main(String[] args) {
        String first="Ebrar";
        String last=" Gur";
        String name="Burju Kaya";
        String name2=null;
       //String completeName= first.concat(name2); will not be able to print name 2 in concat
        String completeName=first.concat(last);

        System.out.println(completeName);
        System.out.println(first+last+" "+name+name2);

    }
}
