package com.program.patterns.numberpattern;

import java.util.Scanner;

public class Level_02 {
    public static void main(String[] args) {

        /*
                    7
                    7 6
                    7 6 5
                    7 6 5 4
                    7 6 5 4 3
                    7 6 5 4 3 2
                    7 6 5 4 3 2 1
        */

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = size; i >= 1; i--) {
            for (int j = size; j >= i ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------");

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
            for (int j = size; j >= i; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------");

        /*
                1
                2 1
                3 2 1
                4 3 2 1
                5 4 3 2 1
                6 5 4 3 2 1
                7 6 5 4 3 2 1
        */

        for (int i = 1; i <=size ; i++) {
            for (int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------");

        /*
                    7 6 5 4 3 2 1
                    6 5 4 3 2 1
                    5 4 3 2 1
                    4 3 2 1
                    3 2 1
                    2 1
                    1
        */

        for (int i = size; i >= 1 ; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
