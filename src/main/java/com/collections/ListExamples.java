package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {

    static void arrayList(){
        System.out.println("*****  Array List  *****");
        List list1 = new ArrayList();
        System.out.println("initial list1 size() = " + list1.size());
        list1.add(0, "Jasleen");
        list1.add(1, 1);
        list1.add(2, "Jasleen");
        list1.add(3, "Jasleen1");
        list1.add(4, "Jasleen2");
        list1.add(5, "Jasleen3");

        System.out.println("list1 = " + list1.get(2));
        System.out.println("list1.size() = " + list1.size());
        list1.remove(0);
        System.out.println("list1 after deletion= " + list1.get(2));
        System.out.println("list1.size() = " + list1.size());
    }

    static void linkedList(){
        System.out.println("\n*****  Linked List  *****");
        List list2 = new LinkedList();
        System.out.println("initial list2 size() = " + list2.size());
        list2.add(0, "Jasleen");
        list2.add(1, 1);
        list2.add(2, "Jasleen");
        list2.add(3, "Jasleen1");
        list2.add(4, "Jasleen2");
        list2.add(5, "Jasleen3");

        System.out.println("list2 = " + list2.get(2));
        System.out.println("list2.size() = " + list2.size());
        list2.remove(0);
        System.out.println("list2 after deletion= " + list2.get(2));
        System.out.println("list2.size() = " + list2.size());
    }

    public static void main(String[] args) {
        arrayList();
        linkedList();

    }
}
