package com.program.Strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOutDuplicateChar {

    /**
     * Given a string find out duplicate character and its count .
     * Ex: i/p- ”manojpandey”, o/p- a-2,n-2.
     */

    public static void findDuplicateCharInGivenString(){
        String str = "manojpandey";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println(map);

        for (Map.Entry<Character, Integer> entrySet: map.entrySet()) {
            if (entrySet.getValue() > 1){
                System.out.println(entrySet.getKey() + " = " + entrySet.getValue());
            }
        }

    }

    /**
     * Find the repeated word in the sentence .
     * Ex: I/O:“I am a java developer and I am proud of it ” , o/p: I-2,am-2.
     */

    public static void findRepeatedWordInGivenSentence(){
        String str = "I am a java developer and I am proud of it";
        String[] words = str.split(" ");

        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words){
            word = word.toLowerCase();
            if (wordFrequency.containsKey(word)){
                wordFrequency.put(word, wordFrequency.get(word)+1);
            } else {
                wordFrequency.put(word, 1);
            }
        }
        System.out.println("Repeated words: ");
        for (Map.Entry<String, Integer> entry: wordFrequency.entrySet()){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }

        Arrays.asList(str.split(" ")).stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .forEach(System.out::println);

    }

    public static void main(String[] args) {
        findDuplicateCharInGivenString();
        findRepeatedWordInGivenSentence();
    }
}
