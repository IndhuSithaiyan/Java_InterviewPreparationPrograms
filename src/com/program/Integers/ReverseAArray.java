package com.program.Integers;

import java.util.Arrays;

public class ReverseAArray {

    public static void reverseArray(int[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex < endIndex) {
            // Swap the values
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;

            // Move indices towards the center
            startIndex++;
            endIndex--;
        }

        System.out.println(Arrays.toString(array));
    }

    static void reverseCharArray(){

        char arr[] = {'I', 'N', 'D', 'H', 'U'};
        int i = 0;
        int j = arr.length -1;
        char temp;

        while (j > i) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int array[] = {14,12,3,4,32,1,3,7};
        reverseArray(array);
        System.out.println("Reversed array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        reverseCharArray();
    }
}
