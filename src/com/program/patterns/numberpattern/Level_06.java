package com.program.patterns.numberpattern;

import java.util.Scanner;

public class Level_06 {

    public static void main(String[] args) {

        /*
                    1
                    10
                    101
                    1010
                    10101
                    101010
                    1010101
        */

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                if (j%2 == 0){
                    System.out.print(0);
                }
                else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }

        System.out.println("---------------------------------------");

        /*
                    1010101
                    0101010
                    1010101
                    0101010
                    1010101
                    0101010
                    1010101
        */

        for (int i = 1; i <= size; i++)
        {
            int num;
            if(i%2 == 0)
            {
                num = 0;
                for (int j = 1; j <= size; j++)
                {
                    System.out.print(num);
                    num = (num == 0)? 1 : 0;
                }
            }
            else
            {
                num = 1;
                for (int j = 1; j <= size; j++)
                {
                    System.out.print(num);
                    num = (num == 0)? 1 : 0;
                }
            }
            System.out.println();
        }

        System.out.println("---------------------------------------");

        /*
                   1111111
                   1111122
                   1111333
                   1114444
                   1155555
                   1666666
                   7777777
        */
        for (int i = 1; i <= size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print(1);
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("---------------------------------------");

        /*
                0000000
                0100000
                0020000
                0003000
                0000400
                0000050
                0000006
        */
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i == j) {
                    System.out.print(i);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
