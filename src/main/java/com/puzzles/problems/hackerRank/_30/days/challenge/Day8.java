package com.puzzles.problems.hackerRank._30.days.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class Day8 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }

        while (in.hasNext()) {
           String s = in.next();
           if((phoneBook.containsKey(s))){
               System.out.println(s + " = "+ phoneBook.get(s));
           }
           else
               System.out.println("not found");
        }
        in.close();
    }
}
