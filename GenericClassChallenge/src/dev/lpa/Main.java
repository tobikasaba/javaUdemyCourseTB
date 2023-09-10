package dev.lpa;

public class Main {
    public static void main(String[] args) {

        var nationalUSParks = new Park[]{
                new Park("Yellowstone", "Park", "44.4882, -110.5916"),
                new Park("Grand Canyon", "Park", "36.1085, -112.0965"),
                new Park("Yosemite", "Park", "37.8855, -119.5360")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[]{
                new River("Mississippi",
                        "River", "47.2160, -95.2348 / 29.1566, -89.2495, " +
                        "35.1556 / -90.0659"),
                new River("Missouri",
                        "River", "45.9239, -111.4983 / 38.8146, -90.1218")
        };

        River redRiver = new River("Red River", "River", "33.93170582073903, -96.31862301364214");

        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.addElementToList(redRiver,
                new River("Colorado",
                        "River", "40.4708, -105.8286 / 31.7811, -114.7724"),
                new River("Delaware", "River",
                        "42.2026, -75.00836 / 39.4955, -75.5592")
        );
        riverLayer.renderLayer();

    }
}