package com.udacity.tutorials.loops;

import java.util.Scanner;

public class Largest {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a number, press Q to quit");
	double largest = in.nextDouble();
	while(in.hasNextDouble()){
		
		double input = in.nextDouble();
		if(input>largest){
			largest = input;
		}
	}
	System.out.println("Largest number is : "+largest);
}
}
