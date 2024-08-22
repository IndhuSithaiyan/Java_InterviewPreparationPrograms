package com.program.patterns.numberpattern;

import java.util.Scanner;

public class Level_05 {

    public static void main(String[] args) {

        /*
                      1
                     1 2
                    1 2 3
                   1 2 3 4
                  1 2 3 4 5
                 1 2 3 4 5 6
                1 2 3 4 5 6 7
        */

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Enter a number: "+size);

        for (int i = 1; i <= size; i++) {
            for (int j = size; j > i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------");

        /*
                        1
                       2 3
                      3 4 5
                     4 5 6 7
                    5 6 7 8 9
        */
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i ; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < 2 * i ; k++) {
                System.out.print(k+ " ");
            }

            System.out.println();
        }

        System.out.println("----------------------------------------");

        /*
                          1
                         2 2
                        3 3 3
                       4 4 4 4
                      5 5 5 5 5
                     6 6 6 6 6 6
                    7 7 7 7 7 7 7
        */

        for (int i = 1; i <= size ; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

        /*
                        7 7 7 7 7 7 7
                         6 6 6 6 6 6
                          5 5 5 5 5
                           4 4 4 4
                            3 3 3
                             2 2
                              1
        */

        for (int i = size; i >= 1; i--) {
            for (int j = 1; j < size - i ; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------");

        /*
                          7
                         6 7
                        5 6 7
                       4 5 6 7
                      3 4 5 6 7
                     2 3 4 5 6 7
                    1 2 3 4 5 6 7
        */

        for (int i = size; i >= 1; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = i; k <= size; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");

        /*
                    1 2 3 4 5 6 7
                     2 3 4 5 6 7
                      3 4 5 6 7
                       4 5 6 7
                        5 6 7
                         6 7
                          7
        */

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= size; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

        /*
                      7
                     7 6
                    7 6 5
                   7 6 5 4
                  7 6 5 4 3
                 7 6 5 4 3 2
                7 6 5 4 3 2 1
        */

        for (int i = size; i >= 1; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = size; k >= i; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");

        /*
                    7 6 5 4 3 2 1
                     7 6 5 4 3 2
                      7 6 5 4 3
                       7 6 5 4
                        7 6 5
                         7 6
                          7
        */

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = size; k >= i; k--) {
                System.out.print(k +" ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");

        /*
                    1 2 3 4 5 6 7
                     2 3 4 5 6 7
                      3 4 5 6 7
                       4 5 6 7
                        5 6 7
                         6 7
                          7
                         6 7
                        5 6 7
                       4 5 6 7
                      3 4 5 6 7
                     2 3 4 5 6 7
                    1 2 3 4 5 6 7
        */

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= size; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }

        for (int i = size-1; i >= 1; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = i; k <= i; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}
