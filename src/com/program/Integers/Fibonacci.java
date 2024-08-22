package com.program.Integers;

public class Fibonacci {

    //iterative approach
    public static void generateFibonacciSeries(int n){
        int a = 0, b = 1;
        System.out.println("Fibonacci series up to "+n+" terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    //without swap approach
    public static void generateFibonacciSeries1(int n){
        int a = 0, b = 1;
        System.out.println("Fibonacci series up to "+n+" terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            b = a + b;
            a = b - a;
        }
    }
    public static void main(String[] args) {
        int n = 10;
        generateFibonacciSeries(n);
        System.out.println();
        generateFibonacciSeries1(n);
    }
}
