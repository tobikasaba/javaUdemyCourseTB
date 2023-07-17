public class Car {

    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine() {
        return ("Engine " + name + " is starting");
    }

    public String accelerate() {
        return ("Car " + name + " is accelerating");
    }

    public String brake() {
        return ("Car " + getName() + " is braking");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return ("Mitsubishi Engine " + getName());
    }

    @Override
    public String accelerate() {
        return ("Mitsubishi Car " + getName() + " is accelerating");
    }

    @Override
    public String brake() {
        return ("Mitsubishi Car " + getName() + " is braking");
    }
}

class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return ("Holden Engine " + getName());
    }

    @Override
    public String accelerate() {
        return ("Holden Car " + getName() + " is accelerating");
    }

    @Override
    public String brake() {
        return ("Holden Car " + getName() + " is braking");
    }
}

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return ("Ford Engine " + getName());
    }

    @Override
    public String accelerate() {
        return ("Ford Car " + getName() + " is accelerating");
    }

    @Override
    public String brake() {
        return ("Ford Car " + getName() + " is braking");
    }
}