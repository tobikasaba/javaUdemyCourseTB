package dev.lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        groceryList();
//        groceries();
    }

    private static void printActions() {

        String textBlock = """
                Available actions:
                             
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }
    /*
    private static void groceries() {
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println(" Add item(s) [separate items by comma]");
        String[] items = scanner.nextLine().split(",");
        for (String item : items) {
            String trimmedItem = item.trim();
            if (!groceries.contains(trimmedItem)) {
                groceries.add(trimmedItem);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.println(" Remove item(s) [separate items by comma]");
        String[] items = scanner.nextLine().split(",");
        for (String item : items) {
            String trimmedItem = item.trim();
            groceries.remove(trimmedItem);
        }
    }

     */

    public static void groceryList() {
        ArrayList<String> groceryList = new ArrayList<>();
        boolean shouldContinue = true;
        while (shouldContinue) {
            printActions();
            String usersCommand = scanner.nextLine();
            switch (usersCommand) {
                case "1" -> addingItems(groceryList);
                case "2" -> removingItems(groceryList);
                case "0" -> shouldContinue = false;
            }
            groceryList.sort(Comparator.naturalOrder());
            System.out.println(groceryList);
        }
    }

    private static void removingItems(ArrayList<String> groceryList) {
        System.out.println("Remove item(s) [separate items by comma]");
        String[] itemList = scanner.nextLine().split(",");
        for (String item : itemList) {
            String trimmedItem = item.trim();
            groceryList.remove(trimmedItem);
        }
    }

    private static void addingItems(ArrayList<String> groceryList) {
        System.out.println("Add item(s) [separate items by comma]");
        String[] itemList = scanner.nextLine().split(",");
        for (String item : itemList) {
            String trimmedItem = item.trim();
            if (!groceryList.contains((trimmedItem))) {
                groceryList.add(trimmedItem);
            }
        }
    }
}