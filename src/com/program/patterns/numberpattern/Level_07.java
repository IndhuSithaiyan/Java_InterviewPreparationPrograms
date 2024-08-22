package com.program.patterns.numberpattern;

import java.util.Scanner;

public class Level_07 {
    public static void main(String[] args) {
        /*
                    1
                    2 6
                    3 7 10
                    4 8 11 13
                    5 9 12 14 15
        */

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++)
        {
            int num = i;
            for (int j = 1; j <= i; j++)
            {
                System.out.print(num+" ");
                num = num+size-j;
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------");

        /*
                1
                2 3
                4 5 6
                7 8 9 10
        */
        int num = 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        /*
            1
            3 2
            4 5 6
            10 9 8 7
            11 12 13 14 15
        */

    }
}
