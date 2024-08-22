package com.program.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AvgOfNumbers {
    public static void main(String[] args) {

//      Print Avg of all numbers
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        double result1 = list.stream().mapToInt(s -> s).average().getAsDouble();
        System.out.println(result1);

//      Number square average
        List<Integer> list1 = Arrays.asList(1, 10, 20, 30, 15);
        //1, 100, 400, 900, 225
        // 1525/3 = 508.333
        double result2 = list1.stream()
                .map(e -> e*e)
                .filter(e -> e>100)
                .mapToInt(e -> e)
                .average()
                .getAsDouble();
        System.out.println(result2);
    }
}
