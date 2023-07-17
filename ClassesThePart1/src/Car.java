public class Car {

    void Make (int amount, String okay){
        int a = amount;
        String b = okay;
    };
    //fields
    private String make = "Tesla";
    private String model = "Model X";
    private String colour = "Grey";
    private int doors = 2;
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

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    //    this is a setter method hence we are
    public void setMake(String make) {
        if (make == null) {
            make = "Unknown";
        }
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported ";
            }
        }
    }


    public void describeCar() {
        System.out.println(doors + "-Door " + colour + " " + make + " " + model + " " + (convertible ? "Convertible" : " "));
    }
}
