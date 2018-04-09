package com.puzzles.problems.hackerRank._30.days.challenge;

import java.util.Scanner;

public class Day9 {
    static int factorial(int n) {
        int result = 1;
        result = result * factorial(n-1);
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Enter a number between 2-12
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
