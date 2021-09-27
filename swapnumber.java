package com.company;
import java.util.Scanner;

public class swapnumber {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Enter Your Choice of number");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter first number : ");
        num1 = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.println("Enter second number : ");
        num2 = y.nextInt();
        System.out.println("AFTER SWAP your first number is : " +num2+
        " and second number is : " +num1);

    }
}
