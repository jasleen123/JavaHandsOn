package com.puzzles.problems;

import java.util.Scanner;

public class NumbersInWords {

    private int number;
    Scanner in = new Scanner(System.in);

    NumbersInWords() {
        System.out.println("Enter any number");
        this.number = in.nextInt();
    }

    void printNumberInWords(int number) {
        numberInWordsLogic(number);
    }

    void numberInWordsLogic(int number) {
        while (in.hasNextInt()) {
            int remainingNumber = number / 10;
            int lastDigit = number % 10;
        }
    }

    public static void main(String[] args) {
        NumbersInWords obj = new NumbersInWords();
        obj.printNumberInWords(obj.number);
    }


}
