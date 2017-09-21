package com.udacity.tutorials.loops;
// lesson6/chevalier_de_mere

import java.util.Random;

public class DiceGame
{
    Random generator;

    public DiceGame()
    {
        generator = new Random(45);
    }
    /**
     * Throw a die four times and bet on at least one 6.
     * @return true if the chevalier wins.
     */
    public boolean game1()
    {
        // YOUR CODE HERE
        // Use the instance variable generator to simulate
        // 4 die rolls.
        // Return true if the chevalier wins (at least one is a 6).
        return false;
    }

    /**
     * Throw two dice 24 times and bet on at least one double-six.
     * @return true if the chevalier wins.
     */
    public boolean game2()
    {
        // YOUR CODE HERE
        // Use the instance variable generator to simulate
        // 24 rolls of a pair of dice.
        // Return true if at least one pair is both 6s.
        return false;
    }
}
