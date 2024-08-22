package com.program.practices;

public class OverrideStaticMethod {

    public static void method(){
        System.out.println("heloo from method1....");
    }

    public static void method(int a){
        System.out.println("heloo from method1 and 1 args....");
    }

    public static void method(int a, int b){
        System.out.println("heloo from method1 and 2 args....");
    }
}
class B extends OverrideStaticMethod{

     protected void show(){
        System.out.println("show");
    }

    public static void method(){
        System.out.println("heloo from method2....");
    }

    public static void main(String[] args) {

        OverrideStaticMethod overrideStaticMethod = new OverrideStaticMethod();  //parent class object
        B b = new B();//child class object
        b.method();
        overrideStaticMethod.method();
    }
}
class C extends B{

//    @Override
//    private void show(){
//        System.out.println("show");
//    }
}