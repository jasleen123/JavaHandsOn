package com.puzzles.problems.DzoneQuiz;


public class MyClass2
{
    public static void myMethod(StringBuilder s1, StringBuilder s2)
    {
        s1.append("r");
        s2.append("s");
        s1 = s2;
    }
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("p");
        StringBuilder sb2 = new StringBuilder("q");
        myMethod(sb, sb2);
        System.out.print(sb + ", " + sb2);
    }
}