package dev.lpa;

enum UtilityType {ELECTRICAL, FIBER_OPTIC, GAS, WATER}

public class UtilityLine implements Mappable {

    private String name;

    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + " (" + type + ")";
    }

    @Override
    public String getMarker() {
        return switch (type) {
            case ELECTRICAL -> Colour.RED + " " + LineMarker.DASHED;
            case FIBER_OPTIC -> Colour.GREEN + " " + LineMarker.DOTTED;
            case GAS -> Colour.ORANGE + " " + LineMarker.SOLID;
            case WATER -> Colour.BLUE + " " + LineMarker.SOLID;
            default -> Colour.BLACK + " " + LineMarker.SOLID;
        };
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "type": "%s"
                 """.formatted(name, type);
    }
}
