package com.thinking.in.java.inheritance;
/*Exercise 8: (1) Create a base class with only a non-default constructor, and a derived
class with both a default (no-arg) and non-default constructor. In the derived-class
constructors, call the base-class constructor. */
public class Pg171Exercise8 {
    public static void main(String[] args) {
        Derived d = new Derived();
        Derived d2 = new Derived(9790);
    }
}

class Base{
    int value;
    public Base(int value) {
        this.value = value;
        System.out.println("Base value = " + value);
    }
}

class Derived extends Base{
    public Derived(int value) {
        super(value);
        System.out.println("Derived value = " + value);
    }

    public Derived() {
        super(586);
        System.out.println("Derived value = " + value);
    }
}
