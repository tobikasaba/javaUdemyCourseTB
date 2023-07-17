package dev.lpa;

public class Juice extends ProductForSale {

    public Juice(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("The item is " + type + " it cost " + price +
                " and used for " + description);
    }
}

