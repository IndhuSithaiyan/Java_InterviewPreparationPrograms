package com.program.patterns.basicprograms;

import java.util.Scanner;

public class Level_04 {

    /**
     * Reminder of 2 numbers
     * Write a program to find remainder of two given numbers
     * Input Format:
     * First line contains space separated two integer input n,m.
     * Output Format:
     * Print reminder of 2 numbers if n>m else print -1
     * Sample Input:
     * 20 6
     * Sample Output:
     * 2
     * Sample Input:
     * 10 20
     * Sample Output:
     * -1
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first Number");
//        int n = scanner.nextInt();
//        System.out.println("Enter the second Number");
//        int m = scanner.nextInt();
//        if (n>m){
//            int x = n%m;
//            System.out.println(x);
//        } else {
//            System.out.println(-1);
//        }
//    }

    /**
     * Grading System.
     * Write a program to find grade of the student marks
     * ● If marks scored 90+ then print A+.
     * ● If marks scored 80+ then print A.
     * ● If marks scored 70+ then print B+.
     * ● If marks scored 60+ then print B.
     * ● If marks scored 50+ then print C+.
     * ● If marks scored 40+ then print C.
     * ● If marks scored less than 40 then print “Fail”.
     * ● If marks scored is less than 0 or greater than 100 then print “Invaild”.
     * Input Format:
     * First line contains a single integer input n.
     * Output Format:
     * Print its respective grade as per the n input
     * Sample Input:
     * 83
     * Sample Output:
     * A
     * Sample Input:
     * 9
     * Sample Output:
     * Invaild
     * Sample Input:
     * 38
     * Sample Output:
     * Fail
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter student marks");
//        int n = scanner.nextInt();
//
//        if (n>=90 && n<=100){
//            System.out.println("A+");
//        } else if (n>=80 && n<90){
//            System.out.println("A");
//        } else if (n>=70 && n<80){
//            System.out.println("B+");
//        } else if (n>=60 && n<70){
//            System.out.println("B");
//        } else if (n>=50 && n<60){
//            System.out.println("C+");
//        } else if (n>=40 && n<50){
//            System.out.println("C");
//        } else if (n<40 && n>=0){
//            System.out.println("Fail");
//        } else if (n<0 || n>100){
//            System.out.println("Invalid");
//        }
//    }

    /**
     * Largest Number
     * Write a program to find the largest number among 4 integer numbers
     * Input Format:
     * First line contains space separated three integer input n,m,l,k.
     * Output Format:
     * Print largest number of 4 numbers
     * Sample Input:
     * 10 25 5 30
     * Sample Output:
     * 30
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int d = scanner.nextInt();
//
//        int result = 0;
//
//        if (a > b) {
//            if (a > c && a > d) {
//                result = a;
//            } else {
//                if (c > d) {
//                    result = c;
//                } else {
//                    result = d;
//                }
//            }
//        } else {
//            if (b > c && b > d) {
//                result = b;
//            } else {
//                if (c > d) {
//                    result = c;
//                } else {
//                    result = d;
//                }
//            }
//        }
//
//        System.out.println(result);
//    }

    /**
     * Smallest Number
     * Write a program to find the smallest number among 4 integer numbers
     * Input Format:
     * First line contains space separated three integer input n,m,l,k.
     * Output Format:
     * Print smallest number of 4 numbers
     * Sample Input:
     * 1 3 5 4
     * Sample Output:
     * 1
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int d = scanner.nextInt();
//
//        int result = 0;
//
//        if (a < b) {
//            if (a < c && a < d) {
//                result = a;
//            } else {
//                if (c < d) {
//                    result = c;
//                } else {
//                    result = d;
//                }
//            }
//        } else {
//            if (b < c && b < d) {
//                result = b;
//            } else {
//                if (c < d) {
//                    result = c;
//                } else {
//                    result = d;
//                }
//            }
//        }
//        System.out.println(result);
//    }

    /**
     * Swap 2 Numbers
     * Write a program to swap two numbers.
     * Input Format:
     * First line consists of a positive integer n1.
     * Second line consists of a positive integer n2.
     * Output Format:
     * Prints the required result before and after swapping the numbers.
     * Sample Input:
     * 10 20
     * Sample Output:
     * Before Swapping
     * 10 20
     * After Swapping
     * 20 10
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("before swapping the integer : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping the integer : "+ a +" "+ b);

    }
}
