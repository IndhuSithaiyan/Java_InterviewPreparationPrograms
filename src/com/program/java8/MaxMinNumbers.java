package com.program.java8;

import java.util.*;

public class MaxMinNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11,2,3,45,2,11,5,12,16,8,45,12);
        int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);

        int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);

        Optional<Integer> reduceMax = list.stream().reduce(Integer::max);
        System.out.println(reduceMax.get());

        Optional<Integer> reduceMix = list.stream().reduce(Integer::min);
        System.out.println(reduceMix.get());

        int max1 = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximum Element : "+max1);

        int min1 = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Minimum Element : "+min1);
    }
}
