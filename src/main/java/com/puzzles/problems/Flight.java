package com.puzzles.problems;

public class Flight {
    private int passengers;
    private int seats;

    public boolean hasRoom(Flight flight) {
        int total = passengers + flight.passengers;
        if (total <= seats)
            return true;
        else
            return false;
    }

    public void addPassengers(Passenger[] passengersList) {
    }
    public void addPassengersVarArgs(Passenger... passengersList) {  // this provides flexibility to use an array without creating an array by using varargs
    }

    public static void main(String[] args) {
        Passenger p1 = new Passenger();
        Passenger p2 = new Passenger();

        Flight f = new Flight();
        f.addPassengers(new Passenger[]{p1,p2});
        f.addPassengersVarArgs(p1,p2);
    }

}
class Passenger{

}
