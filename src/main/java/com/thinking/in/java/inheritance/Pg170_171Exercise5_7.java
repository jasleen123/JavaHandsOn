package com.thinking.in.java.inheritance;

public class Pg170_171Exercise5_7 {
    public static void main(String[] args) {
        C c = new C(16);
    }
}
class A{
/*    public A() {
        System.out.println("Class A");
    }*/
public A(int i) {
    System.out.println("Class A" + i);}
}

class B extends A{
/*    public B() {
        System.out.println("Class B");
    }*/
public B(int i) {
    super(i);
    System.out.println("Class B" + i);
}
}

class C extends A{    // Parent = A
    B b = new B(15);
    public C(int i){
        super(i); // called first
        System.out.println("Class C" + i);
    }

}

