package com.program.Integers;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateElementFromArray {

    // Approach - 1 --> this is reduce the temp space
    public static int removeDuplicateElementsSortedArray(int ar[]){

        int rd = 0;

        for (int i = 1; i < ar.length; i++) {
            if (ar[rd] != ar[i]){
                rd++;
                ar[rd] = ar[i];
            }
        }

        return rd+1;
    }

    // Approach - 2 --> using ArrayList
    public static void  removeDuplicateElements(int[] ar){

        List<Integer> uniqueElements = new ArrayList<>();
        HashSet<Integer> duplicateElements = new HashSet<>();

        for (int a: ar) {
            if (!uniqueElements.contains(a)){
                uniqueElements.add(a);
            } else {
                duplicateElements.add(a);
            }
        }
        System.out.println("uniqueElements-- "+uniqueElements);
        System.out.println("duplicateElements-- "+duplicateElements);

        int[] result = new int[uniqueElements.size()];
        int i =0;
        for (int b: uniqueElements) {
            result[i] = b;
            i++;
        }

        System.out.println(Arrays.toString(result));
//        return result;
    }

    // Approach - 3 --> using Map
    public static void removeDuplicateElements1(int[] ar){

        Map<Integer, Integer> map = new HashMap<>();

        int len = ar.length;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(ar[i])){
                map.put(ar[i], map.get(ar[i])+1);
            }
            else {
                map.put(ar[i], 1);
            }
        }
        System.out.println(map);
        map.forEach((k,v) -> System.out.println(k + " "));
    }

    public static void main(String[] args) {
        int ar[] = {1,2,2,2};
        int ar1[] = {1,1,5,2,1,3,5,2,2,2};

//        using streams
        List<Integer> list = Arrays.asList(1,2,3,4,12,3,4,2,1);
        List<Integer> l = list.stream().distinct().collect(Collectors.toList());
        System.out.println(l);

        list.stream().distinct().forEach(s -> System.out.println(s));
        System.out.println(l);

        Integer[] numbers = {1,2,3,1,2,3,54,6,7};
        Integer[] distinctNum = Arrays.stream(numbers).distinct().toArray(Integer[]::new);
        System.out.println(Arrays.toString(distinctNum));

        //before removing the duplicate elements
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+ " ");
        }

        int rd = removeDuplicateElementsSortedArray(ar);
        System.out.println();

        //after removing the duplicate elements
        for (int i = 0; i < rd; i++) {
            System.out.print(ar[i]+ " ");
        }

        System.out.println("-----------------------------");

//        int rd1[] = removeDuplicateElements(ar1);
//        System.out.println(Arrays.toString(rd1));

        removeDuplicateElements(ar1);

        removeDuplicateElements1(ar1);

//        Arrays.stream(ar).distinct().toArray();
    }
}
