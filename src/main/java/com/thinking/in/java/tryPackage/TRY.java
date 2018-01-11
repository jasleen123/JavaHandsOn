package com.thinking.in.java.tryPackage;

public class TRY extends  Vehicle{
    public static void main(String[] args) {
        Line[] lines = new Line[3];  // array of type
        for (int index = 0; index < lines.length; index++) {
            lines[index] = new Line(5);
        }

            }
}
class Shape{
    public Shape() {
        System.out.println("Shape Constructor");
    }
}
class Line extends Shape{
    int start;
    public Line(int start) {
        super();
        this.start = start;
        System.out.println("Line Constructor : " + start);
    }
}

class Vehicle
{
    int id = 120;
    public int getId()
    {
        return id;
    }
}
class Car extends Vehicle
{
    int id = 100;
    public int getId()
    {
        return(id - 20);
    }
    public static void main(String[] args)
{
        Vehicle vc = new Car();
        Car car = (Car) vc;
        System.out.print(vc.id + ", " + vc.getId() + ", ");
        System.out.print(car.id + ", " + car.getId());
    }
}
