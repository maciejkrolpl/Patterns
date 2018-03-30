package Facade;

public class ShirtsAndOthers {
    private Seasons season;

    public ShirtsAndOthers(Seasons season) {
        this.season = season;
    }

    public String wearShirtsAndOthers() {

        String firstLayer = "t-shirt";
        String secondLayer = "hoodie";
        String thirdLayer = "jacket";
        String delim = ", ";

        switch (season) {
            case WINTER: return String.join(delim, firstLayer, secondLayer, thirdLayer);
            case SUMMER: return firstLayer;
            default: return String.join(delim, firstLayer, secondLayer);
        }
    }
}
