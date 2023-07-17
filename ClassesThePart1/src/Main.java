public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Benz");
        car.setColour("Blue");
        car.describeCar();
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
    }
}
