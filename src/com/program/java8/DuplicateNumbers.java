package com.program.java8;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11,2,3,45,2,11,5,12,16,8,45,12);

        Set<Integer> dup = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
        System.out.println(dup);

        Set<Integer> dupElements = new HashSet<>();
        Set<Integer> result = list.stream().filter(s -> !dupElements.add(s)).collect(Collectors.toSet());
        System.out.println("dupElements from given array: "+result);

        Set<Integer> nonDupElements = new HashSet<>();
        Set<Integer> result1 = list.stream().filter(s -> nonDupElements.add(s)).collect(Collectors.toSet());
        System.out.println("non dupElements from given array: "+result1);

        // print non duplicate
        List<Integer> result2 = list.stream().distinct().collect(Collectors.toList());
        System.out.println("non dupElements from given array: "+result2);

    }
}
