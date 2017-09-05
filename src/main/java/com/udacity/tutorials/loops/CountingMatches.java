package com.udacity.tutorials.loops;

import java.util.Scanner;

public class CountingMatches {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a any number, press Q to exit");
	int counter = 0;
	double value = in.nextDouble();
	while(in.hasNextDouble()){
		value = in.nextDouble();
		if(value <0){
			counter ++;
		}
	}
	System.out.println("counter : " +counter);
}
}
