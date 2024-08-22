package com.program.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveSplCharsFromString {

    public static void main(String[] args) {
        String str = "aAzZSEARiohnealjs231!#$#13asga#$%";

        // replaceAll()
        String plainStr = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(plainStr);

        // method - 2
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 64 && str.charAt(i) < 122){
                s = s + str.charAt(i);
            }
        }
        System.out.println(s);


        // Remove all white spaces from a string
        String str2 = "j a va Hel  o Wo rl d  !";

        //method - 1
        String s1 = str2.replaceAll("\\s", "");
        System.out.println(s1);

        //method - 2
        for (int i = 0; i < str2.length(); i++) {
            if (!(str2.charAt(i) == ' ')){
                System.out.print(str2.charAt(i));
            }
        }

        System.out.println("----------------");

        String name = "Indhu Sithaiyan";
        String nameChar = name.toLowerCase().replaceAll("\\s", "");

        List<String> result = Arrays.stream(nameChar.split("")).distinct().collect(Collectors.toList());
        System.out.println(result);


    }
}
