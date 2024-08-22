package com.program.patterns.numberpattern;

import java.util.Scanner;

public class Level_04 {

    public static void main(String[] args) {
        /*
        1
        1 2 1
        1 2 3 2 1
        1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
        1 2 3 4 5 6 5 4 3 2 1
        1 2 3 4 5 6 7 6 5 4 3 2 1
        */

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------");

        /*
                            1
                          1 2
                        1 2 3
                      1 2 3 4
                    1 2 3 4 5
                  1 2 3 4 5 6
                1 2 3 4 5 6 7
        */

        for (int i = 1; i <= size; i++) {
//            for (int j = 1; j <= size - i; j++) {
//                System.out.print("  ");
//            }
            for (int j = 2 * size - i; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

        /*
                1 2 3 4 5 6 7
                  1 2 3 4 5 6
                    1 2 3 4 5
                      1 2 3 4
                        1 2 3
                          1 2
                            1
         */

        for (int i = size; i >= 1; i--) {
            for (int j = 2*size - i; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

        /*
                                    1
                                  2 1
                                3 2 1
                              4 3 2 1
                            5 4 3 2 1
                          6 5 4 3 2 1
                        7 6 5 4 3 2 1

         */

        for (int i = 1; i <= size; i++) {
            for (int j = 2 * size - i; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

        /*
                    7 6 5 4 3 2 1
                      6 5 4 3 2 1
                        5 4 3 2 1
                          4 3 2 1
                            3 2 1
                              2 1
                                1
        */

        for (int i = size; i >= 1; i--) {
            for (int k = 2 * size - i; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

        /*
                            1234567
                             234567
                              34567
                               4567
                                567
                                 67
                                  7
                                 67
                                567
                               4567
                              34567
                             234567
                            1234567
                */

        for (int i = 1; i <= size; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= size; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= size; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
