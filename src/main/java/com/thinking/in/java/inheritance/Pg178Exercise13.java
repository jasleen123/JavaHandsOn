package com.thinking.in.java.inheritance;

public class Pg178Exercise13 {
    public static void main(String[] args) {
        Overload child = new Overload();
        child.print(345);
        child.print("Jasleen");
        child.print(6f);
        child.print(true);
    }
}
class Threeway{
    public void print(int num){
        System.out.println(num);
    }
    public void print(String name){
        System.out.println(name);
    }
    public void print(float fnum){
        System.out.println(fnum);
    }
}

class Overload extends Threeway{
    public void print(boolean b){
        System.out.println(b);
    }
}
