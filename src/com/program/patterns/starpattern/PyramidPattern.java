package com.program.patterns.starpattern;

import java.util.Scanner;

public class PyramidPattern {

    public static void main(String[] args) {
        /*
        The most famous star pattern is the pyramid pattern.
                            *
                           ***
                          *****
                         *******
                        *********
        */

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Entered number is : "+size);

        for (int i = 0; i < size; i++) {
            // print spaces
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------other way to achieve--------------------");
        /* star with space

                        *
                       * *
                      * * *
                     * * * *
                    * * * * *

         */

//        for (int i = 1; i <= size; i++) {
//            for (int j = 1; j <= size - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
//            for (int k = size; k > i; k--){
//                System.out.print("* ");
//            }
            for (int k = i; k < size; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------");

        /*  Reverse pyramid star pattern in Java
                    *********
                     *******
                      *****
                       ***
                        *

        */

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (size - i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------other way to achieve--------------------");
        /* star with space

                    * * * * *
                     * * * *
                      * * *
                       * *
                        *
         */

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
//            for (int k = size; k > i; k--){
//                System.out.print("* ");
//            }
            for (int k = i; k < size; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
