package com.company;
import java.util.Scanner;


public class vowelorconsonant {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the small char : ");
        char ch = x.next().charAt(0);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
System.out.println("It is vowel");
    }
else {System.out.println("It is Consonant");
}
    }
}
