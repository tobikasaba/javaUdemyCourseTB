package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;


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
        List<String> value = new ArrayList<>();
//        value.add(0, this.name);
//        value.add(1, "" + this.hitPoints);
//        value.add(2, "" + this.strength);
        value.add(0, name);
        value.add(1, String.valueOf(hitPoints));
        value.add(2, String.valueOf(strength));
        value.add(3, weapon);
        return value;
    }

    @Override
    public void read(List<String> values) {
        if (values.size() > 0 && values != null) {
            values.add(0, name);
            values.add(1, String.valueOf(hitPoints));
            values.add(2, String.valueOf(strength));
            values.add(3, weapon);
        }
    }

    @Override
    public String toString() {
        return """
                Player{name = '%s', hitPoints = %s, strength = %s, weapon = '%s'
                """.formatted(getName(), getHitPoints(), getStrength(), getWeapon());
    }
}
