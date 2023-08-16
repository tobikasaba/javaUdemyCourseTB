package dev.lpa;

import java.awt.*;

enum UsageType {ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS}

public class Building implements Mappable {

    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    /**
     * getMarker method sets up icons determined by the building type. That is, colour and shape
     */
    @Override
    public String getMarker() {
        return switch (usage) {
            case ENTERTAINMENT -> Colour.GREEN + " " + PointMarker.TRIANGLE;
            case GOVERNMENT -> Colour.RED + " " + PointMarker.STAR;
            case RESIDENTIAL -> Colour.BLUE + " " + PointMarker.SQUARE;
            case SPORTS -> Colour.ORANGE + " " + PointMarker.PUSH_PIN;
            default -> Color.BLACK + " " + PointMarker.CIRCLE;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "usage": "%s"
                 """.formatted(name, usage);
    }
}
