package com.company;

public class flipcoin {
    public static void main(String[] args) {
        if (Math.random() < 0.5) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");

        }
        System.out.println(Math.random());
    }
}
