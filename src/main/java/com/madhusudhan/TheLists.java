package com.madhusudhan;

import javax.management.ListenerNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheLists {
    public static void main(String args[]){
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("Green"));

        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
