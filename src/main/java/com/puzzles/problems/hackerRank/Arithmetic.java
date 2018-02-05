package com.puzzles.problems.hackerRank;

public class Arithmetic{
    int add(int param1, int param2){
        return param1+param2;
    }
    Arithmetic(){

    }
}
class Adder extends Arithmetic{
Adder(){
    System.out.println("My superclass is: "+ getClass().getSuperclass().getSimpleName());
}

}
class MainClass{
    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.print(a.add(21,21));
        System.out.print(" "+a.add(7,6));
        System.out.print(" "+a.add(10,10));

    }
}
