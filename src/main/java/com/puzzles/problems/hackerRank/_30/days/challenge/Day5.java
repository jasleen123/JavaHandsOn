package com.puzzles.problems.hackerRank._30.days.challenge;

import java.util.Scanner;
//Loops
public class Day5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
