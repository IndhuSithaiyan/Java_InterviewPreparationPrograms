package com.program.Strings;

public class ReplaceACharWithItsOccurrence {
    public static void main(String[] args) {
        String str1 = "OPENTEXT";
        char charToBeReplaced = 'T';

        System.out.println(str1.indexOf(charToBeReplaced));

        if (str1.indexOf(charToBeReplaced) == -1){
            System.out.println("Given Character not available in Input String..");
            System.exit(0);  //to break or stop the program
        }

        int count = 1;
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (c == charToBeReplaced){
                str1 = str1.replaceFirst(String.valueOf(charToBeReplaced), String.valueOf(count));
                count++;
            }

        }
        System.out.println(str1);
    }
}
