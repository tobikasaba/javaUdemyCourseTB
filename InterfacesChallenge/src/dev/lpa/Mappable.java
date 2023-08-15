package dev.lpa;


enum Geometry {POINT, LINE, POLYGON}

enum Colour {BLACK, BLUE, GREEN, ORANGE, RED}

enum PointMarker {CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE}

enum LineMarker {DASHED, DOTTED, SOLID}

public interface Mappable {

    String JSON_PROPERTY = """
            "properties":{%s}
            """;

    static void mapIt(Mappable mappable) {
        System.out.println(JSON_PROPERTY.formatted((mappable.toJSON())));
//        System.out.printf((JSON_PROPERTY) + "%n", (mappable.toJSON()));
    }

    String getLabel();

    String getMarker();

//    default String toJSON(){
//        return JSON_PROPERTY + getLabel() + getShape() + getMarker();
//    }

    Geometry getShape();

    default String toJSON() {
        return """
                "type": "%s", "label", "%s", "marker": "%s"
                """.formatted(getShape(), getLabel(), getMarker());
    }
}
