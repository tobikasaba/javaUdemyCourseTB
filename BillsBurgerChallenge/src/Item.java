public class Item {

    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public String getName() {

        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }

        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {
//        %20s used to print out a string and 20 represents how long we want the String to be
//        %6.2f%n. this says we want 6 characters up to the decimal point and precision of 2 ie 2 decimal places
        System.out.printf("%20s:%6.2f%n",  name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }

}
