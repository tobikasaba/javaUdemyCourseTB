public class Car {

//fields
    private String make = "Tesla";
    private String model = "Model X";
    private String colour = "Grey";
    private int doors =  2;
    private boolean convertible = true;

//    return the type that the field is which is a String, getter the name is get followed by the field name
//    i.e get make and the return the field
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-Door " +
                colour + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : " "));
    }
}
