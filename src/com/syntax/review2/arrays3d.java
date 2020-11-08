package com.syntax.review2;

import java.util.Scanner;

public class arrays3d {
    public static void main(String[] args) {
        String[][][] arr3d = new String[2][2][3];//floors, apartments on each floor, rooms in each apartment

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr3d.length; i++) {//first dimension - floors

            for (int j = 0; j < arr3d[i].length; j++) {//second dimension - apartments

                for (int z = 0; z < arr3d[i][j].length; z++) {//third dimension - rooms
                    System.out.println("Please enter a name : ");
                    arr3d[i][j][z] = scan.nextLine();
                }
            }
        }
        for (String[][] arr2d : arr3d) {//floors

            for (String[] arr1d : arr2d) {//apartments

                for (String value : arr1d) {//rooms
                    System.out.print(value+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
