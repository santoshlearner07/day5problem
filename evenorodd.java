package com.company;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        int num;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the num : ");
        num = x.nextInt();
    if (num%2 == 0) {
        System.out.println("Given num is even :" + num);
    }else {
        System.out.println("Given num is odd :" + num );
    }
    }
}
