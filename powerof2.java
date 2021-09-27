package com.company;
import java.util.Scanner;

public class powerof2 {
    public static void main(String[] args) {
        int i;
        for (i=0; i<32;  ) {
                System.out.println("Enter the number less than 32 :");
                Scanner y = new Scanner(System.in);
                i = y.nextInt();
                System.out.println(Math.pow(2, i));
        }
    }
}
