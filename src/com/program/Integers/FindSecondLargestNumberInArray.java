package com.program.Integers;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargestNumberInArray {

    public static void main(String[] args) {

        final int[] array = {512,512,34,586,586,12,13,454};
        int largestNumber = largestNumberInArrayusingIterative(array);
        System.out.println("The largest number is: " +  largestNumber);

        int secondLargestNumber =  secondLargestNumberInArray(array);
        System.out.println("The second largest number is: " + secondLargestNumber);



//        Using streams
//        second highest number in array box primitive values into corresponding wrapper classes
//        Integer asInt = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//        System.out.println("asInt"+asInt);
    }

    //Find LargestNumberInArray

    private static int largestNumberInArrayusingIterative(final int[] array){
        // Initialize maximum element
        int max = array[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }

        return max;
    }

    //Find Second LargestNumberInArray

    private static int secondLargestNumberInArray(final int[] arr){
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

}
