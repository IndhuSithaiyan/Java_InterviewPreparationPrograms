package com.program.Integers;

public class FindMissingNumberInArray {

    public static int findMissingNumber(int[] nums, int n) {
        int totalSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum = actualSum + num;   // actualSum += num;
        }
        return totalSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 3, 7, 8};
        int n = 8;
        int missingNumber = findMissingNumber(nums, n);
        System.out.println("Missing Number: " + missingNumber);
    }

}
