package Facade;

public class HeadClothes {

    private Seasons season;

    HeadClothes(Seasons season) {
        this.season = season;
    }

    public String wearHeadClothes() {
        switch (season) {
            case WINTER: return "winter hat";
            case AUTUMN: return "baseball hat";
            default: return "hat if you need one";
        }
    }
}
