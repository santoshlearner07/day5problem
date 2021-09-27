package com.company;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        int year ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        year = sc.nextInt();
        if (year == 0) {
            System.out.println("Leap year does not exist ");
            System.out.println("ENTER FOUR DIGIT NUMBER");
        }
        else if (year%4 == 0 && year >= 400)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }

    }
}
