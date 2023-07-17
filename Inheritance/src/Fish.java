import java.util.Objects;

public class Fish extends Animal {


    private int gills;

    private int fins;

    //    You can either call a constructor and give it the same type as the super class
    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    //    or give the contsructor specific values that cant be changed later,
//    public Fish() {
//        super("Fast", "Big", 23);
//    }

    private void moveMuscles() {
        System.out.println("muscles moving");
    }

    private void moveBackFin() {
        System.out.println("backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);

        moveMuscles();

        if (Objects.equals(speed, "fast")) {
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}

