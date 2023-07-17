import java.util.Objects;

public class Dog extends Animal {

//    public Dog(String type, String size, int weight) {
//        super(type, size, weight);
//    }

    private String earShape;

    private String tailShape;

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }


    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight, String earShape,
               String tailShape) {

        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {
        if (Objects.equals(type, "Wolf")) {
            System.out.println("Ow Woooooo");
        }else {
            bark();
            System.out.println();
        }

    }

    @Override
    public void move(String speed) {
        super.move(speed); // calls the move method in the animal class
//        System.out.println("Dogs walk, run and wag their tail");
        if (Objects.equals(speed, "slow")) {
            walk();
            wagTail();
        } else {
            run();
            bark();

        }
    }

    private void bark() {
        System.out.println("Woof!");
    }

    private void run() {
        System.out.println("Dog Running");
    }

    private void walk() {
        System.out.println("Dog Walking");
    }

    private void wagTail() {
        System.out.println("Tail Wagging");
    }
}
