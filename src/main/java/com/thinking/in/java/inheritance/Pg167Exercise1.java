package com.thinking.in.java.inheritance;

/*
*  Create a simple class. Inside a second class, define a reference to an object
*  of the first class. Use lazy initialization to instantiate this object.
* */
public class Pg167Exercise1 {
    private int i;
    private String str;

    /* 2. In the constructor for that class. */
    public Pg167Exercise1(int i, String str) {
        this.i = i;
        this.str = str;
    }

    public Pg167Exercise1() {
    }

    @Override
    public String toString() {
        return "Pg167Exercise1{" +
                "i=" + i +
                ", str='" + str + '\'' +
                '}';
    }
}
/*  COMPOSITION   */
class Class2{

// If you want the references initialized, you can do it:

    /* 1. At the point the objects are defined. This means that they’ll always be initialized
    before the constructor is called.*/
    private Pg167Exercise1 pg167Exercise1 ;//= new Pg167Exercise1();




    /* 3. Right before you actually need to use the object. This is often called lazy
        initialization. It can reduce overhead in situations where object creation is expensive
        and the object doesn’t need to be created every time.*/
    @Override
    public String toString() {
        if (pg167Exercise1 == null) {
            pg167Exercise1 = new Pg167Exercise1(1, "Object initialized"); // lazy (delayed) initialization:
        }
            return "" + pg167Exercise1;

    }

    /*4. Using instance initialization.*/
    private int j = 10;

    public static void main(String[] args) {
        Class2 object2 = new Class2();
        System.out.println("object2 = " + object2);
    }

}
