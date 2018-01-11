package com.thinking.in.java.arrays;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        Random random = new Random(42);
        Integer wrapperTypeArray[] = new Integer[random.nextInt(10)+5];
        int[] primitiveTypeArray = new int[wrapperTypeArray.length];
        char primitiveArray2[] =  {'a','c','f','e','f'};
        Character[] wrapperArray2 = new Character[random.nextInt(10)];

        for (int i = 0; i <wrapperTypeArray.length ; i++) {
            primitiveTypeArray[i] = random.nextInt(wrapperTypeArray.length);
            wrapperTypeArray[i]=random.nextInt(wrapperTypeArray.length);
        }

        System.out.println("length of primitiveTypeArray = " + primitiveTypeArray.length);
        System.out.println("primitiveTypeArray = " + java.util.Arrays.toString(primitiveTypeArray));
        System.out.println("length of primitiveTypeArray 2 = " + primitiveArray2.length);
        System.out.println("primitiveTypeArray 2= " + java.util.Arrays.toString(primitiveArray2));
        System.out.println("length of wrapperTypeArray = " + wrapperTypeArray.length);
        System.out.println("wrapperTypeArray = " + java.util.Arrays.toString(wrapperTypeArray));
        System.out.println("length of wrapperArray2 = " + wrapperArray2.length);
        System.out.println("wrapperArray2 = " + java.util.Arrays.toString(wrapperArray2));


        Integer a[] = {new Integer(1),new Integer(2),new Integer(3),4}; //Autoboxing
        System.out.println("a.length = " + a.length);
        System.out.println("a = " + java.util.Arrays.toString(a));
    }
}
