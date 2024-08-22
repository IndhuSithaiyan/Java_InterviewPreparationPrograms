package com.program.Strings;

import java.util.Arrays;

public class SortStringInAlphabeticalOrder {

    public static void main(String[] args) {

        String str = "JavaWorld";

        char arr[] = str.toCharArray();
        char temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+0; j < arr.length; j++) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.println(new String(arr));


        // method -2

        String str2 = "rock";
        char[] charArray = str2.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
        System.out.println(charArray);

    }
}
