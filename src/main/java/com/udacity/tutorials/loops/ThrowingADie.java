package com.udacity.tutorials.loops;

// lesson6/throwing_a_die
// A program that simulates tossing a die 100 times.
// It prints the number of times you roll a 6.

import java.util.Random;

public class ThrowingADie
{
    public static void main(String[] args)
    {
        // This line initializes the generator and gives it 42 as a "seed."
        // The generator will generate a sequence of numbers that
        // look random, but if you create another generator and seed
        // it with 42, it will generate the same sequence.
        // DO NOT CHANGE THIS LINE
        Random generator = new Random(42);

        // YOUR CODE HERE
        // Use a loop to roll a die 100 times.
        int counter=0;
        for(int rollCount=0;rollCount<100;rollCount++){
            // Count how many sixes you see, and print the number of
            // 6's at the end.
            int rollValue = 1 + generator.nextInt(6);
            if(rollValue == 6){
             counter++;
            }
        }
        System.out.println("6 appears " + counter + " times when die is rolled 100 times");
        // Hint: if you're not sure how to simulate rolling a die,
        // check out the fact sheet on generating random numbers.

    }
}
