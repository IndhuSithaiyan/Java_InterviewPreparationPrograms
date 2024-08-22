package com.program.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SumOfNumbers {
    public static void main(String[] args) {

//        print sum of all numbers
        List<Integer> list = Arrays.asList(1,2,3,4);
        Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);
        System.out.println("Sum of numbers: "+ sum.get());

        Optional<Integer> reduce = list.stream().reduce(Integer::sum);
        System.out.println("Sum of numbers: "+ reduce.get());

        int sumArr = list.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum of numbers: "+ sumArr);

    }
}


abstract class Test{

    private String s = "indu";

    public abstract String method();
}

interface Test1{
    String a = "indhu";

    default String method(){
        return "heloo";
    }
}

class B{
    public void m1(int num){

    }
}

class A extends B implements Test1{

    public void m1(){

    }

    public String method(){
        return Test1.super.method();
    }

    public static void main(String[] args) {
        System.out.println(Test1.a);
        A a = new A();
        System.out.println(a.method());
    }
}