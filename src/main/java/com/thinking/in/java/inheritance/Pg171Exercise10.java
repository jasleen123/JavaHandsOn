package com.thinking.in.java.inheritance;
/*
Exercise 10: (1) Modify the previous exercise so that each class only has non-default constructors.
*/
public class Pg171Exercise10 {
    public static void main(String[] args) {
        Stem10 stem = new Stem10(" exercise 10");
    }
}
class Root10{
    Component10 component1 = new Component10("10");
    Component20 component2 = new Component20("20");
    Component30 component3 = new Component30("30");

    Root10(String str){
        System.out.println("Root" + str);
    }
}
class Component10{
    public Component10(String str) {
        System.out.println("Component 1"+ str);
    }
}
class Component20{    public Component20(String str) {
    System.out.println("Component 2"+ str);
}}
class Component30{    public Component30(String str) {
    System.out.println("Component 3"+ str);
}}

class Stem10 extends Root10{
    Component10 component1 = new Component10("10");
    Component20 component2 = new Component20("20");
    Component30 component3 = new Component30("30");

    public Stem10(String str) {
        super(str);
        System.out.println("Stem" + str);
    }
}