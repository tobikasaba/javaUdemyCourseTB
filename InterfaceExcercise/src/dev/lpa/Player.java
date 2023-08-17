package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    List<String> storageList = new ArrayList<>();
    public Player(String name, String weapon, int hitPoints, int strength) {
        this.name = name;
        this.weapon = weapon;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        return null;
    }

    @Override
    public void read(List<String> storageList) {
        if (storageList.size()>0 && storageList!=null){
            storageList.add(toString());
        }
        System.out.println("it's "  + storageList.size());
    }

    @Override
    public String toString() {
        return """
                Player{name = '%s', hitPoints = %s, strength = %s, weapon = '%s'
                """.formatted(getName(),getHitPoints(),getStrength(),getWeapon());
    }
}
