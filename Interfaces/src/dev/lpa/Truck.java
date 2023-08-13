package dev.lpa;

public class Truck implements Trackable {

    @Override
    public void track() {
        System.out.println(this.getClass().getSimpleName() + "'s coordinate recorded'");
    }
}
