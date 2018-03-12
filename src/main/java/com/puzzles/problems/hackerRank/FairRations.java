package com.puzzles.problems.hackerRank;

import java.util.Scanner;

/* https://www.hackerrank.com/challenges/fair-rations/problem */
public class FairRations {
    static int fairRations(int[] B) {
        int i = 0, minCount = 0;
        boolean flag = false;
        while (i < B.length) {
            if (B[i] % 2 == 0) {
                flag = true;
            } else {
                if (i < B.length - 1) {
                    B[i] = B[i] + 1;
                    B[i + 1] = B[i + 1] + 1;
                    if ((i + 1) == B.length - 1)
                        break;
                    else
                        minCount += 2;
                } else if (i >= B.length - 1) {
                    break;
                }
            }
            i++;
        }
        return minCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Number of Subjects : ");
        int N = in.nextInt();
        int[] B = new int[N];
        for (int B_i = 0; B_i < N; B_i++) {
            B[B_i] = in.nextInt();
        }
        System.out.println("Initial distribution");
        for (int B_i = 0; B_i < N; B_i++)
            System.out.print(B[B_i] + " ");
        int result = fairRations(B);
        if (result == 0)
            System.out.println("NO");
        else
            System.out.println("\n" + result);

        in.close();
    }
}

