public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

//        because getBrewMaster returns brewMASTER which is an object of type CoffeeMaker
//        thats why you can call methods in the CoffeeMaker class
//        kitchen.getBrewMaster().setHasWorkToDo(false);

//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();


        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }

}