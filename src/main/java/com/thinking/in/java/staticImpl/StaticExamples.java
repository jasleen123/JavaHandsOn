
package com.thinking.in.java.staticImpl;

public class StaticExamples extends A {
    static {
        int i = 10;
        String[] str;
        System.out.println("Static block 1 with value of i : " + i);
    }

    static {
        int i = 20;
        System.out.println("Static block 2 with value of i : " + i);
        //  main(str);
    }

    public static void main(String[] args) {
        A new1 = new A();
        new1.field3 = 100;
        StaticExamples.method1(field1);
    }
}

class A {
    static int field1; // ** static modifier can be used with fields/instance variables
    int field3;

    static void method1(int field1) {
        int var1 = 10 + field1;   // ** static modifier not allowed with local modifiers
        System.out.println("A method having field value " + var1);
    }

    A() {
        method1(field1);
    }
}

class Test {
    static int sum = 0;

    static int add(int x, int y) {
        System.out.println("inside static method");
        return x + y;
    }

    static {
        System.out.println("inside static block");
        sum = add(34, 56);
        System.out.println("sum = "+sum);
    }

    static class TestInner {
        public static void main(String[] args) {
            System.out.println("static inner class");
            Test t = new Test();
            System.out.println("result : "+add(23,35));
        }

    }

    public static void main(String[] args) {
        System.out.println("Method hiding");
    }
}

