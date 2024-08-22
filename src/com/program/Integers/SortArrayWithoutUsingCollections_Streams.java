package com.program.Integers;

import java.util.Arrays;

public class SortArrayWithoutUsingCollections_Streams {
        public static void main(String[] args) {
            int[] arr = {12, 35, 67, 89, 18};
            bubbleSort(arr);
            System.out.println("Sorted array:");

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        private static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j + 1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

}
