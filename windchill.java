package com.company;

import java.util.Scanner;

public class windchill {
    public static void main(String[] args) {
        double Temp, windspeed, windchill;
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter temperature in Fahrenheit :- ");
            Temp = sc.nextDouble();
            if (Temp < 51) {
                System.out.println("Enter speed in miles per hour:- ");
            } else {
                System.out.println("Enter value less than 50 ");
                return;
            }
        }
        {
            windspeed = sc.nextDouble();
            if (windspeed > 3 && windspeed < 120) {
                System.out.println("Both values are in range ");
            } else {
                System.out.println("Enter value between 3 and 120 ");
                return;
            }
        }
        windchill = 35.74+(0.6215*Temp) + (((0.4275*Temp)-35.75)*Math.pow(windspeed,0.16));
        System.out.println("The National Weather Service defines the effective temperature to be:- " + windchill);
    }
}
