package com.interviewQues.problems;

import java.util.Arrays;

public class ReverseAArray {

    public static void main(String[] args) {
        int array[] = {14,12,3,4,32,1,3,7};
        System.out.println("Reversed int array:");
        reverseIntArray(array);
        System.out.println("Reversed char array:");
        reverseCharArray();
    }

    public static void reverseIntArray(int[] array) {
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

    public static void reverseCharArray(){

        char charArr[] = {'I', 'N', 'D', 'H', 'U'};
        int startIndex = 0;
        int endIndex = charArr.length -1;
        char temp;

        while (endIndex > startIndex) {
            temp = charArr[startIndex];
            charArr[startIndex] = charArr[endIndex];
            charArr[endIndex] = temp;
            endIndex--;
            startIndex++;
        }

        System.out.println(Arrays.toString(charArr));

    }


}
