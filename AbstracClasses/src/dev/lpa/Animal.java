package dev.lpa;

abstract class Mammal extends Animal {

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.print(getExplicitType() + " ");
        System.out.print(speed.equals("slow") ? "walks" : "runs");
    }


    public abstract void shedHair();
}

public abstract class Animal {

    /**
     * this means subclasses can access directly without a given method
     */
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    /**
     * abstract methods don't have bodies hence no curly braces. cant be declaired with a body.
     * hence subclasses inheriting this method have to declare and implement this methods
     * You also cant have a private abstract method
     */

    public abstract void move(String speed);

    public abstract void makeNoise();

    public final String getExplicitType() {
        return getClass().getSimpleName() + " (" + type + ")";
    }
}
