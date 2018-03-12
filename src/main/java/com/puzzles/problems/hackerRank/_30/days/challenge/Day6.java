package com.puzzles.problems.hackerRank._30.days.challenge;

import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s[] = new String[t];
        for (int i = 0; i < t; i++) {
            s[i] = sc.next();
        }
        for (int i = 0; i < t; i++) {
            int N = s[i].length();

            for (int index = 0; index < N; index++)
                if (index % 2 == 0)
                    System.out.print(s[i].charAt(index));
            System.out.print(" ");
            for (int index = 1; index < N; index++) {
                if (index % 2 == 1)
                    System.out.print(s[i].charAt(index));
            }
            System.out.println();
        }
    }
}
