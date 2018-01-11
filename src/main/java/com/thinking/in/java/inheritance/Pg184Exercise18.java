package com.thinking.in.java.inheritance;

import java.util.Random;

/*Exercise 18: (2) Create a class with a static final field and a final field and
demonstrate the difference between the two.*/
public class Pg184Exercise18 {
    private String name;
    public Pg184Exercise18(String s) { name = s;  }

    public static final String SFS = "Jasleen";
    final String fs ="Arora";

    public static final Test sft = new Test();
    public final Test ft = new Test();

    private static Random rand = new Random();
    static final int SFI = rand.nextInt(); // class constant
    private final int fi = rand.nextInt();

    public String toString() {
        return (name + ": " + sft + ", " + ft + ", " + SFS + ", " + fs + ", " + SFI + ", " + fi);
    }
    public static void main(String[] args) {
        Pg184Exercise18 obj1 = new Pg184Exercise18("obj1");
        Pg184Exercise18 obj2 = new Pg184Exercise18("obj2");
        Pg184Exercise18 obj3 = new Pg184Exercise18("obj3");
        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);
        System.out.println("obj3 = " + obj3);
    }
}
class Test{
    public Test() {
        System.out.println("Test()");
    }

    @Override
    public String toString() {
        return "Test";
    }
}
