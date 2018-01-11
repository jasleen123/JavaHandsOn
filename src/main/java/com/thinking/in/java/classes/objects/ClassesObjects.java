package com.thinking.in.java.classes.objects;

public class ClassesObjects {

    String str ;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void truncate(String str){
        if(str.length() != 0){

        }
    }

    public static void main(String[] args) {
        ClassesObjects obj1;
        //System.out.println("obj1 = " + obj1);
        ClassesObjects obj2 = new ClassesObjects();
        System.out.println("obj2 = " + obj2.getClass().getConstructors());

    }

}
