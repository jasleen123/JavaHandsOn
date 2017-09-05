package com.udacity.tutorials.loops;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LargestInFile {
public static void main(String[] args) throws FileNotFoundException{
	String filename = "C:/Local_Disk(D)/java/testTextFile.txt";
	File file = new File(filename);
	Scanner in = new Scanner(file);
	double largest = in.nextDouble();
	while(in.hasNextDouble()){
		double input = in.nextDouble();
		if(input > largest){
			largest = input;
		}
	}
	System.out.println("Largest number in file : " + largest);
			}
}
