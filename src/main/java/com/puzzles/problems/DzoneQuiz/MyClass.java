package com.puzzles.problems.DzoneQuiz;


public class MyClass {
    public void writeValue(int a, byte b) {
        System.out.println("Byte " + a + b);
    }
    public void writeValue(int a, short s) {
        System.out.println("Int " + a + s);
    }
    public void writeValue(int a, Integer i) {
        System.out.println("Integer " + a + i);
    }
    public void writeValue(int a, double d) {
        System.out.println("Double " + a + d);
    }

    MyClass(int i){
        System.out.println("Integer");
    }
    MyClass(double d){
        System.out.println("Double");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(1);
        myClass.writeValue(2, 100000000);
    }
}
