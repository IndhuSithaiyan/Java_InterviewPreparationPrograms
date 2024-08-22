package com.program.java8;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Programs {

    public static void main(String[] args) {

        String str = "ilovejavahelloworld";

        /**
         * find frequency of each character in a string using Java 8 streams
         */
        List<String> stringList1 = new ArrayList<>(Arrays.asList(str.split("")));
        Map<String, Long> collect = stringList1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        /**
         * find frequency of each element in an array or a list
         */
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String, Long> stationeryCountMap =
                stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stationeryCountMap);

        /**
         * Java program to count the occurrence of each character in a string
         */
        Map<String, Long> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        /**
         * find all duplicate elements from a given string
         */
        List<String> duplicateElements = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("duplicateElements: "+duplicateElements);

        /**
         * find all unique elements from given string
         */
        List<String> uniqueElements = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("uniqueElements : "+ uniqueElements);


        /**
         * find first non repeating element from a given string
         */
        String firstNonRepeatElement = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .findFirst().get().getKey();

        // when you use groupingBy, it is internally java8 stream consider it as hashMap (hashMap doesn't maintain order) so we can use LinkedHashMap here
        System.out.println("1st non repeat element : "+firstNonRepeatElement);

        String secondNonRepeatElement = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(s -> s.getValue() == 1)
                .skip(1)
                .findFirst()
                .get().getKey();
        System.out.println("2nd non repeat element : "+secondNonRepeatElement);

        /**
         * find second highest number from given array
         */
        int[] numbers = {6,7,23,19,21,4,2};

        // to sort the arrays
        List<Integer> integerList = Arrays.stream(numbers).boxed()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("sorted array: " + integerList);

        int asInt = Arrays.stream(numbers).reduce(Integer::max).getAsInt();
        System.out.println("highest number from an Array: "+asInt);

        Integer secondHighestNumber = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("2nd highest number: "+secondHighestNumber);

        /**
         * java program to find longest string from given array
         */
        String[] strArr = {"java", "Springboot", "microservices", "python"};

        String longestString = Arrays.stream(strArr)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();

        System.out.println(longestString);


//        int maxLength = 0;
//        String longestStr = null;
//        for (String s: strArr) {
//            if (s.length() > maxLength){
//                maxLength = s.length();
//                longestStr = s;
//            }
//        }
//        System.out.println(longestStr);

        /**
         * find elements from array who starts with 2
         * hint: convert int[] to List<string>
         */
        List<Integer> collect1 = Arrays.stream(numbers)
                .boxed()
                .map(String::valueOf)
                .filter(s -> s.startsWith("2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(collect1);

//        String str1[] = {"indu", "ram", "Raj", "ravi", "gopi"};
//        Arrays.asList(str1).stream().filter(s -> s.toLowerCase().startsWith("r")).forEach(System.out::println);
//        int num = Arrays.asList(1,2,3,4,6).stream().sorted(Comparator.reverseOrder()).findFirst().get();
//        System.out.println(num);

        /**
         * find the even number of count of an array which is having 100 numbers by using streams
         */
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        long result = list.stream().filter(s -> s % 2 == 0).count();
        System.out.println(result);

        //String s1 = "Welcomeworld";
        //
        //Rightshift = comeworldWel
        //LeftShift =  rldWelcomewo

        String s1 = "Welcomeworld";
        String[] split = s1.split("");

    }
}