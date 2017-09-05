package com.puzzles.problems;

import java.util.Scanner;

public class Power {
	
	static double findPowerOfNumberUsingWhileLoop(double number, double power){
		double result = 1;
		if(power == 0){
			result = 1;
			}
		else if(power != 0)
		{	int counter = 1;
			while(counter <= power ){
				result = result * number;
				counter++;
			}
		}
		return result;
	} 
	
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number : ");
	double number = in.nextDouble();
	System.out.println("Enter the power : ");
	double power = in.nextDouble();
	double result = findPowerOfNumberUsingWhileLoop(number, power);
	System.out.println("Number "+number+" raised to the power " +power+" gives result "+result);
}
}
