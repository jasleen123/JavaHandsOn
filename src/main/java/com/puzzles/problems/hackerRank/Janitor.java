package com.puzzles.problems.hackerRank;


class Employee {
    public int getHours() {
        return 40;           // works 40 hours / week
    }

    public double getSalary() {
        return 40000.0;      // $40,000.00 / year
    }

    public int getVacationDays() {
        return 10;           // 2 weeks' paid vacation
    }

    public String getVacationForm() {
        return "yellow";     // use the yellow form
    }
}

class Secretary extends Employee {
    public void takeDictation(String text) {
        System.out.println("Taking dictation of text: " + text);
    }
}

class Lawyer extends Employee {
    public int getVacationDays() {
        return super.getVacationDays() + 5;           // 3 weeks vacation
    }

    public String getVacationForm() {
        return "pink";
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
}

class LegalSecretary extends Secretary {
    public double getSalary() {
        return super.getSalary() + 5000.0;      // $45,000.00 / year
    }

    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }
}

/**
 * write a class janitor to accompany the other employees. janitors work twice as many hours (80 hours/week), they make
 * $30,000 ($10,000 less than others), they get half as much vacation (only 5 days), and they have an additional method
 * named clean that prints "workin' for the man." (  icon solution - don't peek!)
 */
public class Janitor extends LegalSecretary {
    public int getHours() {
        return super.getHours() * 2;  //80 hours/week
    }
    public double getSalary() {
        return super.getSalary() - 15000.0;           // $10,000.00 less than others / year
    }
    public int getVacationDays() {
        return super.getVacationDays()/2;           // 2 weeks' paid vacation
    }
    public void clean(){
        System.out.println("workin' for the man.");
    }
}
class Main{
    public static void main(String[] args) {
        Janitor j = new Janitor();
        System.out.println(j.getHours());
        System.out.println(j.getSalary());
        System.out.println(j.getVacationDays());
    }
}

