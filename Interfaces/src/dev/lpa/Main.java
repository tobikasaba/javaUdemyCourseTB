package dev.lpa;


public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();

        /*
         * assigning the bird object to different reference types because the Bird class implements/extends them
         * the bird can be referred to with four different types
         */
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
/*
        flier.move();
        tracked.move();
        flier.takeOff();
        flier.fly();
        tracked.track();
        flier.land();
*/

        inFlight(flier);
        inFlight(new Jet ());
        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f kmm or %.2f miles %n", kmsTraveled, milesTraveled);
    }

    private static void inFlight(FlightEnabled flier){

        flier.takeOff();
        flier.fly();
        /* if object (flier) is an instance of Trackable, set up an object called tracked*/
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();

    }
}