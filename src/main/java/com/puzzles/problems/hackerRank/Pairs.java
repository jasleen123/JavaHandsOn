package com.puzzles.problems.hackerRank;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Pairs {
/*    Given  N integers, count the number of pairs of integers whose difference is K    .
# Input Format :
The first line contains N and K.
The second line contains N numbers of the set. All the N numbers are unique.
# Output Format :
An integer that tells the number of pairs of integers whose difference is K.
*/

    public static void main(String[] args) {
        Random in = new Random(42);
        int N = in.nextInt(10)+2;
        int K = in.nextInt(10);

        System.out.println(N +" "+ K);

        int a[] = new int[N];
        int counter=0;
        for (int i = 0; i < a.length; i++) {
            a[i]=in.nextInt(100 )- K;
/*            if()

            if( 0 == K){
                counter++;
            }*/
        }

        System.out.println("a = " + Arrays.toString(a) + " ");
        System.out.println("counter = " + counter);


    }
}
