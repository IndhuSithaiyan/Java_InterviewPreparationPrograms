package com.program.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArraysintoSingleSortedArray {

    public static void methodByUsingJava8(int[] a, int[] b){
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));
    }

//    merge two unsorted arrays into single sorted array without duplicates
    public static void methodByUsingJava8withoutDuplicates(int[] a, int[] b){
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(c));
    }


    public static void main(String[] args) {

        int[] a = new int[] {6, 4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5};

        methodByUsingJava8(a,b);
        methodByUsingJava8withoutDuplicates(a,b);
    }
}
