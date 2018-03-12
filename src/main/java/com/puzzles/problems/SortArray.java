package com.puzzles.problems;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 0, 2, 1, 1, 2};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) break;
            else if (arr[i] > arr[i++]) arr[i] = arr[i + 1];
        }
    }
}
