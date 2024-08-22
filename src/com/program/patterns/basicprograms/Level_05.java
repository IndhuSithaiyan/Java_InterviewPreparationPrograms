package com.program.patterns.basicprograms;

import java.util.Scanner;

public class Level_05 {

    /**
     * First n numbers
     * Write a program to print the first N natural numbers.
     * Input Format:
     * First line consists of a positive integer n
     * Output Format:
     * Print the number from 1 to n space separated integer.
     * Sample Input:
     * 10
     * Sample Output:
     * 1 2 3 4 5 6 7 8 9 10
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//
//        for (int i = 1; i <= a; i++) {
//            System.out.print(i + " ");
//        }
//    }

    /**
     * Numbers from n to 1
     * Write a program to print the numbers from N to 1.
     * Input Format:
     * First line consists of a positive integer n
     * Output Format:
     * Print the number from n to 1 space separated integer.
     * Sample Input:
     * 10
     * Sample Output:
     * 10 9 8 7 6 5 4 3 2 1
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//
//        for (int i = a; i >= 1; i--) {
//            System.out.print(i + " ");
//        }
//    }

    /**
     * First n even numbers
     * Write a program to print the first N even natural numbers.
     * Input Format:
     * First line consists of a positive integer n
     * Output Format:
     * Print the number from 1 to n space separated even integer.
     * Sample Input:
     * 5
     * Sample Output:
     * 2 4 6 8 10
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//
//        for (int i = 1; i <= a; i++) {
//            System.out.print((i * 2) + " ");
//        }
//    }

    /**
     * First n odd numbers
     * Write a program to print the first N odd natural numbers.
     * Input Format:
     * First line consists of a positive integer n
     * Output Format:
     * Print the number from 1 to n space separated odd integers.
     * Sample Input:
     * 5
     * Sample Output:
     * 1 3 5 7 9
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        System.out.println("First "+n+" ODD numbers");
//        for(int i=1;i<=2*n;i++) {
//            if(i%2 == 0)
//                continue;
//            else
//                System.out.print(i + " ");
//        }
//
////        for (int i = 1; i <= n; i++) {
////            System.out.print(((i * 2)-1) + " ");
////        }
//    }

    /**
     * Multiples of 2
     * Write a program to print all the multiples of 2 till N.
     * Input Format:
     * First line consists of a positive integer n
     * Output Format:
     * Print the numbers from 2 to n which are multiples of 2.
     * Sample Input:
     * 15
     * Sample Output:
     * 2 4 6 8 10 12 14
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
////        for (int i = 1; i <= n/2; i++) {
////            System.out.print((i * 2) + " ");
////        }
//
//        for (int i = 1; i <= n; i++) {
//            if (i%2==0){
//                System.out.print(i+" ");
//            }
//        }
//    }

    /**
     * First n multiples of 2
     * Write a program to print first n multiples of 2.
     * Input Format:
     * First line consists of a positive integer n
     * Output Format:
     * Print the required space separated number series
     * Sample Input:
     * 10
     * Sample Output:
     * 2 4 6 8 10 12 14 15 16 18
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print((i * 2) + " ");
//        }
//
////        for (int i = 1; i <= n * 2; i++) {
////            if (i%2==0){
////                System.out.print(i+" ");
////            }
////        }
//    }

    /**
     * First n multiples of 3
     * Write a program to print first N multiples of 3.
     * Input Format:
     * First line consists of a positive integer n
     * Output Format:
     * Print the required space separated number series
     * Sample Input:
     * 7
     * Sample Output:
     * 3 6 9 12 15 18 21
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print((i * 3) + " ");
//        }
//
//        System.out.println();
//
////        for (int i = 1; i <= n*3; i++) {
////            if (i%3==0){
////                System.out.print(i+" ");
////            }
////        }
//    }

    /**
     * First n multiples of 5
     * Write a program to print first N multiples of 5.
     * Input Format:
     * First line consists of a positive integer n
     * Output Format:
     * Print the required space separated number series
     * Sample Input:
     * 5
     * Sample Output:
     * 5 10 15 20 25
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print((i * 5) + " ");
//        }
//
//        System.out.println();
//
////        for (int i = 1; i <= n*5; i++) {
////            if (i%5==0){
////                System.out.print(i+" ");
////            }
////        }
//    }

    /**
     * First N Multiple of 2 and 3
     * Write a program to print all the numbers which are multiples of either 2 or 3 till N.
     * Input Format:
     * First line consists of a positive integer n
     * Output Format:
     * Print the number from 2 to n space separated multiples of 2 and 3
     * integers.
     * Sample Input:
     * 15
     * Sample Output:
     * 2 3 4 6 8 9 10 12 14 15
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            if (i%2==0 || i%3==0){
//                System.out.print(i+" ");
//            }
//        }
//    }

    /**
     * First N Multiple of 2, 5 and 7
     * Write a program to print all the numbers which are multiples of either 2 or 5 or 7 till N.
     * Input Format:
     * First line consists of a positive integer n
     * Output Format:
     * Print the number from 2 to n space separated multiples of 2 and 3
     * integers.
     * Sample Input:
     * 15
     * Sample Output:
     * 2 4 5 6 7 8 10 12 14 15
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i%2==0 || i%5==0 || i%7==0){
                System.out.print(i+" ");
            }
        }
    }

}
