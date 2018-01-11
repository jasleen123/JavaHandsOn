package com.thinking.in.java.staticImpl;

public class Cup {
    static String field = "static field";
    Cup(int marker) {
        System.out.println("Cup ("+marker+")");
    }
    static void func() {
        System.out.println("field = " + field);
        System.out.println("field of class = " + field);
    }
    static {
        field = "static field in static block";
        func();
    }

    public static void main(String[] args) {
        Cup cup1 = new Cup(1);
    }

}

class Cups{

    static Cup cup;

    public static void main(String[] args) {
    }
}

class ExplicitStatic{
    public static void main(String[] args) {
    Cup.func();

    }
}
