package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {
    public static void main(String[] args) {
//        here we used object as the array type (instance of) so any type can be added into the object array
//        as you can see the first two items added are of type grocery item but then the last is of type String
//         no error is shown
        Object[] groceriesArray = new Object[3];
        groceriesArray[0] = new GroceryItem("milk");
        groceriesArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceriesArray[2] = "5 oranges";
        System.out.println(Arrays.toString(groceriesArray));

//        here we used GroceryItem as the array type (instance of)  so only types of GroceryItem can be added to
//        here the last line is also of type GroceryItem because another other type introduced will show an error
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

//      similar to the array above, the type of the ArrayList here is not specified so, it uses object as default which
//      takes any type hence it being highlighted
//      this is known as the raw version of ArrayList
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

//      here the type of the ArrayList has been specified
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));
//      indexing with the add method
        groceryList.set(0, new GroceryItem("apples", "PRODUCE", 6));
        System.out.println(groceryList);
    }
}