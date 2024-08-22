package com.program.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
        //get first 5 number --> sum of that number

        //limit
        List<Integer> limit =  list.stream().limit(5).collect(Collectors.toList());
        System.out.println(limit);

        int suml = limit.stream().limit(5).reduce((p,q) -> p+q).get();
        System.out.println(suml);

        //skip
        List<Integer> sk =  list.stream().skip(5).collect(Collectors.toList());
        System.out.println(sk);

        int sumsk = list.stream().skip(5).reduce((p,q) -> p+q).get();
        System.out.println(sumsk);

    }
}
