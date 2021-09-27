package com.company;

import java.util.Arrays;

public class sumof3num {
    public static void main(String[] args) {
        int [] X = {1,2,-3,4,-1};
//        int i = X.length ;
//        String f = Arrays.toString(X);
        for (int i = 0; i < X.length; i++) {
            for (int j  = i+1; j< X.length; j++) {
                for (int k =j+1; k< X.length; k++) {
                    if (X[i] + X[j] + X[k] == 0) {
                        System.out.println("Numbers:" +X[i] + "," + X[j] + "," +X[k]);
                    }
                }
            }
        }
    }
}
