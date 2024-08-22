package com.program.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OddEvenNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11,2,3,45,12,16,8,96);
        // even numbers
        List<Integer> evenNum = list.stream().filter(s -> s%2==0).collect(Collectors.toList());
        System.out.println("evenNum list: "+ evenNum);

        // to get the count of the even number from an given array
        long evenNumCount = list.stream().filter(s -> s%2==0).count();
        System.out.println("evenNum count list: "+evenNumCount);

        // odd numbers
        List<Integer> oddNum = list.stream().filter(s -> s%2!=0).collect(Collectors.toList());
        System.out.println("oddNum list: "+ oddNum);

        // to get the count of the even number from an given array
        long oddNumCount = list.stream().filter(s -> s%2!=0).count();
        System.out.println("oddNum count list: "+oddNumCount);

        Map<Boolean, List<Integer>> collect = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87).stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(collect);
        Set<Map.Entry<Boolean, List<Integer>>> entrySet = collect.entrySet();

        for (Map.Entry<Boolean, List<Integer>> entry : entrySet) {
            System.out.println("--------------");
            if (entry.getKey())
                System.out.println("Even Numbers");
            else
                System.out.println("Odd Numbers");

            System.out.println("--------------");

            List<Integer> li = entry.getValue();

            for (int i : li) {
                System.out.println(i);
            }
        }

    }
}
