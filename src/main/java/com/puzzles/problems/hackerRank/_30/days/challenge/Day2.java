package com.puzzles.problems.hackerRank._30.days.challenge;

import java.util.Scanner;

import static java.lang.Math.round;

public class Day2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        float tip = (float) (meal_cost * tip_percent / 100);
        float tax = (float) (meal_cost * tax_percent / 100);
        float totalCost = (float) (meal_cost + tip + tax);
        System.out.println("The total meal cost is " + round(totalCost) + " dollars.");
        in.close();
    }
}
