package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        Player bob = new Player("Tim", "Sword", 10, 15);
        Player bob2 = new Player("Zee", "Hand", 30, 20);
//        System.out.println(bob);

        List<String> toy = new ArrayList<>();
        toy.add(bob.toString());
//        System.out.println(toy);
//        bob.read(toy);
//        System.out.println(bob.read(toy));
        System.out.println("hi " + bob.write());
    }

}