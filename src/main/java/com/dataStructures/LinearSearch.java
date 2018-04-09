package com.dataStructures;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        Random r = new Random(42);

        for (int item = 1; item < array.length; item++) {
            array[item] = item;
        }

        System.out.println("Enter item to be searched : ");
        int input = sc.nextInt();
        int search = r.nextInt(10) + 1;

        System.out.println(search);

        searchItem(array, input, search);
    }

    public static void searchItem(int[] array, int input, int search) {
        for (int index = 0; index < array.length; index++) {
            if (search == array[index])
                System.out.println("Search item " + search + " found at position " + index);
            if (input == array[index])
                System.out.println("Input item " + input + " found at position " + index );
        }

    }
}
