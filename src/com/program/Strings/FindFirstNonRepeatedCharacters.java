package com.program.Strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacters {

    public static void approach_1(String str1){
        // without using MAP (collection)
        for (int i = 0; i < str1.length(); i++) {
            Boolean unique = true;
            for (int j = 0; j < str1.length(); j++) {
                if(i != j && str1.charAt(i) == str1.charAt(j)){
                    unique = false;
                }
            }

            if(unique){
                System.out.print(str1.charAt(i));   // If you need all non repeated chars exclude break; statement
//                break;        //If you need first one non repeated char then print that particular char
            }
        }
    }

    public static void approach_2(String str1){

        // Using collection (MAP)
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            System.out.println(map);
            if (map.containsKey(ch)){
//                System.out.println("map.get(ch)+1==>  "+map.get(ch));
//                System.out.println("ch ==> "+ch);
                map.put(ch, map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        System.out.println(map);

        boolean noRepeatingFound1 = false;

        // to get first non repeated characters
        for (Map.Entry<Character, Integer> entrySet: map.entrySet()) {
            if (entrySet.getValue() == 1){
                System.out.println(entrySet.getKey());
                noRepeatingFound1 = true;
                break;
            }
        }

        if (!noRepeatingFound1){
            System.out.println(-1);
        }

    }

    public static void approach_3(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char ch: chars) {
            if (!map.containsKey(ch)){
                map.put(ch, 1);
            } else {
                int occurrenceFreq = map.get(ch);
                occurrenceFreq++;
                map.put(ch, occurrenceFreq);
            }
        }
        System.out.println(map);

        // to find the first occurrence
        boolean noRepeatingFound = false;
        for (char c: chars) {
            int currentFreq = map.get(c);
            if (currentFreq == 1){
                System.out.println(c);
                noRepeatingFound = true;
                break;
            }
        }

        if (!noRepeatingFound){
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {

        String str1 = "AaAbSSGG";
//        approach_1(str1);
        approach_2(str1);
//        approach_3(str1);

        List<String> map =Arrays.stream(str1.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
//                .skip(1)
//                .findFirst().get().getKey();
        System.out.println("map: "+map);
    }

}
