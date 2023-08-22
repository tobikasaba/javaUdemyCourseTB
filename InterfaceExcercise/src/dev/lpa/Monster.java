package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        List<String> storageList = new ArrayList<>();
        storageList.add(0, this.name);
        storageList.add(1, "" + this.hitPoints);
        storageList.add(2, "" + this.strength);
        return storageList;
    }

    @Override
    public void read(List<String> storageList) {
        if (storageList.size() > 0 && storageList != null) {
            storageList.add(toString());
        }
    }

    @Override
    public String toString() {
        return """
                Player{name = '%s', hitPoints = %s, strength = %s'
                """.formatted(getName(), getHitPoints(), getStrength());
    }
}
