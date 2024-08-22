package com.program.practices;

public class Base {
    int a = 10;
    public void print(){
        System.out.println("Base");
    }
}

class Derived extends Base {
    int a = 20;
    public void print(){
        System.out.println("Derived");
        System.out.println(super.a);
        System.out.println(this.a);

    }
}

class Main {
    public static void DoPrint(Base o){
        o.print();

    }

    public static void main(String[] args) {

        Base x = new Base();
        Base y = new Derived();
        Derived z = new Derived();
        System.out.println(x.a);
        System.out.println(y.a);
        System.out.println(z.a);
        DoPrint(x);
        DoPrint(y);
        DoPrint(z);
    }
}
