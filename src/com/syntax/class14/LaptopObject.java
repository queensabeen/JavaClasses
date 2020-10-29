package com.syntax.class14;

public class LaptopObject {
    public static void main(String[] args) {
       //creating an object
        Laptop laptop=new Laptop();
        laptop.make="Mac";
        laptop.model="Pro";
        laptop.storage=1;
        laptop.RAM=16;
        laptop.color="red";
        laptop.processor="Core i7";
        laptop.GPU="Nvidia RTZ 3090 12GB DDR6x";

        laptop.movie();
        laptop.browseInternet();
        laptop.makeVideoCall("Mum");
        String model=laptop.getModel();
        System.out.println(model);
        System.out.println(laptop.RAM());
        System.out.println(laptop.upgradeRAM(1));

    }
}
