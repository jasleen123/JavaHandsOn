package com.puzzles.problems.coding.ninja;

/*
* Check whether the number can be sum of 2 even numbers or not
* */
public class EvenSum {

    public static boolean checkSumEvenOrNot(int num){
        int sum = 0;
        for (int n1 = 0,n2 = num; n1 <= num ; n1++,n2--) {
            sum = n1 + n2;
            if(sum == num && n1%2 ==0 && n2%2==0){
                return true;
            }
            continue;
        }
        return false;
    }




    public static void main(String[] args) {
        System.out.println("For 10 : " + checkSumEvenOrNot(10));
        System.out.println("For 9 : " + checkSumEvenOrNot(9));
        System.out.println("For 8 : " + checkSumEvenOrNot(8));
    }
}
