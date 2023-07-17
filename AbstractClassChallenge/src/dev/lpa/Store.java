package dev.lpa;

import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product) {
}

public class Store {
    static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        Juice juice = new Juice("Orange juice", 2.50,
                "Refreshment");
        System.out.println("The price of the juice is " + juice.getSalesPrice(2));
        juice.showDetails();

        storeProducts.add(new Juice("5Alive", 10, "Orange juice"));
        storeProducts.add(new Juice("Ribena", 5, "Blackberry juice"));


//        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 0, 2);
        addItemToOrder(order1, 1, 6);
        printOrder(order1);
//        addItem(juice);
    }

//    public static void addItem(ProductForSale item) {
//        products.add(item);
//    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {
        order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));
    }

//    public static void listProducts() {
//        for (var item : storeProducts) {
//            System.out.println("-".repeat(30));
//            item.showDetails();
//        }
//    }

    public static void printOrder(ArrayList<OrderItem> order) {

        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedLineItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }

}
