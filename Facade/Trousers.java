package Facade;

public class Trousers {
    private Seasons season;

    public Trousers(Seasons season) {
        this.season = season;
    }

    public String wearTrousers() {
        switch (season) {
            case WINTER: return "underpants and trousers";
            case SUMMER: return "trunks";
            default: return "jeans";
        }
    }
}
