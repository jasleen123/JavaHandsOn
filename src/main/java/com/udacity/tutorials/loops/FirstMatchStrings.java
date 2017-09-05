package com.udacity.tutorials.loops;
//Bluej project: finding_the_first_match

//Write a program that finds the first word in Alice In Wonderland
//that is longer than a given number of characters.

//Bluej project: lesson6/position_of_first_match
//Write a program that finds the first word in Alice In Wonderland
//that is longer than 9 characters, and if there are no words
//that long, prints "There are no long words".

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FirstMatchStrings {
	public void firstMatchOfBiggerThreshold() throws FileNotFoundException{
	    Scanner in = new Scanner(new FileReader("C:/Local_Disk(D)/java/testTextFile.txt"));
	    
	}
	 public static void main(String[] args) throws java.io.FileNotFoundException
	    {
	        Scanner in = new Scanner(new FileReader("C:/Local_Disk(D)/java/testTextFile.txt"));
	        String longWord = "";
	        boolean found = false;
	        final int THRESHOLD = 5;
	        int position = -1;
	        // TODO: Write a loop that searches for long words
	        // (more than THRESHOLD letters)
	        // The loop should stop if you find one or if you run out of words
	        while(in.hasNext() && !found){
	            String word = in.next();
	            if(word.length() < THRESHOLD){
	                longWord = word;
	                found = true;
	            }
	            position++;
	        }
	        System.out.println("The first long word is: " + longWord + " is at positon "+position);
	    }
	}