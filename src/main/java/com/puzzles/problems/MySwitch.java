package com.puzzles.problems;

public class MySwitch
{
    public static void main(String[] args)
    {
        int x = 2;
        switch(x)
        {
            case 1:
                x += 2;
                break;
            case 2:
                x++;
                break;
            case 3:
                x += 4;
                break;
            default:
                x += 2;

        }
        System.out.print(x);
    }
}