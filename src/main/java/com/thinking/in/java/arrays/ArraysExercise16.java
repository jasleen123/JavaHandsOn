package com.thinking.in.java.arrays;

import java.util.Arrays;

public class ArraysExercise16 {
    public static void main(String[] args) {
//        Random random = new Random();
        String[] stringObjects = {new String("H"), "E","L","L","O"};
        System.out.println("stringObjects length = " + stringObjects.length);
        for (String s : stringObjects) {
            System.out.print(s +" ");
        }

        String line = "Hello world !";
        String[] strings = new String[line.length()];
            for (int i = 0; i <line.length() ; i++) {
                strings[i] = line.substring(i,i+1);
            }
        System.out.println();
        for (String s : strings) {
            System.out.print(s +" ");
        }
        System.out.println("\nStrings in array form = " + Arrays.toString(strings));

    }
}
