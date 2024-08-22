package com.program.problemsolving;

import java.util.*;

public class Test {

    public int maxValueNegative(int[] nums){
        int maxValue = Integer.MIN_VALUE;
        System.out.println(maxValue);
        Set<Integer> i = new HashSet<>();
        for (int n: nums){
            i.add(n);
        }
        System.out.println(i);
        for (int a: i) {
            System.out.println(-a);
            System.out.println(a);
            if (i.contains(-a)){
                maxValue = Math.max(maxValue, a);
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int arr[] = {1,-1,-4,4,-5,3,10};
        Test test = new Test();
        System.out.println(test.maxValueNegative(arr));



    }
}
