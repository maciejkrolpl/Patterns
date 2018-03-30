package Facade;

public class WearFacade {
    private Seasons season;


    public WearFacade(Seasons season) {
        this.season = season;
    }

    public void wear() {

        HeadClothes headClothes = new HeadClothes(season);
        Shoes shoes = new Shoes(season);
        Trousers trousers = new Trousers(season);
        ShirtsAndOthers shirtsAndOthers = new ShirtsAndOthers(season);

        System.out.printf("Hello, it's %s, you should wear %s, %s, %s and %s.",
                season,
                headClothes.wearHeadClothes(),
                shoes.wearShoes(),
                shirtsAndOthers.wearShirtsAndOthers(),
                trousers.wearTrousers());
    }




}
