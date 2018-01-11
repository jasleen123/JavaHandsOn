package com.thinking.in.java.inheritance;

public class Inheritance {
    Inheritance()
    {
        System.out.println("Parent class");
    }
}

class Inherited1 extends Inheritance {
    Inherited1() {
        System.out.println("Child class");
    }

    public static void main(String[] args) {


        Inheritance i = new Inheritance();
        System.out.println("****");
        Inheritance i2 = new Inherited1();
        System.out.println("****");
        Inherited1 i3 = new Inherited1();
        System.out.println("****");
    }

    }
