package com.puzzles.problems;

/*
public class MyClass
{
    public static void main(String[] args)
    {
        int i = 0;
        int x = 7;
        while(i < 3)
        {
            i++;
            // add your statement here! 641
            x -= i;
            System.out.print(x);
        }

        */
/*int n = 0;
        while (n < 5)
        {
            n++;
            switch (n)
            {
                case 2:
                    System.out.print("a");
                case 3:
                    System.out.print("b");
                case 4:
                    System.out.print("c");
                case 5:
                    System.out.print("d");
                default:
                    System.out.print("e");
                    n +=3;
                    // add your statement here
            }
        }*//*

    }
}

public class MyClass
{
    int i = 2;
    String str;

    MyClass(String str)
    {
        this.str = str;
    }
    int myMethod(int i, String str)
    {
        this.i = i += 2;
        this.str = str;
        return(i + 4);
    }
    public static void main(String[] args)
    {
        MyClass mc = new MyClass("x");
        MyClass mc2 = new MyClass("y");
        // add your statement here! 9x5
        mc.i = mc2.myMethod(3,"x");
        System.out.print(mc.i + mc2.str + mc2.i);
    }
}
*/
public class MyClass
{
    static String str = "p";
    static String str2 = "p";
    static int i = 9;

    MyClass(String str, String str2, int i)
    {
        MyClass.str = str;
        if(!str.equals("4") || !str2.equals("5") || i != 6)
        {
            System.out.print(i);
        }
    }
    public int methodInt(int i)
    {
        MyClass.i = i;
        return i;
    }
    String methodStr(String str)
    {
        MyClass.str2 = str;
        return str2;
    }
    public static void main(String[] args)
    {
        // add your statement here!
        System.out.print(str + str2 + i);
    }
}