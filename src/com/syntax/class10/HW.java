package com.syntax.class10;

import java.util.Scanner;

public class HW {
    public static void main (String[]args) {

        Scanner scan = new Scanner(System.in);

        int[] input = new int[5];
        int num;


        for (int i = 0; i < 5; i++) {
            input[i] = scan.nextInt();
        }
        for (int i = 5; i > 0; i--) {
            System.out.print(input[i]);
        }
    }
}
