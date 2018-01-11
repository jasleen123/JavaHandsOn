package com.thinking.in.java.inheritance;

import com.thinking.in.java.inheritance.Parent;

public class Child extends Parent {
    int a=5;
    public void print(){
        System.out.println("Child");
    }

    public static void display(){
        System.out.println("Child display");
    }

    public static void main(String[] args) {
        display();
    }


}
