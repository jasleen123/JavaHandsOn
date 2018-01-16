package com.puzzles.problems;

public class MySuper
{
    int m = 3;

    public MySuper()
    {
        myMethod();
    }
    void myMethod()
    {
        System.out.print("-x" + m);
    }
}

class MySub extends MySuper
{
    int n = 2;

    void myMethod()
    {
        System.out.print("-x" + n);
    }
    public static void main(String[] args)
    {
        MySub mySub = new MySub();
    }
}