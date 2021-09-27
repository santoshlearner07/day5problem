package com.company;

import java.util.Scanner;
class harmonic
{
    public static void main(String arg[])
    {
        double n,i;
        double sum=0;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter a number");
        n= x.nextDouble();
        for( i=1;i<=n;i++)
        {
            sum=sum+(1/i);
        }
        System.out.println("Harmonic value = "+sum);
    }
}


