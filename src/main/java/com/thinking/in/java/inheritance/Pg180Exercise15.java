package com.thinking.in.java.inheritance;

public class Pg180Exercise15 {
    public static void main(String[] args) {
        Inherited childObject = new Inherited();
        childObject.printName("JASLEEN");
    }
}
class Protected{
    private String name;
    protected void setName(String name){
        this.name = name;
    }
}
class Inherited extends Protected{
     private String name;
     public void printName(String name){
         setName(name);
         System.out.println("name = " + name);
     }
}