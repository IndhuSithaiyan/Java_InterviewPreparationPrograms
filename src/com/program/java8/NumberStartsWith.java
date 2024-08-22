package com.program.java8;

import java.util.*;
import java.util.stream.Collectors;

public class NumberStartsWith {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(22,25,6,43,223,27,29,11,2,3,45,12,16,8,96);

        List<Integer> result = list.stream()
                .map(e -> String.valueOf(e))
                .filter(s -> s.startsWith("2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(result);

        List<String> str = Arrays.asList("indu", "ram", "raj", "indra", "induu");
        List<String> resultStr = str.stream().filter(s -> s.startsWith("i")).collect(Collectors.toList());
        System.out.println(resultStr);

    }
}
