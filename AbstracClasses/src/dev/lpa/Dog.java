package dev.lpa;

import java.util.Objects;

public class Dog extends Mammal{


    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    /**
     * Because the animal class is an abstact class and the move is an abstract method, the method is declared here and overriden
     *
     * @param speed
     */
    @Override
    public void move(String speed) {
            if (Objects.equals(speed, "slow")){
                System.out.println(getExplicitType() + " walking");
            }else{
                System.out.println(getExplicitType() + " running");
            }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " shed hair all the time");
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.print("Howling! ");
        }else {
            System.out.print("Woof! ");
        }
    }

}
