package com.madhusudhan;

import java.util.Arrays;

public class TheArrays {
    public static void main(String args[]){
        String[] colors = new String[] {"red", "blue", "green"};
        System.out.println(Arrays.toString(colors));

        for(String a: colors){
            System.out.println(a);
        }
    }
}
