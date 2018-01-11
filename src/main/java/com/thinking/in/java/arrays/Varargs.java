package com.thinking.in.java.arrays;

public class Varargs {
    static void f(Character... args){

    }
    static void f(Integer... args){

    }

    static void f(Long... args){

    }

        public static void main(String[] args) {
        f('a','b','c');
        f(1,2,3);
        f(1,2);

    }
}
