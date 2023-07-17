package dev.lpa;

import java.util.Objects;

public class Fish extends Animal{


    public Fish(String type, String size, double weight) {
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
                System.out.println(getExplicitType() + " lazily swimming");
            }else{
                System.out.println(getExplicitType() + " darting frantically");
            }
    }

    @Override
    public void makeNoise() {
        if (type == "Goldfish") {
            System.out.print("swish! ");
        }else {
            System.out.print("splash ");
        }
    }
}
