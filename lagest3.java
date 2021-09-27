package com.company;

import java.util.Scanner;

public class lagest3 {
    public static void main(String[] args) {
        int a,b,c, d;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter first number : ");
        a = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.println("Enter second number : ");
        b = y.nextInt();
        Scanner z = new Scanner(System.in);
        System.out.println("Enter third number : ");
        c = z.nextInt();
        d = c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println("It is the largest number: " + d);
    }
}
