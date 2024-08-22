package com.program.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {

    // Approach -1
    public static boolean isAnagram(String s1, String s2){
        String str1 = s1.replaceAll("\\s","");
        String str2 = s2.replaceAll("\\s","");

        char[] ch1= str1.toLowerCase().toCharArray();
        char[] ch2= str2.toLowerCase().toCharArray();

        if (str1.length() != str2.length()){
            return false;
        }else {
            Arrays.sort(ch1);
            System.out.println(ch1);
            Arrays.sort(ch2);
            System.out.println(ch1);
        }

        return Arrays.equals(ch1,ch2);
    }

    // Approach -2
    public static boolean isAnagram1(String s1, String s2){

        String str1 = s1.replaceAll("\\s", "").toLowerCase();
        String str2 = s2.replaceAll("\\s", "").toLowerCase();

        boolean flag = true;

        if (str1.length() != str2.length()){
            return false;
        }
        else {
            char ch[] = str1.toCharArray();
            StringBuffer sb = new StringBuffer(str2);

            for (char c: ch) {
                int index = sb.indexOf(""+c);
                if (index != -1){
                    sb.deleteCharAt(index);
                } else {
                    flag = false;
                    break;
                }
            }
        }

        return flag;
    }

    public static void anagramByUsingJava8(String s1, String s2){
        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if (s1.equals(s2))
            System.out.println("Two strings are anagrams");
        else
            System.out.println("Two strings are not anagrams");
    }

    public static void main(String[] args) {
        isAnagram("Army", "mary");
        isAnagram("Listen", "SILENT");
        isAnagram("LIVeS", "elv i s");
        isAnagram("CAT", "ACT");
        isAnagram("enjoy", "Joy");

        isAnagram1("Listen", "SILENT");

        anagramByUsingJava8("raceCar", "CarRace");

        Object[] obj = new Object[4];
        obj[0] = "indu";
        obj[1] = 1;
        obj[3] = true;

        System.out.println(Arrays.toString(obj));

            ;
        System.out.println(Arrays.toString(new String[]{"a", "b"}));

        int arr[] = {1, 2, 3};
        arr = new int[]{4, 5, 6};
        System.out.println(Arrays.toString(arr));

        System.out.println(arr.length);
        String s = "indu";
        s.concat("induuuu");
        System.out.println(s);

        List<Integer> li = Arrays.asList(1,2,3,4,5);
        li = Arrays.asList(6,5,3,2,1,90,9);
        System.out.println(li);

    }
}

class Employee{

}
