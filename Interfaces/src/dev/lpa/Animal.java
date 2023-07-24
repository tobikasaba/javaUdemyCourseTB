package dev.lpa;


interface FlightEnabled {

    /**
     * abstract modifier is implicitly declared for all interfaces, has this doesn't have to be declared
     * any method declared without a body is implicitly declared abstract
     */

    void takeOff();

    void land();

    void fly();
}

interface Trackable{

    void track();


public abstract class  Animal {

    public abstract void move();
}
