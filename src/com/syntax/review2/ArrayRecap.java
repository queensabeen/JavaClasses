package com.syntax.review2;

public class ArrayRecap {
    public static void main(String[] args) {

        //Array is a container --> size fixed and data type must be same

        //1. declare and initialize at the same time
        int[] intArr= {3,5,7,1,15};

        //2. declare first and then assign values
        int[][] intArr1=new int[2][3];

        intArr1[0][0]=23;
        intArr1[0][1]=12;
        intArr1[0][2]=23;

        intArr1[1][0]=5;
        intArr1[1][1]=-6;
        intArr1[1][2]=3;

        int sum=0;

        //loop for 2D array to find the sum of all values in the array

        for (int i=0; i<intArr1.length; i++){//returns from first row

            for(int j=0; j<intArr1[i].length; j++){//returns second row
    //            sum=sum+intArr1[i][j];

                sum+=intArr1[i][j];
            }
        }
        System.out.print(sum+" ");
        System.out.println();

        System.out.println("---------Advanced Loop--------------");

        for (int[] row: intArr1){
            for (int value:row){
                System.out.print(value+"   ");
            }
            System.out.println();
        }
    }
}
