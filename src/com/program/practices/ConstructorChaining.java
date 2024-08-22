package com.program.practices;

public class ConstructorChaining {
    public ConstructorChaining() {
        this(10, 20);
        System.out.println("heloo i am no arg const..");
    }

    public ConstructorChaining(int a) {
        System.out.println("heloo i am 1 arg const..");
    }

    public ConstructorChaining(int b, int a) {
        System.out.println("heloo i am 2 arg const..");
    }

    public static void main(String[] args) {
        ConstructorChaining chaining = new ConstructorChaining();
    }
}
