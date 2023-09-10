package dev.lpa;

public abstract class Line implements Mappable {

    String name;
    String type;
    String location;

    public Line(String name, String type, String location) {
        this.name = name;
        this.type = type;
        this.location = location;
    }

    @Override
    public void render() {
        System.out.printf("Render " + this.name + " as Line (" + location + ")\n");
    }
}
