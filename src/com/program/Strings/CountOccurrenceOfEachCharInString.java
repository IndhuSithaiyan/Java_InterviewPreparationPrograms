package com.program.Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrenceOfEachCharInString {

    // approach - 1
    public static void countOccurrence(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
//        map.forEach((k, v) -> System.out.println(k+"="+v));
    }


    // approach - 2
    public static void countOccurrence1(String str){
        int[] occurrences = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            occurrences[c]++;
        }
//        System.out.println(Arrays.toString(occurrences));

        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] > 0){
                System.out.println((char) i+" : "+occurrences[i]);
            }
        }
    }



    // approach - 3
    public static void countOccurrence2(String str){

        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        int count = 1;

        for (int i = 1; i < chars.length; i++) {
           if (chars[i] == chars[i-1]){
               count++;
           } else {
               System.out.println(chars[i-1]+" : "+count);
               count = 1;
           }

        }
        System.out.println(chars[chars.length-1]+" : "+count);

    }

    public static void countOccurrenceInInteger(int[] number){
        LinkedHashMap<Integer, Long> collect = Arrays.stream(number).boxed().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);
    }

    public static void main(String[] args) {
        String str = "AABBCDEEEFEG";
        countOccurrence(str);
        countOccurrence1(str);
        System.out.println("---------------------------");
        countOccurrence2(str);

        int arr[] = {1,2,3,4,56,8,3,6,7,6,7,8};
        countOccurrenceInInteger(arr);

    }
}
