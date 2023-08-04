package dev.lpa;
interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();
}
interface FlightEnabled {
    /*any fields declared on an interface are not instance fields, they are explicitly constant, public, final and static*/
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
enum FlightStages implements Trackable {GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if(this!= GROUNDED){
            System.out.println("Monitoring " + this);
        }
    }
}
/**
 * Normally, records don't have a body but because this record implements the FlightEnabled interface,
 * it has to override the abstract methods in the interface*/
record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
class Satellite implements OrbitEarth {

    public void achieveOrbit() {
        System.out.println("Orbit achieved");
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
}

public abstract class Animal {

    public abstract void move();

}