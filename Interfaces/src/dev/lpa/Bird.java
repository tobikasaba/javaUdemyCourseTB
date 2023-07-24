package dev.lpa;

public class Bird extends Animal implements FlightEnabled, Trackable{


    @Override
    public void move() {
        System.out.println("Flaps Wings");
    }

    @Override
    public void takeOff() {
        System.out.println(this.getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(this.getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + "'s coordinate recorded'");
    }

    @Override
    public void track() {

    }
}
