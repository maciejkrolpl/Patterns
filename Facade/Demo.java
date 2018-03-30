package Facade;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int month = today.getMonthValue();
        Seasons season;

        if (month>=3 && month <=5) {
            season = Seasons.SPRING;
        } else if (month>=6 && month <=8) {
            season = Seasons.AUTUMN;
        } else if (month >= 9 && month <=11) {
            season = Seasons.SUMMER;
        } else {
            season = Seasons.WINTER;
        }

        WearFacade wearFacade = new WearFacade(season);
        wearFacade.wear();

    }
}
