package com.program.Integers;

import java.util.Arrays;
import java.util.List;

public class ReverseAArrayList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

        System.out.println("Original ArrayList: " + list);
        reverseArrayList(list);
        System.out.println("Reversed ArrayList: " + list);
    }

    private static void reverseArrayList(List<Integer> list) {
        int start = 0;
        int end = list.size() - 1;
        while (start < end){
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
    }
}
