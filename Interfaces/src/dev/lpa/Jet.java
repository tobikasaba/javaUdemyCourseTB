package dev.lpa;

public class Jet implements FlightEnabled, Trackable{

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
        System.out.println(this.getClass().getSimpleName() + " i am testing track");
    }

    @Override
    public FlightStages transition(FlightStages stage) {
        System.out.println(getClass().getSimpleName() + " transitioning");
//        return FlightStages.CRUISE;
        return FlightEnabled.super.transition(stage);
    }
}
