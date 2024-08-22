package com.program.Integers;
import java.util.*;

public class AddElementsToTarget {

        public static void main(String[] args) {
            int[] arr = {2, 3, 4, 5, 1, 4, 5, 1, 7, 6};
            int target = 8;
            findPairs(arr, target);

            System.out.println("--------------");

//            Sample Input 2
            int[] arr1 = {0, -1, 2, -3, 1, 3, 4};
            int target1 = 1;
            findPairs(arr1, target1);

        }

        public static void findPairs(int[] arr, int target) {
            Set<Integer> set = new HashSet<>();
            for (int num : arr) {
                int complement = target - num;
                if (set.contains(complement)) {
                    System.out.println("(" + complement + ", " + num + ")");
                }
//                set.add(num);
            }
            System.out.println(set);
        }

}
