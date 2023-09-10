package dev.lpa;

public abstract class Point implements Mappable {

    String name;
    String type;
    String location;

    public Point(String name, String type, String location) {
        this.name = name;
        this.type = type;
        this.location = location;
    }

    @Override
    public void render() {
        System.out.printf("Render " + this.name + " as POINT (" + location + ")\n");
    }
}
