package Facade;

public class Shoes {
    private Seasons season;

    public Shoes(Seasons season) {
        this.season = season;
    }

    public String wearShoes() {
        switch (season) {
            case WINTER: return "winter shoes";
            case AUTUMN: return "waterprof boots";
            case SPRING: return "sneakers";
            case SUMMER: return "sandals (WITHOUT SOCKS!)";
            default: return "";
        }
    }
}
