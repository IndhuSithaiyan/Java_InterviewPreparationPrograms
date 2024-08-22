package com.shortOutputPrograms;

public class Test_29 {

    public static void main(String[] args) {
         Thread myThread = new MyThread();
         myThread.run(); // #1
         System.out.println("In main method; thread name is: " + Thread.currentThread().getName());
    }

}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("In run method; thread name is: " + Thread.currentThread().getName());
    }
}

/**
 * Answer:
 * In run method; thread name is: main
 * In main method; thread name is: main
 *
 * Explanation: The correct way to invoke a thread is to call the start() method on a Thread object.
 * If you directly call the run() method, the method will run just like any other method
 * (in other words, it will execute sequentially in the same thread without running as a separate thread).
 */