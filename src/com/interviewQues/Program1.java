package com.interviewQues;

import java.util.*;
import java.util.stream.Collectors;

public class Program1 {

        public static void main(String[] args) {
            // 1. Create a list of strings and sort them
            List<String> stringList = Arrays.asList("banana", "apple", "orange", "grape", "pear");
            List<String> sortedList = stringList.stream()
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println("Sorted list: " + sortedList);

            // 2. Add null value to the list and print non-null values
            List<String> stringListWithNulls = new ArrayList<>(stringList);
            stringListWithNulls.add(null);
            List<String> nonNullValues = stringListWithNulls.stream()
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            System.out.println("Non-null values: " + nonNullValues);

            // 3. Add a duplicate value to the list and print distinct values
            List<String> stringListWithDuplicates = new ArrayList<>(stringList);
            stringListWithDuplicates.add("apple");
            List<String> distinctValues = stringListWithDuplicates.stream()
                    .distinct()
                    .collect(Collectors.toList());
            System.out.println("Distinct values: " + distinctValues);
        }
}
