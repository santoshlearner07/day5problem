package com.company;
import java.util.Scanner;

public class quotientandremainder {
    public static void main(String[] args) {
        float Q, R;
        float dividend;
        float divisor;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the Dividend : ");
        dividend = x.nextFloat();
        Scanner y = new Scanner(System.in);
        System.out.println("Enter the Divisor : ");
        divisor = y.nextFloat();
        Q = (dividend/divisor);
        R = (dividend % divisor);
        System.out.println("Quotient is " +Q);
        System.out.println("Remainder is " +R);
    }
}
