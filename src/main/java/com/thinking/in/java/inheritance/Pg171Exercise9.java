package com.thinking.in.java.inheritance;
/* Exercise 9: (2) Create a class called Root that contains an instance of each of the classes
(that you also create) named Component1, Component2, and Component3. Derive a
class Stem from Root that also contains an instance of each “component.” All classes should
have default constructors that print a message about that class.  */
public class Pg171Exercise9 {
}
class Root{
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();

    Root(){
        System.out.println("Root");
    }
}
class Component1{
    public Component1() {
        System.out.println("Component 1");
    }
}
class Component2{    public Component2() {
    System.out.println("Component 2");
}}
class Component3{    public Component3() {
    System.out.println("Component 3");
}}

class Stem extends Root{
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();

    public Stem() {
        System.out.println("Stem");
    }

    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}