package dev.lpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("animal", "big", 100) {}; animal doesnt compile because you cant create insatnces of an abstract class

        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);

/**
 * Because Class Dog and Fish extend (inherit)  the animal class, we can put the Animal class as the type of the arrayList
 * if we were to put either Dog or Fish we would need two arrayLists.
 */
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Barracuda", "big", 75));
        animals.add(new Dog("Pug", "small", 20));

        animals.add(new Horse("Clydesdale", "large", 1000));


        for (Animal animal: animals){
            doAnimalStuff(animal);
            /**
             * if statement checks if the animal variable is an instance of the mammal class
             * If it is, it creates a new variable called currentMammal i.e currentMammal = animal
             * Then it calls the shedHair method on the new variable
             */
            if (animal instanceof Mammal currentMammal) {
                currentMammal.shedHair();
            }
        }

    }

    /**
     * Even though you can't create an instance of the Animal class because its abstract,
     * you can use it in methods, declarations and lists.
     *
     * @param animal
     */
    private static void doAnimalStuff(Animal animal) {

        animal.makeNoise();
        animal.move("slow");
    }
}