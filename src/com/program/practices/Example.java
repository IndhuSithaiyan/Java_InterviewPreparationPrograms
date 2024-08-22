package com.program.practices;

import java.util.*;

public class Example {

    static public  void main(String[] args) {

        Set<String> set = new HashSet();
        set.add(null);
        set.add(null);
        System.out.println(set);

        Set<String> set1 = new LinkedHashSet<>();
        set1.add(null);
        set1.add(null);
        System.out.println(set1);

        LinkedList<String> l = new LinkedList<>();
        l.add(null);
        l.add(null);
        System.out.println(l);

    Parent p = new Child();
    p.method();
        System.out.println( p.method());

        String s1 = "indhu";
        String s2 = "indhu";
        StringBuffer s3 = new StringBuffer("indhu");
        StringBuffer s4 = new StringBuffer("indhu");
        String s5 = new String("indhu");
        String s6 = new String("indhu");

        System.out.println(s5 == s6);

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1.equals(s4));
    }
}

class Parent{
    public static int method(){
        System.out.println("hello");
        try {
            return 10;
        } catch (Exception e){
            return 1;
        }
        finally {
            
            return 100;
        }
//        System.out.println("world");

    }
}

abstract class A{
    abstract void method();
}
class Child extends Parent{
//    public static void method(){
//        System.out.println("world");
//    }
}

interface Test{

    default void method3(){
        System.out.println("i m indu");
    }


}

class Car implements Test{
    public void method3(){
        System.out.println("induu");
    }

    public static void main(String[] args) {
        Test v = new Car();
        v.method3();
    }
}