package dev.lpa;

public class Bird extends Animal implements FlightEnabled, Trackable{


    @Override
    public void move() {
        System.out.println("Flaps Wings");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void track() {

    }
}
