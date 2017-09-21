package com.puzzles.problems;

/* 
 * input = 5
 * output :
 * 5 4 3 2 *
 * 5 4 3 * 1
 * 5 4 * 2 1
 * 5 * 3 2 1
 * * 4 3 2 1 
 * */
public class Pattern {
 
	public static void main(String[] args) {
		for(int rowCounter = 0; rowCounter < 5; rowCounter++){
			for(int colCounter = 0; colCounter <= rowCounter ; colCounter++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
