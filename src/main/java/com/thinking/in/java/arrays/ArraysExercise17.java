package com.thinking.in.java.arrays;

public class ArraysExercise17 {
    private String string = "xyz";

    ArraysExercise17() {
        System.out.println("string = " + string);
    }

    ArraysExercise17(String stringArgument) {
        string = stringArgument;
        System.out.println("string = " + string);
    }

    public static void main(String[] args) {
        ArraysExercise17[] classObjects = {new ArraysExercise17("first"), new ArraysExercise17("second"), new ArraysExercise17( )};

    }
}
