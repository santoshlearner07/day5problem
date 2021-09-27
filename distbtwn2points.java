package com.company;

import java.util.Scanner;

public class distbtwn2points {
    public static void main(String[] args) {
        int a,b,c,d;
        double dist;
        Scanner V = new Scanner(System.in);
        System.out.println("Enter first num : ");
        a = V.nextInt();
        Scanner X = new Scanner(System.in);
        System.out.println("Enter second num : ");
        b = X.nextInt();
        Scanner Y = new Scanner(System.in);
        System.out.println("Enter third num : ");
        c = Y.nextInt();
        Scanner Z = new Scanner(System.in);
        System.out.println("Enter fourth num : ");
        d = Z.nextInt();
        dist = Math.sqrt((Math.pow(c-a,2)) + (Math.pow(d-b,2)));
        System.out.println("Using Euclidean" + dist);
    }
}
