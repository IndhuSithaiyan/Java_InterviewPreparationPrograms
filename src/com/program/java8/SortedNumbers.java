package com.program.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNumbers {
    public static void main(String[] args) {

//        Integer[] array = {1,11,2,3,45};
//        List<Integer> list = Arrays.asList(array);

        List<Integer> list = Arrays.asList(1,11,2,3,45, 26,44,32);
        List<Integer> sortedAsc = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted ascending order: "+sortedAsc);

        List<Integer> sortedDesc = list.stream().filter(s->s%2==0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted descending order: "+sortedDesc);

    }
}
