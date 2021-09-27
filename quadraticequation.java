package com.company;

import java.util.Scanner;

public class quadraticequation {
    public static void main(String[] args) {
//        double a = 2.5, b = 5, c = 3.5; for these roots are not real
        Scanner x = new Scanner(System.in);
        System.out.println("Enter 1st number");
        double a = x.nextDouble();
        Scanner y = new Scanner(System.in);
        System.out.println("Enter 2nd number");
        double b = y.nextDouble();
        Scanner z = new Scanner(System.in);
        System.out.println("Enter 3rd number");
        double c = z.nextDouble();
        double delta, root1, root2;
        delta = (b * b) - (4 * a * c);
        if (delta > 0) {
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        } else if (delta == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = %.2f", root1);
        } else {
            System.out.println("Roots are not real");
        }

    }
}
