package com.syntax.class29.tasks;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        /*Create a collection of integers in which you can keep duplicates.

        Write a logic to find sum of all integers*/

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        int sum=0;
        for (Integer number:numbers
             ) {
            sum+=number;
        }

        System.out.println(sum);

    }
}
