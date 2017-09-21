package com.udacity.tutorials.loops;

//BlueJ project: lesson6/dice
//In the cast method, call the nextInt method and return a
//random value between 1 and sides

import java.util.Random;

/**
This class models a die that, when cast, lands on a random
face.
*/
public class Die
{
 private Random generator;
 private int sides;

 /**
    Constructs a die with a given number of sides.
    @param s the number of sides, e.g. 6 for a normal die
 */
 public Die(int s)
 {
     sides = s;
     final int SEED = 42;
     generator = new Random(SEED);
 }
public Die(){}
 /**
    Simulates a throw of the die
    @return the face of the die
 */
 public int cast()
 {
	 return 1 + generator.nextInt(sides);
 }
 
 public void seedImpl(){
	 generator = new Random();
	 System.out.println(generator);
	 System.out.println(generator.nextInt());
	 System.out.println(generator.nextInt(6)+1);
	 
	 generator = new Random(20);
	 System.out.println(generator.nextInt(6)+1);
 }
 
 
 public static void main(String[] args) {
	Die die = new Die();
	die.seedImpl();
 }
}
