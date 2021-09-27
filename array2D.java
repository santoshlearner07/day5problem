package com.company;

public class array2D {
    public static void main(String[] args) {
        int[][] xyz = {{1, 2, 3},
                {4, 5, 6}};
        System.out.print(" Array Integer:- ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.format(xyz[i][j] + " ");
            }
        }
        double[][] abc = {{1.1, 2.1, 3.1},
                {4.1, 5.1, 6.1}};
        System.out.println();
        System.out.println();
        System.out.print(" Array double:- ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.format(abc[i][j] + " ");
            }
        }
    }
}