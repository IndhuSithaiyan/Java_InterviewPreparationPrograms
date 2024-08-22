package com.program.Strings;

import java.util.Arrays;

public class RemoveGivenValueFromStringArray {

    /**
     * Write a method to remove a given value from array list having string values.
     */

    public static String[] removeStringFromArray(String[] array, String strToBeRemoved){
        int count = 0;
        for (String s: array) {
            if (!s.equals(strToBeRemoved)){
                count++;
            }
        }

        String[] newArray = new String[count];
        int index = 0;
        for (String s: array) {
            if (!s.equals(strToBeRemoved)){
                newArray[index] = s;
                index++;
            }
        }
        return newArray;
    }
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "kiwi", "grape"};
        String strToBeRemoved = "grape";
        arr = removeStringFromArray(arr, strToBeRemoved);

        for (String s: arr) {
            System.out.println(s);
        }

        String[] strArr = Arrays.stream(arr)
                .filter(s -> !s.equals(strToBeRemoved))
                .toArray(String[]::new);
        System.out.println(Arrays.toString(strArr));
    }
}
