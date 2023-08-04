package dev.lpa;


interface FlightEnabled {

    /*any fields declared on an interface are not instance fields, they are explicitly constant, public and static*/
    double MILES_TO_KM = 1.60934;

    double KM_TO_MILES = 0.621371;


    /*
     * abstract modifier is implicitly declared for all interfaces, has this doesn't have to be declared
     * any method declared without a body is implicitly declared abstract
     */

    void takeOff();

    void land();

    void fly();
}

interface Trackable {

    void track();

}

public abstract class Animal {

    public abstract void move();

}