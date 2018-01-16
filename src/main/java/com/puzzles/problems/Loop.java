package com.puzzles.problems;

public class Loop
{
    public static void main(String[] args)
    {
        for (int i = 1; i < 7; i++)
        {
            if (i == 2 || i == 5)
            {
               continue;
            }
            System.out.print(i);
        }
    }
}