package com.thinking.in.java.staticImpl;

public class StaticExercise14_15 {
    private static String stringField1 = "static field of a class";
    private static String stringField2;
    private String stringField3;
    static {
        System.out.println("static block 1");
          stringField2 = "static field of a class in a static block 1";
    }
    static {
        System.out.println("static block 2");
        stringField2 = "static field of a class in a static block 2";
    }
    static {
        System.out.println("static block 3");
        stringField2 = "static field of a class in a static block 3";
    }
    {
        System.out.println("IIB -1 ");
        stringField3 = "IIB 1 of a class";
    }
    {
        System.out.println("IIB -2 ");
        stringField3 = "IIB 2 of a class";
    }
    void printFields(){
        System.out.println("stringField1 = " + stringField1);
        System.out.println("stringField2 = " + stringField2);
        System.out.println("stringField3 = " + stringField3);
    }
    StaticExercise14_15(){
        System.out.println("dafault constructor");
    }


    public static void main(String[] args) {
       StaticExercise14_15 ob = new StaticExercise14_15();
       ob.printFields();
     //StaticExercise14_15.printFields();
    }
}
