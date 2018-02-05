package com.puzzles.problems.hackerRank;

class Car{
    public void m1() {
        System.out.println("car 1");
    }

    public void m2() {
        System.out.println("car 2");
    }

    public String toString() {
        return "vroom";
    }
}
class Truck extends Car {
    public void m1() {
        System.out.print("truck 1");
    }

    public void m2() {
        super.m1();
    }

    public String toString() {
        return super.toString() + super.toString();
    }
}
public class MonsterTruck extends Truck {
    public void m1(){
        System.out.println("monster 1");
    }
    public void m2() {
        super.m1();
        super.m2();
    }
    public String toString() {
        return "monster "+super.toString();
    }
}
class AutoMain{
    public static void main(String[] args) {
        MonsterTruck bigfoot = new MonsterTruck();
        bigfoot.m1();                  // monster 1
        bigfoot.m2();                  // truck 1 / car 1
        System.out.println(bigfoot);   // monster vroomvroom
    }
}
