package com.syntax.class19;

public class help {
    public static void main(String[] args) {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

        int [] arr=new int[a[0].length];

        int output=0;
        for (int i=0; i%2==0; i++){
            for (int j=0; j<a[i].length; j++){
                if (a[i][j]%2==0){
                    output+=a[i][j];
                }
            }System.out.println(output);
        }

}
}
