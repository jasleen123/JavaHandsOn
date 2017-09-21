package com.udacity.tutorials.loops;

public class CountElement {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 1, 2, 3 };
		int element = array[0];
		int counter=0;
		boolean flag = false;
			for (int i = 0; i < 10; i++) {
				if (!flag) {
				if(array[i]==element){
					counter++;
					flag = true;
				}
			}
		}
	}
}
