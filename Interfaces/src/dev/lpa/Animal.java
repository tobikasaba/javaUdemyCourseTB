package dev.lpa;

interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();

    /*making a method private static in an interface means it can only be used by concrete methods in the interface*/
    private static void log(String description) {

        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    /*private method can only be used from either another private method or a default method*/
    private void logStage(FlightStages stage, String description) {
        description = stage + ": " + description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, " Beginning Transition to " + nextStage);
        return nextStage;
    }
}

interface FlightEnabled {
    /*any fields declared on an interface are not instance fields, they are explicitly constant, public, final and static*/ double MILES_TO_KM = 1.60934;

    double KM_TO_MILES = 0.621371;

    /*
     * abstract modifier is implicitly declared for all interfaces, has this doesn't have to be declared
     * any method declared without a body is implicitly declared abstract
     */
    void takeOff();

    void land();

    void fly();

    //    abstract  method
    default FlightStages transition(FlightStages stage) {
//        System.out.println("transition not implemented on " + getClass().getName());
//        return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }
}

interface Trackable {
    void track();
}

enum FlightStages implements Trackable {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage() {
        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }
}

/**
 * Normally, records don't have a body but because this record implements the FlightEnabled interface,
 * it has to override the abstract methods in the interface
 */
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
    FlightStages stage = FlightStages.GROUNDED;

    public void achieveOrbit() {
        transition("Orbit achieved");
    }

    @Override
    public void takeOff() {
        transition("Taking Off");
    }

    @Override
    public void land() {
        transition("Landing");
    }

    @Override
    public void fly() {

        achieveOrbit();
        transition("Data Collection while Orbiting");
    }

    @Override
    public String toString() {
        return "Class " + this.getClass().getSimpleName();
    }

    public void transition(String description) {
        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }
}

public abstract class Animal {

    public abstract void move();

}